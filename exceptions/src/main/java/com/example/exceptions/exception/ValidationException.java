package com.example.exceptions.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.BAD_REQUEST)
public class ValidationException extends RuntimeException{

    public ValidationException(String message){super(message);}

    public ValidationException(String s, Throwable throwable) {
        super(s, throwable);
    }

}
