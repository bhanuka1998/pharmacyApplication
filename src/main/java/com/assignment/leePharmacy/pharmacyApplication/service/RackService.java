package com.assignment.leePharmacy.pharmacyApplication.service;

import com.assignment.leePharmacy.pharmacyApplication.model.Rack;

import java.util.List;

public interface RackService {
    void saveRack(Rack rack);

    List<Rack> getAllRacks();

    void updateRack(Integer id, Rack rack);

    void deleteRack(Integer id);
}
