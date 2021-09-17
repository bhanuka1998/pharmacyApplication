package com.assignment.leePharmacy.pharmacyApplication.service;

import com.assignment.leePharmacy.pharmacyApplication.model.Category;
import com.assignment.leePharmacy.pharmacyApplication.model.Pharmacist;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    void addCategory(Category category);

    List<Category> getAllCategories();

    void deleteCategory(Integer id);

    Optional<Category> updateCategory(Integer id, Category category);

    Category getCategorytByID(Integer id);
}
