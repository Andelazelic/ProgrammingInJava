package com.andelazelic.vjezba6_1.exceptionHandler;

public class DataNotFoundException extends RuntimeException {
    public DataNotFoundException(String message) {
        super(message);
    }
}