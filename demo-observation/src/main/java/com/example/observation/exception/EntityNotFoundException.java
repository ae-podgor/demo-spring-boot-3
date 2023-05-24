package com.example.observation.exception;

public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException(Integer id) {
        super(String.format("No such id %s in database", id));
    }
}
