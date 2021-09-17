package com.assignment.leePharmacy.pharmacyApplication.control;

import com.assignment.leePharmacy.pharmacyApplication.model.Payments;
import com.assignment.leePharmacy.pharmacyApplication.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PaymentsController {

    @Autowired
    private PaymentService paymentService;

    @RequestMapping(method = RequestMethod.POST, value = "/addPayment")
    public  void addPayment(@RequestBody Payments payments){
        paymentService.addPayment(payments);
    }

    @RequestMapping("/getAllPayments")
    public List<Payments> getAllPayments(){
        return paymentService.getAllPayments();
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/deletePayment/{id}")
    public void deletePayment(@PathVariable Integer id){
        paymentService.deletePayment(id);
    }
}
