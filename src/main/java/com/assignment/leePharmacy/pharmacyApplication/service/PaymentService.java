package com.assignment.leePharmacy.pharmacyApplication.service;

import com.assignment.leePharmacy.pharmacyApplication.model.Payments;

import java.util.List;

public interface PaymentService {
    void addPayment(Payments payments);

    List<Payments> getAllPayments();

    void deletePayment(Integer id);
}
