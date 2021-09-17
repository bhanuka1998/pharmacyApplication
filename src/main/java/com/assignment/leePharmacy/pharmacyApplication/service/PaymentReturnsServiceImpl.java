package com.assignment.leePharmacy.pharmacyApplication.service;


import com.assignment.leePharmacy.pharmacyApplication.model.PaymentReturns;
import com.assignment.leePharmacy.pharmacyApplication.repository.PaymentReturnsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PaymentReturnsServiceImpl implements PaymentReturnsService{

    @Autowired
    private PaymentReturnsRepository paymentReturnsRepository;


    @Override
    public void addReturnedPayment(PaymentReturns paymentReturns) {
        paymentReturnsRepository.save(paymentReturns);
    }

    @Override
    public List<PaymentReturns> getAllPaymentReturns() {
        List<PaymentReturns> paymentReturnsList = new ArrayList<>();
        paymentReturnsRepository.findAll().forEach(paymentReturnsList::add);
        return paymentReturnsList;
    }

    @Override
    public void deleteReturnedPayment(Integer id) {
        paymentReturnsRepository.deleteById(id);
    }
}
