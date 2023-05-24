package com.example.observation.repository;


import com.example.observation.model.EntityExample;
import org.springframework.data.repository.ListCrudRepository;

public interface ExampleRepository extends ListCrudRepository<EntityExample, Integer> {


}
