package com.assignment.leePharmacy.pharmacyApplication.service;

import com.assignment.leePharmacy.pharmacyApplication.model.Drugs;
import com.assignment.leePharmacy.pharmacyApplication.repository.DrugRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DrugServiceImpl implements DrugService{

    @Autowired
    private DrugRepository drugRepository;


    @Override
    public void deleteDrug(Integer id) {
        drugRepository.deleteById(id);
    }

    @Override
    public void updateDrug(Integer id, Drugs drugs) {
        drugs.setDrugID(id);
        drugRepository.save(drugs);
    }

    @Override
    public List<Drugs> getAllDrugs() {
        List<Drugs> drugsList = new ArrayList<>();
        drugRepository.findAll().forEach(drugsList::add);
        return drugsList;
    }

    @Override
    public void saveDrug(Drugs drugs) {
        drugRepository.save(drugs);
    }
}
