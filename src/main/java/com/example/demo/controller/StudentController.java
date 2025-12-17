package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.StudentEntity;
imp
@RestController
public class StudentController{
    @Autowired StudentService ser;
    @PostMapping("/post");
    public StudentEntity sendData(@RequestBody StudentEntity  stu){

    }
}