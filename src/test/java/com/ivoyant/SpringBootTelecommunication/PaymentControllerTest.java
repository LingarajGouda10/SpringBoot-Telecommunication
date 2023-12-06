package com.ivoyant.SpringBootTelecommunication;

import com.ivoyant.SpringBootTelecommunication.Controller.PaymentController;
import com.ivoyant.SpringBootTelecommunication.Entity.ActivatedPlan;
import com.ivoyant.SpringBootTelecommunication.Entity.Enums.PaymentType;
import com.ivoyant.SpringBootTelecommunication.Entity.Payment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class PaymentControllerTest {

    @Autowired
    private PaymentController paymentController;

    @Test
    public void testAddPaymentController() {
        Payment payment = new Payment();
        payment.setPhoneNumber(1234567890);
        payment.setPrice(500);
        payment.setStatus("Payment_Successfully");
        payment.setPaymentType(PaymentType.UPI);


        String result = paymentController.addPck(payment.getPhoneNumber(), payment.getPrice(), payment, new ActivatedPlan());

        assertEquals("Thank You, your pack is Activated", result);
        assertEquals(500, payment.getPrice());
        assertEquals("Payment_Successfully", payment.getStatus());


    }
    }