package ru.beeline.parsebinarysig.util;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Author: Aleksey Chershembeev
 * created : 20.09.2021 - 18:56
 * description:
 */
class UtilsTest {

    @BeforeEach
    void setUp() {
        System.out.println("start");
    }

    @AfterEach
    void tearDown() {
        System.out.println("down");
    }

    @ParameterizedTest
    @ValueSource(strings = {"C:\\Users\\Aleksey\\Desktop\\sig\\KPI04-15_20210802114605_20210802115105_0054.sig"})
    void readFileBinary(String path) {
        final byte[] bytes = Utils.readFileBinary(path);
        System.out.println(bytes.length);
    }
}
