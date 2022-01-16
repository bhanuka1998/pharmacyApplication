package com.assignment.leePharmacy.pharmacyApplication.service;

import com.assignment.leePharmacy.pharmacyApplication.dto.StockDrugDTO;
import com.assignment.leePharmacy.pharmacyApplication.model.Stock;

import java.util.List;
import java.util.Optional;

public interface StockService {
    void addStock(Stock stock);

    List<Stock> getAllStocks();

    Optional<Stock> updateStock(Integer id, Stock stock);


    Stock getStockByID(Integer id);


    void deleteStock(Integer id);

    List<StockDrugDTO> getAllDetailsOfStock();

    Optional<Stock> reduceStockQty(Integer id, int qty);

}
