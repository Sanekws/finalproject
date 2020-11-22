package ru.balanсe.atm;

import ru.balanсe.client.Client;

public class Atm {
    private Client client1;
    private Balance balance1;

    public void balance() {
        System.out.println("баланс по карте " + client1.getNumberCard() + " - " + balance1.getSum() + "," + balance1.getCurrency());
    }

    public void setClient1(Client client1) {
        this.client1 = client1;
    }

    public void setBalance(Balance balance1) {
        this.balance1 = balance1;
    }

}

