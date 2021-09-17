package com.assignment.leePharmacy.pharmacyApplication.repository;

import com.assignment.leePharmacy.pharmacyApplication.model.InvoiceItems;
import org.springframework.data.repository.CrudRepository;

public interface InvoiceItemsRepository extends CrudRepository<InvoiceItems, Integer> {
}
