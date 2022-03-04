package com.thoughtworks.Wallet;

import org.junit.jupiter.api.Test;

import static com.thoughtworks.Wallet.Currency.RUPEE;

public class WalletTest {
    @Test
    void shouldAddMoneyToWalletWhenAmountIsGiven() {
        Wallet wallet = new Wallet();
        Money money = new Money(1,RUPEE);

        wallet.add(money);

    }
}
