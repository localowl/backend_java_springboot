package com.localowl.demo.rest;

public class StudentNotfoundException extends RuntimeException{
    public StudentNotfoundException(String message) {
        super(message);
    }

    public StudentNotfoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentNotfoundException(Throwable cause) {
        super(cause);
    }
}
