package ru.balanсe;

import ru.balanсe.atm.Atm;
import ru.balanсe.atm.Balance;
import ru.balanсe.atm.Currency;
import ru.balanсe.client.Client;

import java.math.BigDecimal;


public class Main {
    public static void main(String[] args) {
        Client client = new Client("123456", "12/12", 4544);
        Atm atm = new Atm();
        Balance balance = new Balance(new BigDecimal(3333), Currency.RUB);
        System.out.println(client.getBalance(atm) + " равен " + atm.balance(balance));

    }

}