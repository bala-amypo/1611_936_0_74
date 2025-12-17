package com.example.demo.service.Impl;
import org.springframework.sterotype.Service;
import com.example.demo.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{
    @Autowired StudentRepo student;
    //save()
    //findAll()
    //findById()
    //deleteById();
    //existById();
    public StudentEntity postData(StudentEntity stu){

    }
}
