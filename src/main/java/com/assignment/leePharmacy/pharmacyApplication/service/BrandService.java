package com.assignment.leePharmacy.pharmacyApplication.service;

import com.assignment.leePharmacy.pharmacyApplication.model.Brand;

import java.util.List;

public interface BrandService {
    void saveBrand(Brand brand);

    List<Brand> getAllBrands();

    void updateBrand(Brand brand, Integer id);

    void deleteBrand(Integer id);
}
