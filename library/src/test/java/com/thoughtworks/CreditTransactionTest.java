package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CreditTransactionTest {
    private CreditTransaction creditTransaction;

    @Before
    public void setUp() throws Exception {
        creditTransaction = new CreditTransaction(2000,1000);
    }
    @Test
    public void checkBalanceBefore() {
        assertThat(creditTransaction.getBalanceBefore(),is(2000.0));
    }

    @Test
    public void checkGetTransacted() {
        assertThat(creditTransaction.getTransacted(),is(1000.0));
    }

    @Test
    public void checkGetBalanceAfter() {
        assertThat(creditTransaction.getBalanceAfter(),is(3000.0));
    }

    @Test
    public void checkIsTransactionAmountAbove() {
        assertThat(creditTransaction.isTransactionAbove(500),is(true));
        assertThat(creditTransaction.isTransactionAbove(1500),is(false));
    }

    @Test
    public void checkIsTransactionAmountBelow() {
        assertThat(creditTransaction.isTransactionBelow(1500),is(true));
        assertThat(creditTransaction.isTransactionBelow(500),is(false));
    }
    @Test
    public void checkIsDebitTransaction() {
        assertThat(creditTransaction.isDebitTransaction(),is(false));
    }

    @Test
    public void checkIsCreditTransaction() {
        assertThat(creditTransaction.isCreditTransaction(),is(true));
    }
}
