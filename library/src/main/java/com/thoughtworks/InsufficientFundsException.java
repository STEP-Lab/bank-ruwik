package com.thoughtworks;

public class InsufficientFundsException extends Throwable {
    public InsufficientFundsException(){
        super("Insufficient funds");
    }
}
