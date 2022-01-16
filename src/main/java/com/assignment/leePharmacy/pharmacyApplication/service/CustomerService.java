package com.assignment.leePharmacy.pharmacyApplication.service;

import com.assignment.leePharmacy.pharmacyApplication.model.Customer;
import com.assignment.leePharmacy.pharmacyApplication.model.CustomerLogin;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    void saveCustomer(Customer customer);

    Optional<Customer> updateCustomer(Integer id, Customer customer);

    void deleteCustomer(Integer id);

    Customer getByID(Integer id);

    List<Customer> getAllCustomers();

    CustomerLogin checkCustLoginInfo(String email);
}
