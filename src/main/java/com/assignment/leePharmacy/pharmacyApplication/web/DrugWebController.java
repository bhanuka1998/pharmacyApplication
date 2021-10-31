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
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

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

    @GetMapping("/showUpdateDrugForm/{id}")
    public String showEditDrugForm(@PathVariable("id") Integer id, Model model){
        model.addAttribute("drugs", drugService.getByID(id));
        return "editdrug";
    }

    @PostMapping("/updateDrug/{id}")
    public String updateDrug(@PathVariable ("id") Integer id, @Valid Drugs drugs, BindingResult result, Model model){
        if(result.hasErrors()){
            drugs.setDrugID(id);
            model.addAttribute("drugs", drugs);
            return "editdrug";
        }
        Optional<Drugs> drugs1 = drugService.updateDrug(id, drugs);
        return "redirect:/viewDrugs";
    }

    @GetMapping("/deleteDrug/{id}")
    public String deleteDrug(@PathVariable ("id") Integer id, Model model) {
        drugService.deleteDrug(id);
        return "redirect:/viewDrugs";
    }

}
