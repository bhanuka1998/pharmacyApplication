package com.assignment.leePharmacy.pharmacyApplication.repository;

import com.assignment.leePharmacy.pharmacyApplication.model.Drugs;
import org.springframework.data.repository.CrudRepository;

public interface DrugRepository extends CrudRepository<Drugs, Integer> {
}
