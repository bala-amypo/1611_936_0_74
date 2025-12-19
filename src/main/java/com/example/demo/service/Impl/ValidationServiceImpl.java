package com.example.demo.service.Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.stereotype.Service;
import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;
import com.example.demo.service.ValidationService;
import com.example.demo.entity.ValidationEntity;

import java.util.List;
import com.example.demo.repository.StudentRepo;
import com.example.demo.repository.ValidationRepo;
@Service

public class ValidationServiceImpl implements ValidationService{
    @Autowired ValidationRepo student;
    @Override
    public ValidationEntity vpostData(ValidationEntity stu){
        //StudentEntity getData();
        return student.save(stu);
    }
    @Override
    public ValidationEntity vgetData(long id){
        return student.findById(id).orElse(null);
    }
}