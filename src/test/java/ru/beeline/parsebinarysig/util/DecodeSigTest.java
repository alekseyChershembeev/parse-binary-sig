package ru.beeline.parsebinarysig.util;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Author: Aleksey Chershembeev
 * created : 20.09.2021 - 16:51
 * description:
 */
class DecodeSigTest {


    private DecodeSig decodeSig;

    @BeforeEach
    void setUp() {
        decodeSig = new DecodeSigImpl();
        System.out.println("start");
    }

    @AfterEach
    void tearDown() {
        System.out.println("down");
    }

    @Test
    @ParameterizedTest
    @ValueSource(strings = {})
    void decodeHexToBinary() {
    }

    @Test
    @ParameterizedTest
    @ValueSource(strings = {})
    void decodeHexToString() {
    }

    @ParameterizedTest(name = "#{index} - Run test with args={0}")
    @ValueSource(strings = {"0200"
            , "0000001D"
            , "00000730"
            , "0C"
            , "15"
            , "08"
            , "02"
            , "10"
            , "2E"
            , "1B"
            , "0085"
            , "889D"
            , "00000003"
            , "330000"
    })
    void decodeHexToInt(String hex) {
        final int intExample = decodeSig.decodeHexToInt(hex);
        assertTrue(intExample >= 0);
        System.out.println(intExample);

    }
}
