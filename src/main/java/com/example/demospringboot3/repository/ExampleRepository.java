package com.example.demospringboot3.repository;

import com.example.demospringboot3.model.EntityExample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
Spring Data 2022.0 - introducing ListCrudRepository
 */
public interface ExampleRepository extends ListCrudRepository<EntityExample, Integer> {

    /**
     * Find out more in *Additional* section in Notion doc
     */



}
