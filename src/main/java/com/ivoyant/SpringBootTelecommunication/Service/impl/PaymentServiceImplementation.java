package com.ivoyant.SpringBootTelecommunication.Service.impl;

import com.ivoyant.SpringBootTelecommunication.Entity.Payment;
import com.ivoyant.SpringBootTelecommunication.Repository.PaymentRepository;
import com.ivoyant.SpringBootTelecommunication.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImplementation implements PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;
    @Override
    public Payment addPack(Payment payment) {
        return paymentRepository.save(payment);
    }
    @Override
    public List<Payment> getAllPaymentDetails() {
        return paymentRepository.findAll();
    }
}
