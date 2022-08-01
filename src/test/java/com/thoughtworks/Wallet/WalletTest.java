package com.thoughtworks.Wallet;

import org.junit.jupiter.api.Test;

import static com.thoughtworks.Wallet.Currency.RUPEE;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

ramprakash.pg@thoughtworks.com
hp_dvQ5crSjmUivViWW5RldHSJTHeO123owasaS%das
public class WalletTest {
    @Test
    void shouldAddMoneyToWalletWhenAmountIsGiven() {
        Wallet wallet = new Wallet();

        wallet.add(1,RUPEE);
        double expectedBalance = 1;
        double actualBalance = wallet.viewBalance();

        assertThat(actualBalance,is(expectedBalance));
    }

    @Test
    void shouldDisplayTransactionDetailsWhenAskedForIt() {
        Wallet wallet = new Wallet();

        wallet.add(1,RUPEE);
    }
}
