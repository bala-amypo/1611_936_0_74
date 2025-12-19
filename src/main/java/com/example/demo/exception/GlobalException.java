package com.example.demo.exception;

import com.example.demo.exception.ValidationException;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException{
    @ExceptionHandler(ValidationException.class)
    public ResponseBody<String> handleValidationException(ValidationException ex){
        return new ResponseBody<String>(ex.getMessage(),HttpStatio);
    }
}
