package com.assignment.leePharmacy.pharmacyApplication.control;


import com.assignment.leePharmacy.pharmacyApplication.model.PaymentReturns;
import com.assignment.leePharmacy.pharmacyApplication.service.PaymentReturnsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PaymentReturnsController {

    @Autowired
    private PaymentReturnsService paymentReturnsService;

    @RequestMapping(method = RequestMethod.POST, value = "/addReturnedPayment")
    public void addReturnedPayment(@RequestBody PaymentReturns paymentReturns){
        paymentReturnsService.addReturnedPayment(paymentReturns);
    }

    @RequestMapping("/getAllReturnedPayments")
    public List<PaymentReturns> getAllPaymentReturns(){
        return paymentReturnsService.getAllPaymentReturns();
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/deleteReturnedPayments/{id}")
    public void deleteReturnedPayment(@PathVariable Integer id){
        paymentReturnsService.deleteReturnedPayment(id);
    }
}
