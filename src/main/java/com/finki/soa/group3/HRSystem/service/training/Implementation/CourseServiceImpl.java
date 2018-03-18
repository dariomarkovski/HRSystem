package com.finki.soa.group3.HRSystem.service.training.Implementation;

import com.finki.soa.group3.HRSystem.model.training.Course;
import com.finki.soa.group3.HRSystem.service.training.CourseService;

public class CourseServiceImpl implements CourseService {
    private final CourseService courseService;

    public CourseServiceImpl(CourseService courseService) {
        this.courseService = courseService;
    }

    @Override
    public Course createCourse(Course course) {
        return courseService.createCourse(course);
    }

    @Override
    public Course updateCourse(Course course) {
        return courseService.updateCourse(course);
    }

    @Override
    public long deleteCourse(long courseId) {
        return courseService.deleteCourse(courseId);
    }
}
