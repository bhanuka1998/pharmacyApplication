package com.assignment.leePharmacy.pharmacyApplication.control;


import com.assignment.leePharmacy.pharmacyApplication.model.InvoiceItems;
import com.assignment.leePharmacy.pharmacyApplication.service.InvoiceItemsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InvoiceItemsController {

    @Autowired
    private InvoiceItemsServices invoiceItemsServices;

    @RequestMapping(method = RequestMethod.POST, value = "/addInvoiceItems")
    public void addInvoiceItems(@RequestBody InvoiceItems invoiceItems){
        invoiceItemsServices.addInvoiceItem(invoiceItems);
    }

    @RequestMapping("/getAllInvoiceItems")
    public List<InvoiceItems> getAllInvoiceItems(){
        return invoiceItemsServices.getAllInvoiceItems();
    }
}

