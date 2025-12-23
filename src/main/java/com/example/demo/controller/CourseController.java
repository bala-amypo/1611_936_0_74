package com.example.works.controller;

import com.example.works.entity.Course;
import com.example.works.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping
    public Course addCourse(@RequestBody Course course) {
        return courseService.createCourse(course);
    }

    @GetMapping
    public List<Course> fetchCourses() {
        return courseService.getAllCourses();
    }

    @GetMapping("/{id}")
    public Course fetchCourseById(@PathVariable Long id) {
        return courseService.getCourseById(id);
    }
}
