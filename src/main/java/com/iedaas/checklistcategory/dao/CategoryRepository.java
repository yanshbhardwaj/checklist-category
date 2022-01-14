package com.iedaas.checklistcategory.dao;

import com.iedaas.checklistcategory.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
