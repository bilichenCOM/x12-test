package com.bilichenko.x12test;

import com.bilichenko.x12test.model.HealthCareClaimProfessional;
import com.bilichenko.x12test.model.HealthCareClaimProfessionalStub;
import com.imsweb.x12.reader.X12Reader;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParserTest {

    private static final X12Reader.FileType HC_PROFESSIONAL_CLAIM_FILE_TYPE = X12Reader.FileType.ANSI837_5010_X222;
    private Parser parser;

    @Test
    public void parseFile() {
        HealthCareClaimProfessional expected = HealthCareClaimProfessionalStub.stub();
        File ediFile = getFile("examples/health_care/claim/professional/X222-ambulance.edi");
        HealthCareClaimProfessional actual = parser.get(ediFile, HealthCareClaimProfessional.class);
        assertEquals(expected, actual);
    }

    private File getFile(String fileName) {
        return new File(Objects.requireNonNull(this.getClass().getClassLoader().getResource(fileName)).getFile());
    }
}
