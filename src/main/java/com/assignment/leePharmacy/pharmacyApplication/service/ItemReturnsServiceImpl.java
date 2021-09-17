package com.assignment.leePharmacy.pharmacyApplication.service;

import com.assignment.leePharmacy.pharmacyApplication.model.ItemReturns;
import com.assignment.leePharmacy.pharmacyApplication.repository.ItemReturnsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemReturnsServiceImpl implements ItemReturnsService{

    @Autowired
    private ItemReturnsRepository itemReturnsRepository;

    @Override
    public void addReturnedItem(ItemReturns itemReturns) {
        itemReturnsRepository.save(itemReturns);
    }

    @Override
    public List<ItemReturns> getAllReturns() {
        List<ItemReturns> returnsList = new ArrayList<>();
        itemReturnsRepository.findAll().forEach(returnsList::add);
        return returnsList;
    }

    @Override
    public void deleteReturnedItem(Integer id) {
        itemReturnsRepository.deleteById(id);
    }
}
