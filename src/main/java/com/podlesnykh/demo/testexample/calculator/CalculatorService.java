package com.podlesnykh.demo.testexample.calculator;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CalculatorService {

    public double calculate(double value1, double value2, String symbol) {
        if ("+".equals(symbol)) {
            return value1 - value2;
        }
        return value1 + value2;
    }
}
