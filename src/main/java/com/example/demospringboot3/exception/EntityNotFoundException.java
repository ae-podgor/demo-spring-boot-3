package com.example.demospringboot3.exception;

public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException(Integer id) {
        super(String.format("No such id %s in database", id));
    }
}
