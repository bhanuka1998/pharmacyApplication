package com.assignment.leePharmacy.pharmacyApplication.service;

import com.assignment.leePharmacy.pharmacyApplication.dto.BrandCatDTO;
import com.assignment.leePharmacy.pharmacyApplication.model.Brand;

import java.util.List;
import java.util.Optional;

public interface BrandService {
    void saveBrand(Brand brand);

    List<Brand> getAllBrands();

    Optional<Brand> updateBrand(Brand brand, Integer id);

    void deleteBrand(Integer id);

    Brand getBrandById(Integer id);

    List<BrandCatDTO> getAllCategoryNames();
}
