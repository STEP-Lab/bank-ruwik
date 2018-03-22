package com.thoughtworks;

public class Transaction {
    private final double balanceBefore;
    private final double transacted;
    private final double balanceAfter;

    public Transaction(double balanceBefore, double transacted, double balanceAfter) {

        this.balanceBefore = balanceBefore;
        this.transacted = transacted;
        this.balanceAfter = balanceAfter;
    }

    public double getBalanceBefore() {
        return balanceBefore;
    }

    public double getTransacted() {
        return transacted;
    }

    public double getBalanceAfter() {
        return balanceAfter;
    }

    public boolean isTransactionAbove(double threshold) {
        return threshold<this.transacted;
    }

    public boolean isTransactionBelow(double threshold) {
        return threshold>this.transacted;
    }
}
