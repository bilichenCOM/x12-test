package com.bilichenko.x12parser;

import com.bilichenko.x12parser.model.HealthCareClaimProfessional;
import com.bilichenko.x12parser.model.HealthCareClaimProfessionalStub;
import com.bilichenko.x12parser.model.X12File;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParserTest extends BaseTest {

    private final Parser parser;

    public ParserTest() {
        parser = new Parser();
    }

    @Test
    public void parseHealthCareProfessional() {
        HealthCareClaimProfessional expected = HealthCareClaimProfessionalStub.stub();
        File ediFile = getFile("examples/health_care/claim/professional/X222-test.edi");
        X12File actual = parser.get(ediFile);
        assertEquals(expected, actual);
    }
}
