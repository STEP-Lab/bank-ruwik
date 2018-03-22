package com.thoughtworks;

public class CreditTransaction extends Transaction{
    public CreditTransaction(double balanceBefore,double transacted) {
        super(balanceBefore,transacted,balanceBefore+transacted);
    }

    public boolean isDebitTransaction() {
        return false;
    }

    public boolean isCreditTransaction() {
        return true;
    }
}
