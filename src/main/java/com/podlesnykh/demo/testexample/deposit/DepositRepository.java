package com.podlesnykh.demo.testexample.deposit;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface DepositRepository extends CrudRepository<DepositInfoEntity, BigInteger> {

    @Query("SELECT d FROM DepositInfoEntity d ")
    DepositInfoEntity findByUserId(BigInteger userId);
}
