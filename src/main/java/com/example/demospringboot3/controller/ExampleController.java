package com.example.demospringboot3.controller;

import com.example.demospringboot3.exception.EntityNotFoundException;
import com.example.demospringboot3.model.EntityExample;
import com.example.demospringboot3.repository.ExampleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
@RequiredArgsConstructor
public class ExampleController {

    private final ExampleRepository exampleRepository;

    @GetMapping
    public List<EntityExample> findAll() {
        return exampleRepository.findAll();
    }

    @GetMapping("/{id}")
    public EntityExample findById(@PathVariable Integer id) {
        return exampleRepository.findById(id).orElseThrow(() -> new EntityNotFoundException(id));
    }

}

