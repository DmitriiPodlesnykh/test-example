package com.podlesnykh.demo.testexample.deposit;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;

@Service
public class DepositService {

    private final DepositRepository depositRepository;

    public DepositService(DepositRepository depositRepository) {
        this.depositRepository = depositRepository;
    }

    public BigDecimal update(BigInteger userId, String changeSum) {
        return depositRepository.findByUserId(userId).getBalance();
    }

}
