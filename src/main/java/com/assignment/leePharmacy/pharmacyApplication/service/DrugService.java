package com.assignment.leePharmacy.pharmacyApplication.service;

import com.assignment.leePharmacy.pharmacyApplication.dto.DrugDTO;
import com.assignment.leePharmacy.pharmacyApplication.model.Drugs;

import java.util.List;
import java.util.Optional;

public interface DrugService {
    void deleteDrug(Integer id);

    Optional<Drugs> updateDrug(Integer id, Drugs drugs);

    List<Drugs> getAllDrugs();

    void saveDrug(Drugs drugs);

    Drugs getByID(Integer id);

    List<DrugDTO> getAllByNames();
}
