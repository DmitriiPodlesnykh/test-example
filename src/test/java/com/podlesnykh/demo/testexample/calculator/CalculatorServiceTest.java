package com.podlesnykh.demo.testexample.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    private CalculatorService sut;

    @BeforeEach
    public void setUp() {
        sut = new CalculatorService();
    }

    @Test
    void testCalculate_1plus1_return2() {
        double result = sut.calculate(1, 1, "+");

        Assertions.assertEquals(2, result);
    }

    @Test
    void testCalculate_1minus1_return0() {
        double result = sut.calculate(1, 1, "-");

        Assertions.assertEquals(0, result);
    }

}