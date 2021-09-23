package com.assignment.leePharmacy.pharmacyApplication.repository;

import com.assignment.leePharmacy.pharmacyApplication.model.Brand;
import com.assignment.leePharmacy.pharmacyApplication.model.Category;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BrandRepository extends  CrudRepository<Brand, Integer>{
    @Query(nativeQuery = true, value = "SELECT category.cat_name, brand.brand_id, brand.brand_name, brand.cat_id FROM db_lee_pharmacy.brand INNER JOIN category ON brand.cat_id = category.cat_id")
    List<Brand> findByAll();
}
