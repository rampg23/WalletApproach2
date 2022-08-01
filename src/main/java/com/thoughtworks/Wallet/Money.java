package com.thoughtworks.Wallet;

import java.util.ArrayList;
https://admin:admin@the-internet.herokuapp.com/basic_auth

public class Money {
    private final double amount;
    private static double totalAmount;


    public Money(double amount, Currency currency) {
        this.amount = convert(amount, currency);
    }

    private double convert(double amount, Currency currency) {
        return currency.getRupeeConvertion() * amount;
    }


}
