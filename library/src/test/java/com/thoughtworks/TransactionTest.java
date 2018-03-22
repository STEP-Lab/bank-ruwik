package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TransactionTest {
    private Transaction transaction;

    @Before
    public void setUp() throws Exception {
        transaction = new Transaction(1000,1000,2000);
    }

    @Test
    public void checkBalanceBefore() {
        assertThat(transaction.getBalanceBefore(),is(1000.0));
    }

    @Test
    public void checkGetTransacted() {
        assertThat(transaction.getTransacted(),is(1000.0));
    }

    @Test
    public void checkGetBalanceAfter() {
        assertThat(transaction.getBalanceAfter(),is(2000.0));
    }

    @Test
    public void checkIsTransactionAmountAbove() {
        assertThat(transaction.isTransactionAbove(500),is(true));
        assertThat(transaction.isTransactionAbove(1500),is(false));
    }

    @Test
    public void checkIsTransactionAmountBelow() {
        assertThat(transaction.isTransactionBelow(1500),is(true));
        assertThat(transaction.isTransactionBelow(500),is(false));
    }
}
