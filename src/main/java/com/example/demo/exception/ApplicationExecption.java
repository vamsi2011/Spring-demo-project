package com.example.demo.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ApplicationExecption extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {Exception.class})
    public ResponseEntity<Object> handleAnyException(Exception ex, WebRequest request) {

        ErrorMessage e = new ErrorMessage();
        e.setCode("101");
        e.setMessage("Unable to find the objet which you are looking");

        return new ResponseEntity<>(e, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
