package com.assignment.leePharmacy.pharmacyApplication.web;

import com.assignment.leePharmacy.pharmacyApplication.model.Brand;
import com.assignment.leePharmacy.pharmacyApplication.model.Category;
import com.assignment.leePharmacy.pharmacyApplication.model.Drugs;
import com.assignment.leePharmacy.pharmacyApplication.repository.DrugRepository;
import com.assignment.leePharmacy.pharmacyApplication.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@Controller
public class DrugWebController {
    @Autowired
    private DrugService drugService;

    @Autowired
    private BrandService brandService;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private RackService rackService;

    @Autowired
    private SupplierService supplierService;

    @GetMapping("/viewDrugs")
    public String getAllDrugs(Model model){
        model.addAttribute("drug", drugService.getAllByNames());
        return "viewdrugs";
    }

    @GetMapping("/showAddDrugForm")
    public String showAddDrugForm(Drugs drugs, Model model){
        model.addAttribute("brand", brandService.getAllBrands());
        model.addAttribute("category", categoryService.getAllCategories());
        model.addAttribute("rack", rackService.getAllRacks());
        model.addAttribute("supplier", supplierService.getAllSuppliers());
        return "adddrug";
    }

    @PostMapping("/addNewDrug")
    public String addNewDrug(@Valid Drugs drugs, BindingResult result, Model model){
        if(result.hasErrors()){
            return  "adddrug";
        }
        drugService.saveDrug(drugs);
        return "redirect:/viewDrugs";
    }

}
