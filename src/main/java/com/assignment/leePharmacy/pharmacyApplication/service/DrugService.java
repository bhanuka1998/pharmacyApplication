package com.assignment.leePharmacy.pharmacyApplication.service;

import com.assignment.leePharmacy.pharmacyApplication.model.Drugs;

import java.util.List;

public interface DrugService {
    void deleteDrug(Integer id);

    void updateDrug(Integer id, Drugs drugs);

    List<Drugs> getAllDrugs();

    void saveDrug(Drugs drugs);
}
