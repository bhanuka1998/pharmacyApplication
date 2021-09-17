package com.assignment.leePharmacy.pharmacyApplication.service;

import com.assignment.leePharmacy.pharmacyApplication.model.Invoice;

import java.util.List;

public interface InvoiceService {
    void addInvoice(Invoice invoice);

    List<Invoice> getAllInvoices();

    void deleteInvoice(Integer id);
}
