package com.example.demo.service.Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Timestamp;
import com.example.demo.service.TimestampService;
import java.util.List;
import com.example.demo.repository.TimestampRepo;
@Service

public class TimestampServiceImpl implements TimestampService{
    @Autowired TimestampRepo student;
    //save()
    //findAll()
    //findById()
    //deleteById();
    //existById();
    @Override
    public Timestamp tpostData(Timestamp stu){
        //StudentEntity getData();
        return student.save(stu);
    }
    
}
