package com.assignment.leePharmacy.pharmacyApplication.control;

import com.assignment.leePharmacy.pharmacyApplication.dto.DrugDTO;
import com.assignment.leePharmacy.pharmacyApplication.model.Drugs;
import com.assignment.leePharmacy.pharmacyApplication.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DrugController {

    @Autowired
    private DrugService drugService;

    @RequestMapping(method = RequestMethod.POST, value = "/saveDrug")
    public void saveDrug(@RequestBody Drugs drugs){
        drugService.saveDrug(drugs);
    }

    @RequestMapping("/getAllDrugs")
    public List<Drugs> getAllDrugs(){
        return drugService.getAllDrugs();
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/updateDrug/{id}")
    public void updateDrugs(@PathVariable Integer id, @RequestBody Drugs drugs){
        drugService.updateDrug(id, drugs);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/deleteDrug/{id}")
    public void deleteDrug(@PathVariable Integer id){
        drugService.deleteDrug(id);
    }

    @GetMapping("/getAllDrugsByNames")
    public List<DrugDTO> getAllByNames(){
        return drugService.getAllByNames();
    }

    @GetMapping("/getDrugById/{id}")
    public  Drugs getDrugById(@PathVariable Integer id){
        return drugService.getByID(id);
    }

}
