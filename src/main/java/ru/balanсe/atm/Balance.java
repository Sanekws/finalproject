package ru.balanсe.atm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
@AllArgsConstructor


public class Balance {
    private BigDecimal amount;
    private Currency currency;
}





