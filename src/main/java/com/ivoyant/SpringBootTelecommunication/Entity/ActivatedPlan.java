package com.ivoyant.SpringBootTelecommunication.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ActivatedPlan")

public class ActivatedPlan {
    public int getActivatedId() {
        return ActivatedId;
    }

    public void setActivatedId(int activatedId) {
        ActivatedId = activatedId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPlanTitle() {
        return planTitle;
    }

    public void setPlanTitle(String planTitle) {
        this.planTitle = planTitle;
    }

    public int getValidDays() {
        return ValidDays;
    }

    public void setValidDays(int validDays) {
        ValidDays = validDays;
    }

    public String getExpiresOn() {
        return ExpiresOn;
    }

    public void setExpiresOn(String expiresOn) {
        ExpiresOn = expiresOn;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getPlanActivatedAt() {
        return planActivatedAt;
    }

    public void setPlanActivatedAt(Date planActivatedAt) {
        this.planActivatedAt = planActivatedAt;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ActivatedId;
    private int userId;
    private int price;
    private long phoneNumber;
    private String planTitle;
    private int ValidDays;
    private String ExpiresOn;
    private String status="RechargeActivated";
    private Date planActivatedAt;


    @PrePersist
    private void onCreate(){
        planActivatedAt=new Date();
    }
}
