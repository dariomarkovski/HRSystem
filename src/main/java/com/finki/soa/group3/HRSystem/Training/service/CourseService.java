package com.finki.soa.group3.HRSystem.Training.service;

import com.finki.soa.group3.HRSystem.Training.Model.Category;
import com.finki.soa.group3.HRSystem.Training.Model.Course;
import org.springframework.stereotype.Service;

@Service
public interface CourseService {
    public Course createCourse(Course course);
    public Course updateCourse(Course course);
    public long deleteCourse(long courseId);
}
