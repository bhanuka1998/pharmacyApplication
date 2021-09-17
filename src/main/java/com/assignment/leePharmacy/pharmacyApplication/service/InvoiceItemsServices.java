package com.assignment.leePharmacy.pharmacyApplication.service;

import com.assignment.leePharmacy.pharmacyApplication.model.InvoiceItems;

import java.util.List;

public interface InvoiceItemsServices {
    void addInvoiceItem(InvoiceItems invoiceItems);

    List<InvoiceItems> getAllInvoiceItems();
}
