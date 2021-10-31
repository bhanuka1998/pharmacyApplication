package com.assignment.leePharmacy.pharmacyApplication.web;

import com.assignment.leePharmacy.pharmacyApplication.model.Category;
import com.assignment.leePharmacy.pharmacyApplication.model.Stock;
import com.assignment.leePharmacy.pharmacyApplication.service.DrugService;
import com.assignment.leePharmacy.pharmacyApplication.service.StockService;
import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class StockWebController {
    @Autowired
    private StockService stockService;

    @Autowired
    private DrugService drugService;

    @GetMapping("/viewStock")
    public String viewStock(Stock stock, Model model){
        model.addAttribute("stock", stockService.getAllDetailsOfStock());
        return "viewstock";
    }

    @GetMapping("/showAddStockForm")
    public String showAddStockForm(Stock stock, Model model){
        model.addAttribute("drugs", drugService.getAllDrugs());
        return "addstock";
    }

    @PostMapping("/addNewStock")
    public String addNewStock(@Valid Stock stock, BindingResult result, Model model){
        if(result.hasErrors()){
            return  "addstock";
        }
        stockService.addStock(stock);
        return "redirect:/viewStock";
    }

    @GetMapping("/showUpdateStock/{id}")
    public String showEditStockForm(@PathVariable("id") Integer id, Model model){
        model.addAttribute("stock", stockService.getStockByID(id));
        return "editstock";
    }

    @PostMapping("/updateStock/{id}")
    public String updateStock(@PathVariable ("id") Integer id, @Valid Stock stock, BindingResult result, Model model){
        if(result.hasErrors()){
            stock.setStockID(id);
            model.addAttribute("stock", stock);
            return "editstock";
        }
        Optional<Stock> stock1 = stockService.updateStock(id, stock);
        return "redirect:/viewCategories";
    }


    @GetMapping("/deleteStock/{id}")
    public String deleteCategory(@PathVariable ("id") Integer id, Model model) {
        stockService.deleteStock(id);
        return "redirect:/viewCategories";
    }

}
