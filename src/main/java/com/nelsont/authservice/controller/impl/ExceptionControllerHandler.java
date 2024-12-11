package com.nelsont.authservice.controller.impl;

import com.nelsont.authservice.exceptions.AuthException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;

@RestControllerAdvice
public class ExceptionControllerHandler {

    @ExceptionHandler(AuthException.class)
    ResponseEntity<?> handleGameException(AuthException ex) {
        HashMap<String, Object> response = new HashMap<>(){{
            put("message", ex.getMessage());
            put("status", ex.getStatus().value());
        }};
        return ResponseEntity.status(ex.getStatus()).body(response);
    }
}
