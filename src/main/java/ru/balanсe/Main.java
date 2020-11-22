package ru.balanсe;

import ru.balanсe.atm.Atm;
import ru.balanсe.atm.Balance;
import ru.balanсe.atm.Currency1;
import ru.balanсe.client.Client;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Atm atm = new Atm();
        atm.setClient1(new Client("123456", "12/12", 1111));
        atm.setBalance(new Balance(new BigDecimal("5555.44"), Currency1.RUB));
        atm.balance();

    }

}