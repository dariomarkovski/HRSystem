package com.finki.soa.group3.HRSystem.WEB.training;


import com.finki.soa.group3.HRSystem.model.training.Category;
import com.finki.soa.group3.HRSystem.service.training.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/trainingCategory")

public class TrainingCategoryController {
    CategoryService trainingCategoryService;

    @PostMapping(value = "/addNewTrainingCategory")
    public Category addNewDeviceCategory(@ModelAttribute Category trainingCategory) {
        return trainingCategoryService.createCategory(trainingCategory);
    }

}
