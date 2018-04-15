package com.finki.soa.group3.HRSystem.service.training.Implementation;

import com.finki.soa.group3.HRSystem.model.training.Category;
import com.finki.soa.group3.HRSystem.service.training.CategoryService;

public class CategoryServiceImpl implements CategoryService {
    private final CategoryService categoryService;

    public CategoryServiceImpl(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @Override
    public Category createCategory(Category category) {
        return categoryService.createCategory(category);
    }

    @Override
    public Category updateCategory(Category category) {
        return categoryService.updateCategory(category);
    }

    @Override
    public long deleteCategory(long categoryId) {
        return categoryService.deleteCategory(categoryId);
    }
}
