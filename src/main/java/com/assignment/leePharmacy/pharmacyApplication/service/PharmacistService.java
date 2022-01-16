package com.assignment.leePharmacy.pharmacyApplication.service;

import com.assignment.leePharmacy.pharmacyApplication.model.Pharmacist;

import java.util.List;
import java.util.Optional;

public interface PharmacistService {

    void savePharmacist(Pharmacist pharmacist);

    List<Pharmacist> getAllPharmacists();

    Pharmacist getPharmacistByID(Integer id);

    Optional<Pharmacist> updatePharmacist(Integer id, Pharmacist pharmacist);

    void deletePharmacist(Integer id);

}
