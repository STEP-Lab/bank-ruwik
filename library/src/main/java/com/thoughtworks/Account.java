package com.thoughtworks;

public class Account {

    private final String name;
    private String accNumber;

    public Account(String name, String accNumber) {
        this.name = name;
        this.accNumber = accNumber;
    }

    public String getAccNumber() {
        return accNumber;
    }
}
