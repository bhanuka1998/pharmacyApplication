package com.assignment.leePharmacy.pharmacyApplication.repository;

import com.assignment.leePharmacy.pharmacyApplication.model.Pharmacist;
import com.assignment.leePharmacy.pharmacyApplication.model.PharmacistLogin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserLoginRepository extends JpaRepository<Pharmacist, Integer> {
    Optional<Pharmacist> findPharmacistBypEmail(String userName);
}
