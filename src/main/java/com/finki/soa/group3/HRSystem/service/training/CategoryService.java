package com.finki.soa.group3.HRSystem.service.training;

import com.finki.soa.group3.HRSystem.model.training.Category;
import org.springframework.stereotype.Service;

@Service
public interface CategoryService {
    public Category createCategory(Category category);
    public Category updateCategory(Category category);
    public long deleteCategory(long categoryId);
}
