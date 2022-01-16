package com.assignment.leePharmacy.pharmacyApplication.web;

import com.assignment.leePharmacy.pharmacyApplication.control.InvoiceController;
import com.assignment.leePharmacy.pharmacyApplication.service.InvoiceService;
import com.assignment.leePharmacy.pharmacyApplication.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InvoiceWebController {

    @Autowired
    private InvoiceService invoiceService;

    @Autowired
    private StockService stockService;
}
