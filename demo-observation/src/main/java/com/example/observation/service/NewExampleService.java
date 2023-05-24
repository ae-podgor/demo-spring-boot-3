package com.example.observation.service;

import com.example.observation.model.EntityExample;
import org.springframework.web.service.annotation.GetExchange;

import java.util.List;

//@HttpExchange()
public interface NewExampleService {

    @GetExchange("/posts")
    List<EntityExample> getPostsList();


}
