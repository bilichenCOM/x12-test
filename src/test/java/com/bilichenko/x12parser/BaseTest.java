package com.bilichenko.x12parser;

import java.io.File;
import java.util.Objects;

public class BaseTest {

    protected File getFile(String fileName) {
        return new File(Objects.requireNonNull(this.getClass().getClassLoader().getResource(fileName)).getFile());
    }
}
