package com.assignment.leePharmacy.pharmacyApplication.control;

import com.assignment.leePharmacy.pharmacyApplication.model.Customer;
import com.assignment.leePharmacy.pharmacyApplication.model.CustomerLogin;
import com.assignment.leePharmacy.pharmacyApplication.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(method = RequestMethod.POST, value = "/saveCustomer")
    public void saveCustomer(@RequestBody Customer customer) {
        customerService.saveCustomer(customer);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/updateCustomer/{id}")
    public void updateCustomer(@RequestBody Customer customer, @PathVariable Integer id) {
        customerService.updateCustomer(id, customer);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/deleteCustomer/{id}")
    public void deleteCustomer(@PathVariable Integer id) {
        customerService.deleteCustomer(id);
    }

    @RequestMapping("/getAllCustomers")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getCustomerById/{id}")
    private Customer getCustomerById(@PathVariable Integer id) {
        return customerService.getByID(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/checkCustomerLogins/{email}")
    private CustomerLogin getCustomerLoginInfo(@PathVariable String email){
        return customerService.checkCustLoginInfo(email);
    }

}
