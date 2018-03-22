package com.thoughtworks;

import javax.naming.InsufficientResourcesException;

public class Account {

    private final String name;
    private final String accNumber;
    private double balance;
    private double minimumBalace = 1000;

    public Account(String name, String accNumber, double balance) throws MinimumBalanceException, AccNumPatternMismatchException {
        validateAccountNumber(accNumber);
        validateMinimumBalance(balance);
        this.name = name;
        this.accNumber = accNumber;
        this.balance = balance;
    }

    private void validateAccountNumber(String accNumber) throws AccNumPatternMismatchException {
        if(!accNumber.matches("\\d{4}-\\d{4}")){
            throw new AccNumPatternMismatchException();
        }
    }

    private void validateMinimumBalance(double balance) throws MinimumBalanceException {
        if(balance<1000){
            throw new MinimumBalanceException();
        }
    }

    public String getAccNumber() {
        return accNumber;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if(this.balance-amount<minimumBalace){
            throw new InsufficientFundsException();
        }
        this.balance-=amount;
    }

    public void credit(double amount) {
        this.balance+=amount;
    }
}
