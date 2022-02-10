package com.podlesnykh.demo.testexample.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BitHelperGoodExampleTest {

    private static final byte ASCII_ENCODING_ZERO_CODE = 48;

    @Test
    void testDigit_0_returnByteAscii48() {
        assertEquals(ASCII_ENCODING_ZERO_CODE, BitHelper.digit(0));
    }

    @Test
    void testDigit_1_returnByteAscii48() {
        assertEquals(ASCII_ENCODING_ZERO_CODE+1, BitHelper.digit(1));
    }

    @Test
    void testDigit_9_returnByteAscii48() {
        assertEquals(ASCII_ENCODING_ZERO_CODE+9, BitHelper.digit(9));
    }
}
