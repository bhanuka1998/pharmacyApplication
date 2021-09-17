package com.assignment.leePharmacy.pharmacyApplication.service;

import com.assignment.leePharmacy.pharmacyApplication.model.Pharmacist;
import com.assignment.leePharmacy.pharmacyApplication.repository.PharmacistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PharmacistServiceImpl implements PharmacistService{
    @Autowired
    PharmacistRepository pharmacistRepository;

    @Override
    public void savePharmacist(Pharmacist pharmacist) {
        pharmacistRepository.save(pharmacist);
    }

    @Override
    public List<Pharmacist> getAllPharmacists() {
        List<Pharmacist> pharmacistList = new ArrayList<>();
        pharmacistRepository.findAll().forEach(pharmacistList::add);
        return pharmacistList;
    }

    @Override
    public Pharmacist getPharmacistByID(Integer id) {
        Optional<Pharmacist> phrmacist = Optional.ofNullable(pharmacistRepository.
                findById(id).orElseThrow(()-> new IllegalArgumentException("Invalid ID")));
        Pharmacist pharmacist = phrmacist.get();
        return pharmacist;
    }

    @Override
    @Transactional
    public Optional<Pharmacist> updatePharmacist(Integer id, Pharmacist pharmacist) {
        return pharmacistRepository.findById(id).map(e->{
            e.setpName(pharmacist.getpName());
            e.setpUName(pharmacist.getpUName());
            return e;
        });
    }

    @Override
    public void deletePharmacist(Integer id) {
        pharmacistRepository.deleteById(id);
    }
}
