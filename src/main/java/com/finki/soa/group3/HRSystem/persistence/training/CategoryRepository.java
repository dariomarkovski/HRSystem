package com.finki.soa.group3.HRSystem.persistence.training;

import com.finki.soa.group3.HRSystem.model.training.Category;
import com.finki.soa.group3.HRSystem.model.training.Course;
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