package com.ivoyant.SpringBootTelecommunication.Service;

import com.ivoyant.SpringBootTelecommunication.Entity.Payment;

import java.util.List;


public interface PaymentService {

    public  Payment addPack(Payment payment);



    public List<Payment> getAllPaymentDetails();
}