package com.assignment.leePharmacy.pharmacyApplication.web;

import com.assignment.leePharmacy.pharmacyApplication.model.Brand;
import com.assignment.leePharmacy.pharmacyApplication.model.Pharmacist;
import com.assignment.leePharmacy.pharmacyApplication.repository.BrandRepository;
import com.assignment.leePharmacy.pharmacyApplication.service.BrandService;
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
public class BrandWebController {
    @Autowired
    private BrandService brandService;

    @Autowired
    private BrandRepository brandRepository;

    @GetMapping("/viewBrands")
    public String getAllBrands(Model model){
        //model.addAttribute("brand", brandService.getAllBrands());
        model.addAttribute("brand", brandService.getAllCategoryNames());
        return "viewbrands";
    }

    @GetMapping("/showUpdateBrand/{id}")
    public String showEditBrandForm(@PathVariable("id") Integer id, Model model){
        model.addAttribute("pharmacist", brandService.getBrandById(id));
        return "editbrand";
    }

    @PostMapping("/updateBrand/{id}")
    public String updateBrand(@PathVariable ("id") Integer id, @Valid Brand brand, BindingResult result, Model model){
        if(result.hasErrors()){
            brand.setBrandID(id);
            model.addAttribute("brand", brand);
            return "editpharmacist";
        }
        Optional<Brand> brand1 = brandService.updateBrand(brand, id);
        return "redirect:/viewPharmacist";
    }

    @GetMapping("/deleteBrand/{id}")
    public String deletePharmacist(@PathVariable ("id") Integer id, Model model) {
        brandService.deleteBrand(id);
        return "redirect:/viewPharmacist";
    }


}
