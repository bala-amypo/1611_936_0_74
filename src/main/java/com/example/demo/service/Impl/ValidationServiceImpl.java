package com.example.demo.service.Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.stereotype.Service;
import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;
import java.util.List;
import com.example.demo.repository.StudentRepo;
@Service

public class ValidationServiceImpl implements ValidationService{
    @Autowired ValidationRepo student;
    @Override
    public ValidationEntity postData(ValidationEntity stu){
        //StudentEntity getData();
        return student.save(stu);
    }
}