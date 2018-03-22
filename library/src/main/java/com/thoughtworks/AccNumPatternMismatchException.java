package com.thoughtworks;

public class AccNumPatternMismatchException extends Throwable {
    public AccNumPatternMismatchException(){
        super("Invalid account number type ex:1234-1234");
    }
}
