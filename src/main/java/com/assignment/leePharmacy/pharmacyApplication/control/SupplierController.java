package com.assignment.leePharmacy.pharmacyApplication.control;

import com.assignment.leePharmacy.pharmacyApplication.model.Supplier;
import com.assignment.leePharmacy.pharmacyApplication.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;

@RestController
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @RequestMapping(method = RequestMethod.POST, value = "/addSupplier")
    public void addSupplier(@RequestBody Supplier supplier){
        supplierService.addSupplier(supplier);
    }

    @RequestMapping("/getAllSuppliers")
    public List<Supplier> getAllSuppliers(){
        return supplierService.getAllSuppliers();
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/updateSupplier/{id}")
    public void updateSupplier(@PathVariable Integer id, @RequestBody Supplier supplier){
        supplierService.updateSupplier(id, supplier);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/deleteSupplier/{id}")
    public void deleteSupplier(@PathVariable Integer id){
        supplierService.deleteSupplier(id);
    }
}
