package com.assignment.leePharmacy.pharmacyApplication.service;

import com.assignment.leePharmacy.pharmacyApplication.model.Payments;
import com.assignment.leePharmacy.pharmacyApplication.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService{

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public void addPayment(Payments payments) {
        paymentRepository.save(payments);
    }

    @Override
    public List<Payments> getAllPayments() {
        List<Payments> paymentsList = new ArrayList<>();
        paymentRepository.findAll().forEach(paymentsList::add);
        return paymentsList;
    }

    @Override
    public void deletePayment(Integer id) {
        paymentRepository.deleteById(id);
    }
}
