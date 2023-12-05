package com.ivoyant.SpringBootTelecommunication.Entity;

import com.ivoyant.SpringBootTelecommunication.Entity.Enums.Internet;
import com.ivoyant.SpringBootTelecommunication.Entity.Enums.Messages;
import com.ivoyant.SpringBootTelecommunication.Entity.Enums.Talktime;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecommendedPlans {

    @Id
    private String planTitle;
    private int price;
    private String description;
    private int validityDays;
    @Enumerated(EnumType.STRING)
    private Talktime talktime;
    @Enumerated(EnumType.STRING)
    private Messages messages;
    @Enumerated(EnumType.STRING)
    private Internet internet;

    public String getPlanTitle() {
        return planTitle;
    }

    public void setPlanTitle(String planTitle) {
        planTitle = planTitle;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getValidityDays() {
        return validityDays;
    }

    public void setValidityDays(int validityDays) {
        this.validityDays = validityDays;
    }

    public Talktime getTalktime() {
        return talktime;
    }

    public void setTalktime(Talktime talktime) {
        this.talktime = talktime;
    }

    public Messages getMessages() {
        return messages;
    }

    public void setMessages(Messages messages) {
        this.messages = messages;
    }

    public Internet getInternet() {
        return internet;
    }

    public void setInternet(Internet internet) {
        this.internet = internet;
    }
}
