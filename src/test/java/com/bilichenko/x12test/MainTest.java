package com.bilichenko.x12test;

import com.imsweb.x12.Loop;
import com.imsweb.x12.reader.X12Reader;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class MainTest {

    private static final X12Reader.FileType FILE_TYPE = X12Reader.FileType.ANSI837_5010_X222;

    @Test
    public void loopTest() throws IOException {
        File file = getFile("X222-ambulance.edi");
        X12Reader reader = new X12Reader(FILE_TYPE, file);
        Loop object = reader.getLoops().stream().findFirst().orElse(null);
        reader.getErrors().forEach(System.out::println);
        assertNotNull(object);
    }

    private File getFile(String fileName) {
        return new File(Objects.requireNonNull(this.getClass().getClassLoader().getResource(fileName)).getFile());
    }
}
