package com.assignment.leePharmacy.pharmacyApplication.control;

import com.assignment.leePharmacy.pharmacyApplication.model.Invoice;
import com.assignment.leePharmacy.pharmacyApplication.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;

    @RequestMapping(method = RequestMethod.POST, value = "/addInvoice")
    public void addInvoice(@RequestBody Invoice invoice){
        invoiceService.addInvoice(invoice);
    }

    @RequestMapping("/getAllInvoices")
    public List<Invoice> getAllInvoices(){
        return invoiceService.getAllInvoices();
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/deleteInvoice/{id}")
    public void deleteInvoice(@PathVariable Integer id){
        invoiceService.deleteInvoice(id);
    }
}
