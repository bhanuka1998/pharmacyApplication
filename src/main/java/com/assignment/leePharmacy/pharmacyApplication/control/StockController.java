package com.assignment.leePharmacy.pharmacyApplication.control;

import com.assignment.leePharmacy.pharmacyApplication.dto.StockDrugDTO;
import com.assignment.leePharmacy.pharmacyApplication.model.Stock;
import com.assignment.leePharmacy.pharmacyApplication.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StockController {

    @Autowired
    private StockService stockService;

    @RequestMapping(method = RequestMethod.POST, value = "/addStock")
    public void addStock(@RequestBody Stock stock){
        stockService.addStock(stock);
    }

    @RequestMapping("/getAllStocks")
    public List<Stock> getAllStock(){
        return stockService.getAllStocks();
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/updateStock/{id}")
    public void updateStock(@PathVariable Integer id, @RequestBody Stock stock){
        stockService.updateStock(id, stock);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/deleteStock/{id}")
    public void deleteStock(@PathVariable Integer id){
        stockService.deleteStock(id);
    }

    @GetMapping("/getAllStockDetails")
    public List<StockDrugDTO> getAllStockDetails(){
        return stockService.getAllDetailsOfStock();
    }
}
