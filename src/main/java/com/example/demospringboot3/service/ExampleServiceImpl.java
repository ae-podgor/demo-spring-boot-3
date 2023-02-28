package com.example.demospringboot3.service;

import com.example.demospringboot3.model.EntityExample;
import lombok.Data;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@Data
public class ExampleServiceImpl implements ExampleService {

    private final RestTemplate restTemplate;

    @Override
    public List<EntityExample> getPostsList() {

        ResponseEntity<List<EntityExample>> exchange = restTemplate.exchange("https://jsonplaceholder.typicode.com/posts",
                HttpMethod.GET, null,
                new ParameterizedTypeReference<List<EntityExample>>() {
                });

        return exchange.getBody();
    }




}
