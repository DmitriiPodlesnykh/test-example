package com.podlesnykh.demo.testexample.deposit;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;

import static javax.persistence.GenerationType.IDENTITY;

@Table(name = "DEPOSIT_INFO")
@Entity()
public class DepositInfoEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID")
    private BigInteger id;

    @Column(name ="USER_ID", nullable = false)
    public BigInteger userId;

    @Column(name = "BALANCE", nullable = false)
    public BigDecimal balance;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public BigInteger getUserId() {
        return userId;
    }

    public void setUserId(BigInteger userId) {
        this.userId = userId;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
