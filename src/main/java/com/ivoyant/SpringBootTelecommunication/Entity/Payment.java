package com.ivoyant.SpringBootTelecommunication.Entity;

import com.ivoyant.SpringBootTelecommunication.Entity.Enums.PaymentType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getTimeOfPayment() {
        return timeOfPayment;
    }

    public void setTimeOfPayment(LocalDateTime timeOfPayment) {
        this.timeOfPayment = timeOfPayment;
    }


    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public LocalDate getPlanActivatedAt() {
        return planActivatedAt;
    }

    public void setPlanActivatedAt(LocalDate planActivatedAt) {
        this.planActivatedAt = planActivatedAt;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    @Column(unique = true)
    private long phoneNumber;
    private int price;
    private String status;
    @CreationTimestamp
    private LocalDateTime timeOfPayment;
    private PaymentType paymentType;
    @CreationTimestamp
    private LocalDate planActivatedAt;


    }
