package com.ivoyant.SpringBootTelecommunication.Entity.SubEntities;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Kyc {
    private String type;
    private int idNo;
}
