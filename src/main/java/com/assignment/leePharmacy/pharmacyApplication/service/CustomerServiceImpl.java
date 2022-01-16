package com.assignment.leePharmacy.pharmacyApplication.service;

import com.assignment.leePharmacy.pharmacyApplication.model.Customer;
import com.assignment.leePharmacy.pharmacyApplication.model.CustomerLogin;
import com.assignment.leePharmacy.pharmacyApplication.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    @Transactional
    public Optional<Customer> updateCustomer(Integer id, Customer customer) {
        return customerRepository.findById(id).map(e ->{
            e.setCusName(customer.getCusName());
            e.setCusEmail(customer.getCusEmail());
            e.setCusPhone(customer.getCusPhone());
            return e;
        });
    }

    @Override
    public void deleteCustomer(Integer id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Customer getByID(Integer id) {
        Optional<Customer> cus = Optional.ofNullable(
                customerRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("User doesn't exist"))
        );
        Customer customer = cus.get();
        return customer;
    }

    @Override
    public List<Customer> getAllCustomers() {
        List<Customer> customerList = new ArrayList<>();
        customerRepository.findAll().forEach(customerList::add);
        return customerList;
    }

    @Override
    public CustomerLogin checkCustLoginInfo(String email) {
        Optional<Customer> customer = Optional.ofNullable(
                customerRepository.findCustomerByCusEmail(email).orElseThrow(() -> new IllegalArgumentException("Email not found"))
        );
        CustomerLogin customerLogin = customer.get().getCustomerLogin();
        return customerLogin;
    }
}
