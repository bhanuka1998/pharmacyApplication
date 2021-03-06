package com.assignment.leePharmacy.pharmacyApplication.web;

import com.assignment.leePharmacy.pharmacyApplication.model.Category;
import com.assignment.leePharmacy.pharmacyApplication.model.Pharmacist;
import com.assignment.leePharmacy.pharmacyApplication.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class CategoryWebController {
    @Autowired
    CategoryService categoryService;


    @GetMapping("/viewCategories")
    public String viewCategories(Model model){
        model.addAttribute("category", categoryService.getAllCategories());
        return "viewcategory";
    }

    @GetMapping("/showAddCategoryForm")
    public String showAddPharmacistForm(Category category){
        return "addcategory";
    }

    @PostMapping("/addNewCategory")
    public String addNewCategory(@Valid Category category, BindingResult result, Model model){
        if(result.hasErrors()){
            return  "addcategory";
        }
        categoryService.addCategory(category);
        return "redirect:/viewCategories";
    }

    @GetMapping("/showUpdateCategory/{id}")
    public String showEditCategoryForm(@PathVariable("id") Integer id, Model model){
        model.addAttribute("category", categoryService.getCategorytByID(id));
        return "editcategory";
    }

    @PostMapping("/updateCategory/{id}")
    public String updateCategory(@PathVariable ("id") Integer id, @Valid Category category, BindingResult result, Model model){
        if(result.hasErrors()){
            category.setCat_id(id);
            model.addAttribute("category", category);
            return "editcategory";
        }
        Optional<Category> category1 = categoryService.updateCategory(id, category);
        return "redirect:/viewCategories";
    }


    @GetMapping("/deleteCategory/{id}")
    public String deleteCategory(@PathVariable ("id") Integer id, Model model) {
        categoryService.deleteCategory(id);
        return "redirect:/viewCategories";
    }
}
