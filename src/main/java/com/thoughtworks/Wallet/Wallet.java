package com.thoughtworks.Wallet;

import java.util.ArrayList;

import static com.thoughtworks.Wallet.Currency.RUPEE;

public class Wallet {
    private final ArrayList<Money> wallet;
    private double balance;
    private ArrayList<Transaction> transactionHistory = new ArrayList<>();
    public Wallet() {
        this.wallet = new ArrayList<>();
    }

    public void add(double amount, Currency currency) {
        Money money = new Money(amount,currency);
        wallet.add(money);
        transactionHistory.add(new Transaction(amount, currency,true,false));
        balance+=amount;
    }

    public double viewBalance() {
        return balance;
    }

    public void showTransactionDetails(){
        for(Transaction t:transactionHistory){
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        Wallet wallet = new Wallet();
        wallet.add(1, RUPEE);
        System.out.println(wallet.viewBalance());
        wallet.showTransactionDetails();
    }
}
