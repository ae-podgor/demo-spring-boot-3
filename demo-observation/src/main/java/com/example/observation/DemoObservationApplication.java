package com.example.observation;

import com.example.observation.model.EntityExample;
import com.example.observation.repository.ExampleRepository;
import com.example.observation.service.ExampleService;
import com.example.observation.service.NewExampleService;
import io.micrometer.observation.Observation;
import io.micrometer.observation.ObservationRegistry;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

import java.util.List;

@SpringBootApplication
public class DemoObservationApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoObservationApplication.class, args);
        System.out.println("Hello from Spring Boot 3!");
    }


    // old approach
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

	@Bean
	CommandLineRunner commandLineRunnerOld(ExampleRepository exampleRepository, ExampleService exampleService,
                                           ObservationRegistry observationRegistry) {
		return args -> {
            List<EntityExample> postsList = Observation
                    .createNotStarted("json-place-holder.load-posts.old-approach", observationRegistry)
                    .lowCardinalityKeyValue("some-value", "100")
                    .observe(exampleService::getPostsList);

            Observation
                    .createNotStarted("post-repository.save-all.old-approach",observationRegistry)
                    .observe(() -> exampleRepository.saveAll(postsList));
		};
	}


    // new approach
    @Bean
    CommandLineRunner commandLineRunnerNew(ExampleRepository exampleRepository, ObservationRegistry observationRegistry) {
        return args -> {
            WebClient client = WebClient.builder().baseUrl("https://jsonplaceholder.typicode.com").build();
            HttpServiceProxyFactory proxyFactory = HttpServiceProxyFactory
                    .builder(WebClientAdapter.forClient(client)).build();
            // implementation of JsonPlaceholderService interface
            NewExampleService newExampleService = proxyFactory.createClient(NewExampleService.class);

            List<EntityExample> posts = Observation
                    .createNotStarted("json-place-holder.load-posts.new-approach", observationRegistry)
                    .lowCardinalityKeyValue("some-value", "100")
                    .observe(newExampleService::getPostsList);

            Observation
                    .createNotStarted("post-repository.save-all.new-approach",observationRegistry)
                    .observe(() -> exampleRepository.saveAll(posts));
        };
    }
}
