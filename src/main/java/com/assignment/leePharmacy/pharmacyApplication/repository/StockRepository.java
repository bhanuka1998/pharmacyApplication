package com.assignment.leePharmacy.pharmacyApplication.repository;

import com.assignment.leePharmacy.pharmacyApplication.dto.StockDrugDTO;
import com.assignment.leePharmacy.pharmacyApplication.model.Stock;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StockRepository extends CrudRepository<Stock, Integer> {

    @Query(value = "SELECT new com.assignment.leePharmacy.pharmacyApplication.dto.StockDrugDTO(s.stockID, d.drugID, d.drugName, s.mfDate, s.expDate, s.qty, s.rcvdDate, d.price) FROM Stock s" +
            " JOIN Drugs d ON s.drugs = d", nativeQuery = false)
    List<StockDrugDTO> getAllStockDetails();

}
