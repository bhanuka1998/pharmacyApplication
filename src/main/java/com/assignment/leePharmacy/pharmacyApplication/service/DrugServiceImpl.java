package com.assignment.leePharmacy.pharmacyApplication.service;

import com.assignment.leePharmacy.pharmacyApplication.dto.DrugDTO;
import com.assignment.leePharmacy.pharmacyApplication.model.Drugs;
import com.assignment.leePharmacy.pharmacyApplication.repository.DrugRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DrugServiceImpl implements DrugService{

    @Autowired
    private DrugRepository drugRepository;


    @Override
    public void deleteDrug(Integer id) {
        drugRepository.deleteById(id);
    }

    @Override
    @Transactional
    public Optional<Drugs> updateDrug(Integer id, Drugs drugs) {
        return drugRepository.findById(id).map(e -> {
            e.setDrugName(drugs.getDrugName());
            e.setPrice(drugs.getPrice());
            e.setFullQty(drugs.getFullQty());
            return e;
        });
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

    @Override
    public Drugs getByID(Integer id) {
        Optional<Drugs> drgs = Optional.ofNullable(
                drugRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid ID"))
        );
        Drugs drug = drgs.get();
        return drug;
    }

    @Override
    public List<DrugDTO> getAllByNames() {
        List<DrugDTO> drugsList = new ArrayList<DrugDTO>();
        drugRepository.getAllDrugDetails().forEach(drugsList::add);
        return drugsList;
    }
}
