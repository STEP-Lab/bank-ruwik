package com.thoughtworks;

import com.thoughtworks.Account;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountTest {
    @Test
    public void checkAccNumber() {
        Account acc =  new Account("Manindra","1234-1234");
        assertThat(acc.getAccNumber(),is("1234-1234"));
    }

}