package com.thoughtworks.Wallet;

public class Transaction {
    private double amount;
    private Currency currency;
    private boolean isAdded = false;
    private boolean isWithdrawn = false;

    public Transaction(double amount, Currency currency, boolean isAdded, boolean isWithdrawn) {
        this.amount = amount;
        this.currency = currency;
        this.isAdded = isAdded;
        this.isWithdrawn = isWithdrawn;
    }
}
