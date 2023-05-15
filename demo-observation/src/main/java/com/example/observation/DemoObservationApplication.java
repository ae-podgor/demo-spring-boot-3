package com.example.observation;

import com.example.observation.model.EntityExample;
import com.example.observation.repository.ExampleRepository;
import com.example.observation.service.ExampleService;
import io.micrometer.observation.Observation;
import io.micrometer.observation.ObservationRegistry;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootApplication
public class DemoObservationApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoObservationApplication.class, args);
        System.out.println("Hello from Spring Boot 3!");
    }

    /**
     * Find out about new HTTP interfaces in *http-interfaces* module
     */
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

	@Bean
	CommandLineRunner commandLineRunnerOld(ExampleRepository exampleRepository, ExampleService exampleService,
                                           ObservationRegistry observationRegistry) {
		return args -> {
            List<EntityExample> postsList = Observation
                    .createNotStarted("json-place-holder.load-posts", observationRegistry)
                    .lowCardinalityKeyValue("some-value", "100")
                    .observe(exampleService::getPostsList);

            Observation
                    .createNotStarted("post-repository.save-all",observationRegistry)
                    .observe(() -> exampleRepository.saveAll(postsList));
		};
	}

//    @Bean
//    CommandLineRunner commandLineRunnerNew(ExampleRepository exampleRepository) {
//        return args -> {
//            WebClient client = WebClient.builder().baseUrl("https://jsonplaceholder.typicode.com").build();
//            HttpServiceProxyFactory proxyFactory = HttpServiceProxyFactory.builder(WebClientAdapter.forClient(client)).build();
//            // implementation of JsonPlaceholderService interface
//            JsonPlaceholderService jsonPlaceholderService = proxyFactory.createClient(JsonPlaceholderService.class);
//
//            List<EntityExample> postsList = jsonPlaceholderService.getPostsList();
//            exampleRepository.saveAll(postsList);
//        };
//    }
}
