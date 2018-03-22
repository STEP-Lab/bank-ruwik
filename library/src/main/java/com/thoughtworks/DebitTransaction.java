package com.thoughtworks;

public class DebitTransaction extends Transaction {
    public DebitTransaction(double balanceBefore,double transacted) {
        super(balanceBefore,transacted,balanceBefore-transacted);
    }

    public boolean isDebitTransaction() {
        return true;
    }

    public boolean isCreditTransaction() {
        return false;
    }
}
