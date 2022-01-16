package com.assignment.leePharmacy.pharmacyApplication.control;

import com.assignment.leePharmacy.pharmacyApplication.model.Pharmacist;
import com.assignment.leePharmacy.pharmacyApplication.service.PharmacistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PharmacistController {
    @Autowired
    private PharmacistService pharmacistService;

    @RequestMapping(method = RequestMethod.POST, value = "/savePharmacist")
    public void savePharmacist(@RequestBody Pharmacist pharmacist){
        pharmacistService.savePharmacist(pharmacist);
    }

    @RequestMapping("/getAllPharmacists")
    public List<Pharmacist> getAllPharmacists(){
        return pharmacistService.getAllPharmacists();
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/updatePharmacist/{id}")
    public void updatePharmacist(@PathVariable Integer id, @RequestBody Pharmacist pharmacist){
        pharmacistService.updatePharmacist(id, pharmacist);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/deletePharmacist/{id}")
    public void deleteStudent(@PathVariable Integer id){
        pharmacistService.deletePharmacist(id);
    }


}
