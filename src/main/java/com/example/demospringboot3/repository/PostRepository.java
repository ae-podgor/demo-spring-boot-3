package com.example.demospringboot3.repository;

import com.example.demospringboot3.model.EntityExample;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;

public interface PostRepository extends ListCrudRepository<EntityExample, Integer> {
}
