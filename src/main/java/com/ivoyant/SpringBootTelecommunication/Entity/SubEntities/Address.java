package com.ivoyant.SpringBootTelecommunication.Entity.SubEntities;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Address {
    private String Country;
    private String State;
    private String City;
    private String LandMark;
    private int PinCode;

}
