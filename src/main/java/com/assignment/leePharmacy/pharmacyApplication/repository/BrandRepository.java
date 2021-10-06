package com.assignment.leePharmacy.pharmacyApplication.repository;

import com.assignment.leePharmacy.pharmacyApplication.dto.BrandCatDTO;
import com.assignment.leePharmacy.pharmacyApplication.model.Brand;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface BrandRepository extends  CrudRepository<Brand, Integer>{
    @Query(value = "SELECT new com.assignment.leePharmacy.pharmacyApplication.dto.BrandCatDTO(b.brandID, b.brandName, c.cat_id, c.cat_name) FROM Brand b JOIN Category c ON b.category = c", nativeQuery = false)
    List<BrandCatDTO> getAllBrandByCategory();
}
