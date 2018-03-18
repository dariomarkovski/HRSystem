package com.finki.soa.group3.HRSystem.persistence.training;

import com.finki.soa.group3.HRSystem.model.training.Category;
import com.finki.soa.group3.HRSystem.model.training.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface CourseRepository extends CrudRepository<Course, Long> {
    Iterable<Course> findAllBy(Category category);
    Iterable<Course> findCourseById(long id);
}
