package com.assignment.leePharmacy.pharmacyApplication.control;

import com.assignment.leePharmacy.pharmacyApplication.model.ItemReturns;
import com.assignment.leePharmacy.pharmacyApplication.service.ItemReturnsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemReturnsController {

    @Autowired
    ItemReturnsService itemReturnsService;

    @RequestMapping(method = RequestMethod.POST, value = "/addReturnedItem")
    public void addReturnedItem(@RequestBody ItemReturns itemReturns){
        itemReturnsService.addReturnedItem(itemReturns);
    }

    @RequestMapping("/getAllReturns")
    public List<ItemReturns> getAllReturns(){
        return itemReturnsService.getAllReturns();
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/deleteReturnedItem/{id}")
    public void deleteReturnedItem(@PathVariable Integer id){
        itemReturnsService.deleteReturnedItem(id);
    }
}
