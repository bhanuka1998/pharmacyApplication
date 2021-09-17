package com.assignment.leePharmacy.pharmacyApplication.service;

import com.assignment.leePharmacy.pharmacyApplication.model.Category;
import com.assignment.leePharmacy.pharmacyApplication.model.Pharmacist;
import com.assignment.leePharmacy.pharmacyApplication.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void addCategory(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public List<Category> getAllCategories() {
        List<Category> catList = new ArrayList<>();
        categoryRepository.findAll().forEach(catList::add);
        return  catList;
    }

    @Override
    public void deleteCategory(Integer id) {
        categoryRepository.deleteById(id);
    }

    @Override
    @Transactional
    public Optional<Category> updateCategory(Integer id, Category category) {
        return categoryRepository.findById(id).map(e->{
            e.setCat_name(category.getCat_name());
            return e;
        });
    }

    @Override
    public Category getCategorytByID(Integer id) {
        Optional<Category> cat = Optional.ofNullable(categoryRepository.
                findById(id).orElseThrow(()-> new IllegalArgumentException("Invalid ID")));
        Category category= cat.get();
        return category;
    }


}
