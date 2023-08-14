package com.example.observation.service;

import com.example.observation.model.EntityExample;
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
                HttpMethod.GET, null, new ParameterizedTypeReference<>() {
                });

        return exchange.getBody();
    }

//    static String formatter(Object o) {
//        return switch (o) {
//            case Integer i -> String.format("int %d", i);
//            case Long l    -> String.format("long %d", l);
//            case Double d  -> String.format("double %f", d);
//            case String s  -> String.format("String %s", s);
//            default        -> o.toString();
//        };
//    }

    static String formatter1(Object o) {
        String formatted = "unknown";
        if (o instanceof Integer i) {
            formatted = String.format("int %d", i);
        } else if (o instanceof Long l) {
            formatted = String.format("long %d", l);
        } else if (o instanceof Double d) {
            formatted = String.format("double %f", d);
        } else if (o instanceof String s) {
            formatted = String.format("String %s", s);
        }
        return formatted;
    }



}
