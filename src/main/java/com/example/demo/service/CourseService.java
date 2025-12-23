package com.example.works.service;

import java.util.List;

import com.example.works.entity.Course;

public interface CourseService {

    Course createCourse(Course course);

    List<Course> getAllCourses();

    Course getCourseById(Long id);
}
