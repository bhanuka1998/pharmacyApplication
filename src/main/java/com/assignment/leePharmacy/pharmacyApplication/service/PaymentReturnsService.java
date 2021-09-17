package com.assignment.leePharmacy.pharmacyApplication.service;

import com.assignment.leePharmacy.pharmacyApplication.model.PaymentReturns;

import java.util.List;

public interface PaymentReturnsService {
    void addReturnedPayment(PaymentReturns paymentReturns);

    List<PaymentReturns> getAllPaymentReturns();

    void deleteReturnedPayment(Integer id);
}
