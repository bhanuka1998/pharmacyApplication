package com.assignment.leePharmacy.pharmacyApplication.repository;

import com.assignment.leePharmacy.pharmacyApplication.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CustomerRepository extends CrudRepository <Customer, Integer> {
    Optional<Customer> findCustomerByCusEmail(String email);
}
