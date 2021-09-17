package com.assignment.leePharmacy.pharmacyApplication.service;

import com.assignment.leePharmacy.pharmacyApplication.model.Stock;
import com.assignment.leePharmacy.pharmacyApplication.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StockServiceImpl implements StockService{

    @Autowired
    private StockRepository stockRepository;

    @Override
    public void addStock(Stock stock) {
        stockRepository.save(stock);
    }

    @Override
    public List<Stock> getAllStocks() {
        List<Stock> stockList = new ArrayList<>();
        stockRepository.findAll().forEach(stockList::add);
        return stockList;
    }

    @Override
    public void updateStock(Integer id, Stock stock) {
        stock.setStockID(id);
        stockRepository.save(stock);
    }

    @Override
    public void deleteStock(Integer id) {
        stockRepository.deleteById(id);
    }
}
