package com.podlesnykh.demo.testexample.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BitHelperBadExampleTest {

    @Test
    void digit() {
        assertEquals(49, BitHelper.digit(1));
    }
}