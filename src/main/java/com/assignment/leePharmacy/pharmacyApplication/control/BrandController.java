package com.assignment.leePharmacy.pharmacyApplication.control;

import com.assignment.leePharmacy.pharmacyApplication.dto.BrandCatDTO;
import com.assignment.leePharmacy.pharmacyApplication.model.Brand;
import com.assignment.leePharmacy.pharmacyApplication.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BrandController {
    @Autowired
    BrandService brandService;

    @RequestMapping(method = RequestMethod.POST, value = "/saveBrand")
    public void saveBand(@RequestBody Brand brand){
        brandService.saveBrand(brand);
    }

    @RequestMapping("/getAllBrands")
    public List<Brand> getAllBrands(){
        return brandService.getAllBrands();
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/updateBrand/{id}")
    public void updateBrand(@RequestBody Brand brand, @PathVariable Integer id){
        brandService.updateBrand(brand, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteBrand/{id}")
    public void deleteBrand(@PathVariable Integer id){
        brandService.deleteBrand(id);
    }

    @GetMapping("/getAllByName")
    public List<BrandCatDTO> getAllCategoryNames(){
        return brandService.getAllCategoryNames();
    }
}
