package com.example.works.controller;

import com.example.works.entity.Student;
import com.example.works.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentsService studentService;

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentsService.addStudent(student);
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentsService.fetchAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Long id) {
        return studentsService.fetchStudentById(id);
    }
}
