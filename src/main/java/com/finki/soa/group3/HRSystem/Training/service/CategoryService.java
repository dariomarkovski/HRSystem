package com.finki.soa.group3.HRSystem.Training.service;

import com.finki.soa.group3.HRSystem.Training.Model.Category;
import org.springframework.stereotype.Service;

@Service
public interface CategoryService {
    public Category createCategory(Category category);
    public Category updateCategory(Category category);
    public long deleteCategory(long categoryId);
}
