package com.example.demo.service.Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;
import java.util.List;
import com.example.demo.repository.StudentRepo;
@Service

public class StudentServiceImpl implements StudentService{
    @Autowired StudentRepo student;
    //save()
    //findAll()
    //findById()
    //deleteById();
    //existById();
    @Override
    public StudentEntity postData(StudentEntity stu){
        //StudentEntity getData();
        return student.save(stu);
    }
    @Override
    public List<StudentEntity>getAllData(){
        return student.findAll();
    }
}
