package com.thoughtworks;

import com.thoughtworks.Account;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountTest {
    private Account acc;

    @Before
    public void setUp() throws Exception, MinimumBalanceException, AccNumPatternMismatchException {
        acc = new Account("Manindra","1234-1234",1000);
    }

    @Test
    public void checkAccNumber() throws MinimumBalanceException {
        assertThat(acc.getAccNumber(),is("1234-1234"));
    }

    @Test
    public void checkName() {
        assertThat(acc.getName(),is("Manindra"));
    }

    @Test (expected = MinimumBalanceException.class)
    public void checkMinimum() throws MinimumBalanceException, AccNumPatternMismatchException {
        new Account("Manindra","1234-1234",100);
    }

    @Test (expected = AccNumPatternMismatchException.class)
    public void validateAccNumber() throws MinimumBalanceException, AccNumPatternMismatchException {
        new Account("Fubiki","1234",1000);
    }

    @Test
    public void checkGetBalance() {
        assertThat(acc.getBalance(),is(1000.0));
    }

    @Test
    public void checkWithdraw() throws MinimumBalanceException, AccNumPatternMismatchException, InsufficientFundsException {
        acc = new Account("Manindra","1234-1243",2000);
        assertThat(acc.getBalance(),is(2000.0));
        acc.withdraw(1000);
        assertThat(acc.getBalance(),is(1000.0));
    }

    @Test (expected = InsufficientFundsException.class)
    public void validatingInsufficientFund() throws InsufficientFundsException {
        acc.withdraw(1000);
    }

    @Test
    public void checkCredit() {
        acc.credit(1000);
        assertThat(acc.getBalance(),is(2000.0));
    }
}