package com.bilichenko.x12parser.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class HealthCareClaimProfessional extends X12File {

    public static final String CODE = "X222";

    private String submitterName;

    @Override
    public String getCode() {
        return CODE;
    }
}
