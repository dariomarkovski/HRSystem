package com.finki.soa.group3.HRSystem.Training.repository;

import com.finki.soa.group3.HRSystem.Training.Model.Category;
import com.finki.soa.group3.HRSystem.Training.Model.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {
    Iterable<Course> findAllBy(Category category);
}
