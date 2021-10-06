package com.assignment.leePharmacy.pharmacyApplication.repository;

import com.assignment.leePharmacy.pharmacyApplication.dto.DrugDTO;
import com.assignment.leePharmacy.pharmacyApplication.model.Drugs;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface DrugRepository extends CrudRepository<Drugs, Integer> {
    @Query(value = "SELECT new com.assignment.leePharmacy.pharmacyApplication.dto.DrugDTO(d.drugID, d.drugName, b.brandID, b.brandName, c.cat_id, c.cat_name, r.rackNo, d.fullQty, d.price) FROM Drugs d " +
            "JOIN Brand b ON d.brand = b " +
            "JOIN Category c ON d.category = c " +
            "JOIN Rack r ON d.rack = r", nativeQuery = false)
    List<DrugDTO> getAllDrugDetails();
}
