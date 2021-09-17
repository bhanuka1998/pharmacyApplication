package com.assignment.leePharmacy.pharmacyApplication.service;

import com.assignment.leePharmacy.pharmacyApplication.model.Rack;
import com.assignment.leePharmacy.pharmacyApplication.repository.RackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RackServiceImpl implements RackService{

    @Autowired
    private RackRepository rackRepository;

    @Override
    public void saveRack(Rack rack) {
        rackRepository.save(rack);
    }

    @Override
    public List<Rack> getAllRacks() {
        List<Rack> rackList = new ArrayList<>();
        rackRepository.findAll().forEach(rackList::add);
        return rackList;
    }

    @Override
    public void updateRack(Integer id, Rack rack) {
        rack.setRackNo(id);
        rackRepository.save(rack);
    }

    @Override
    public void deleteRack(Integer id) {
        rackRepository.deleteById(id);
    }
}
