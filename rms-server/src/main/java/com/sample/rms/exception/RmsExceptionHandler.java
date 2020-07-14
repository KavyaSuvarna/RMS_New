package com.sample.rms.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RmsExceptionHandler {
    @ExceptionHandler(value = RmsRequestException.class)
    public ResponseEntity<Object> handleRequestException(RmsRequestException exception){
        RmsException e = new RmsException(exception.getMessage(), exception, HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(e, HttpStatus.NOT_FOUND);

    }
}
