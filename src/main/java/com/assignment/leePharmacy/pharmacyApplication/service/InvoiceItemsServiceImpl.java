package com.assignment.leePharmacy.pharmacyApplication.service;

import com.assignment.leePharmacy.pharmacyApplication.model.InvoiceItems;
import com.assignment.leePharmacy.pharmacyApplication.repository.InvoiceItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InvoiceItemsServiceImpl implements InvoiceItemsServices{

    @Autowired
    private InvoiceItemsRepository invoiceItemsRepository;

    @Override
    public void addInvoiceItem(InvoiceItems invoiceItems) {
        invoiceItemsRepository.save(invoiceItems);
    }

    @Override
    public List<InvoiceItems> getAllInvoiceItems() {
        List<InvoiceItems> invoiceItemsList = new ArrayList<>();
        invoiceItemsRepository.findAll().forEach(invoiceItemsList::add);
        return invoiceItemsList;
    }
}
