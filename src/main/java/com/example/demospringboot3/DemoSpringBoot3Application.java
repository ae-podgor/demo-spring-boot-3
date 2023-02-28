package com.example.demospringboot3;

import com.example.demospringboot3.model.EntityExample;
import com.example.demospringboot3.repository.ExampleRepository;
import com.example.demospringboot3.service.ExampleService;
import com.example.demospringboot3.service.JsonPlaceholderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
//import org.springframework.web.reactive.function.client.WebClient;
//import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

import java.util.List;

@SpringBootApplication
public class DemoSpringBoot3Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringBoot3Application.class, args);
        System.out.println("Hello from Spring Boot 3!");
    }

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

//	@Bean
//	CommandLineRunner commandLineRunnerOld(ExampleRepository exampleRepository, ExampleService exampleService) {
//		return args -> {
//			List<EntityExample> postsList = exampleService.getPostsList();
//			exampleRepository.saveAll(postsList);
//
//		};
//	}

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
