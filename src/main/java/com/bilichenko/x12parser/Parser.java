package com.bilichenko.x12parser;

import com.bilichenko.x12parser.model.HealthCareClaimProfessional;
import com.bilichenko.x12parser.model.X12File;

import java.io.File;

public class Parser {
    public X12File get(File file) {
        return new HealthCareClaimProfessional();
    }
}
