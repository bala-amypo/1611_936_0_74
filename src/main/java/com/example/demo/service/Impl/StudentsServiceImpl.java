package com.example.works.service.impl;

import com.example.works.entity.Student;
import com.example.works.repository.StudentsRepository;
import com.example.works.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsServiceImpl implements StudentsService {

    @Autowired
    private StudentsRepository studentRepository;

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> fetchAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student fetchStudentById(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
    }
}
