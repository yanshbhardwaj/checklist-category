package com.iedaas.checklistcategory.services;

import com.iedaas.checklistcategory.dao.CategoryRepository;
import com.iedaas.checklistcategory.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CategoryServices {

    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> getStatuses(){
        return categoryRepository.findAll();
    }

    public Category addStatus(Category status){
        return categoryRepository.save(status);
    }
}
