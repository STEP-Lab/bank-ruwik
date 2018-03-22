package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DebitTransactionTest {
    private DebitTransaction debitTransaction;

    @Before
    public void setUp() throws Exception {
        debitTransaction = new DebitTransaction(2000,1000);
    }
    @Test
    public void checkBalanceBefore() {
        assertThat(debitTransaction.getBalanceBefore(),is(2000.0));
    }

    @Test
    public void checkGetTransacted() {
        assertThat(debitTransaction.getTransacted(),is(1000.0));
    }

    @Test
    public void checkGetBalanceAfter() {
        assertThat(debitTransaction.getBalanceAfter(),is(1000.0));
    }

    @Test
    public void checkIsTransactionAmountAbove() {
        assertThat(debitTransaction.isTransactionAbove(500),is(true));
        assertThat(debitTransaction.isTransactionAbove(1500),is(false));
    }

    @Test
    public void checkIsTransactionAmountBelow() {
        assertThat(debitTransaction.isTransactionBelow(1500),is(true));
        assertThat(debitTransaction.isTransactionBelow(500),is(false));
    }

    @Test
    public void checkIsDebitTransaction() {
        assertThat(debitTransaction.isDebitTransaction(),is(true));
    }

    @Test
    public void checkIsCreditTransaction() {
        assertThat(debitTransaction.isCreditTransaction(),is(false));
    }
}
