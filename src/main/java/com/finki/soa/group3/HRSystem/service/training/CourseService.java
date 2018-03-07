package com.finki.soa.group3.HRSystem.service.training;

import com.finki.soa.group3.HRSystem.model.training.Course;
import org.springframework.stereotype.Service;

@Service
public interface CourseService {
    public Course createCourse(Course course);
    public Course updateCourse(Course course);
    public long deleteCourse(long courseId);
}
