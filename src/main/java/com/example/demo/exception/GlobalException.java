package com.example.demo.exception;

import 
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException{
    @ExceptionHandler(ValidationException.class)
    public ResponseBody<String> handleValidationException(ValidationException ex){

    }
}
