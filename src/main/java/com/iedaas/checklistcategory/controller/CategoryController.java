package com.iedaas.checklistcategory.controller;

import com.iedaas.checklistcategory.entity.Category;
import com.iedaas.checklistcategory.services.CategoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    CategoryServices categoryServices;

    @GetMapping("/category")
    public List<Category> getStatuses(){
        return categoryServices.getStatuses();
    }

    @PostMapping("/category")
    public Category addStatus(@RequestBody Category status){
        return categoryServices.addStatus(status);
    }
}
