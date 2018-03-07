package com.finki.soa.group3.HRSystem.Training.repository;

import com.finki.soa.group3.HRSystem.Training.Model.Category;
import com.finki.soa.group3.HRSystem.Training.Model.Course;
import com.finki.soa.group3.HRSystem.Training.Model.Video;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
   // Iterable<Category> findAllByCategory(Video video);
    //  Iterable<Category> findAllByCategory(Course course);

    Iterable<Category> findAllById(long categoryId);
    Iterable<Category> findAllByCourses(Course course);

    @Transactional
    long deleteById(long categoryId);
}