package com.thoughtworks;

public class MinimumBalanceException extends Throwable {
    public MinimumBalanceException(){
        super("Balance should be more than 1000 rupees");
    }
}
