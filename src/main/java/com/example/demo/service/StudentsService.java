package com.example.demo.service;

import com.example.demo.entity.Student;
import java.util.List;

public interface StudentsService {

    Student addStudent(Student student);

    List<Student> fetchAllStudents();

    Student fetchStudentById(Long id);
}
