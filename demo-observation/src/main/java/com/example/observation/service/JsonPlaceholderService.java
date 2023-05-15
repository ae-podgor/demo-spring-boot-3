package com.example.observation.service;

import com.example.observation.model.EntityExample;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

//@HttpExchange()
public interface JsonPlaceholderService {

    @GetExchange("/posts")
    List<EntityExample> getPostsList();



}
