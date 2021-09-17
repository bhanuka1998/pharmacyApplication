package com.assignment.leePharmacy.pharmacyApplication.service;

import com.assignment.leePharmacy.pharmacyApplication.model.ItemReturns;

import java.util.List;

public interface ItemReturnsService {
    void addReturnedItem(ItemReturns itemReturns);

    List<ItemReturns> getAllReturns();

    void deleteReturnedItem(Integer id);
}
