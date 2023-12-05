package com.ivoyant.SpringBootTelecommunication.Entity;

import com.ivoyant.SpringBootTelecommunication.Entity.Enums.PaymentType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

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

    public Date getPlanActivatedAt() {
        return planActivatedAt;
    }

    public void setPlanActivatedAt(Date planActivatedAt) {
        this.planActivatedAt = planActivatedAt;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    private long phoneNumber;
    private int price;
    private String status;
    private LocalDateTime timeOfPayment;
    private PaymentType paymentType;
    private Date planActivatedAt;

    @PrePersist
    private void onCreate() {
        planActivatedAt = new Date();
    }
}