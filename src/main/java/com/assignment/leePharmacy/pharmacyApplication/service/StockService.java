package com.assignment.leePharmacy.pharmacyApplication.service;

import com.assignment.leePharmacy.pharmacyApplication.model.Stock;

import java.util.List;

public interface StockService {
    void addStock(Stock stock);

    List<Stock> getAllStocks();

    void updateStock(Integer id, Stock stock);

    void deleteStock(Integer id);
}
