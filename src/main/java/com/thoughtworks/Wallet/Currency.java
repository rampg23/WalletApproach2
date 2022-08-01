package com.thoughtworks.Wallet;

public enum Currency {
    RUPEE(1),
    DOLLAR(75.06),
    ;

    private final double rupeeConvertion;

    Currency(double rupeeConvertion) {
        this.rupeeConvertion = rupeeConvertion;
    }
    public double getRupeeConvertion(){
        return this.rupeeConvertion;
    }
}

