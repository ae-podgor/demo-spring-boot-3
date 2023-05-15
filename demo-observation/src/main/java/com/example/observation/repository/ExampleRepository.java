package com.example.observation.repository;


import com.example.observation.model.EntityExample;
import org.springframework.data.repository.ListCrudRepository;

/**
 * Find out more in *spring-data-2022* module
 */
public interface ExampleRepository extends ListCrudRepository<EntityExample, Integer> {


}
