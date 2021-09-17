package com.assignment.leePharmacy.pharmacyApplication.service;

import com.assignment.leePharmacy.pharmacyApplication.model.Supplier;

import java.util.List;

public interface SupplierService {
    void addSupplier(Supplier supplier);

    List<Supplier> getAllSuppliers();

    void updateSupplier(Integer id, Supplier supplier);

    void deleteSupplier(Integer id);
}
