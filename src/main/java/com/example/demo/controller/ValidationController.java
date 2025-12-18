package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.ValidationEntity;
import com.example.demo.service.ValidationService;
@RestController
public class ValidationController{
    @Autowired ValidationService ser;
    @PostMapping("/post")
    
    public ValidationService sendData(@Valid @RequestBody ValidationEntity entity){
        return ser.postData(entity);
    }

    @GetMapping("/get")
    public List<ValidationEntity> getData(){
        return ser.getAllData();
    }