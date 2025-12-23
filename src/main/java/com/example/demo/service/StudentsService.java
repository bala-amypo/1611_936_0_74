package com.example.works.service;

import com.example.works.entity.Student;
import java.util.List;

public interface StudentService {

    Student addStudent(Student student);

    List<Student> fetchAllStudents();

    Student fetchStudentById(Long id);
}
