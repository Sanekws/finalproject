package ru.balanсe.atm;

import java.math.BigDecimal;

public class Balance {
    private BigDecimal sum;
    private Currency1 currency;

    public Balance(BigDecimal sum, Currency1 currency) {
        this.sum = sum;
        this.currency = currency;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public Currency1 getCurrency() {
        return currency;
    }

}
