package com.thoughtworks.Wallet;

import java.util.ArrayList;

public class Wallet {
    private final ArrayList<Money> wallet;
    private double balance;

    public Wallet() {
        this.wallet = new ArrayList<>();
    }

    public void add(Money money) {
        wallet.add(money);
    }

    public double viewBalance() {
        balance = Money.computeTotalAmount(wallet);
        return balance;

    }

    public static void main(String[] args) {
        Wallet wallet = new Wallet();
        Money money = new Money(2, Currency.RUPEE);
        Money money1 = new Money(3, Currency.DOLLAR);
        wallet.add(money);
        wallet.add(money1);
        System.out.println(wallet.viewBalance());
    }
}
