package com.podlesnykh.demo.testexample.deposit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
public class DepositController {

    private final DepositService depositService;

    public DepositController(DepositService depositService) {
        this.depositService = depositService;
    }

    @GetMapping("/update")
    public String update(BigInteger userId, String changeSum) {
        return depositService.update(userId, changeSum).toString();
    }
}
