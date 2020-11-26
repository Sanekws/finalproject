package ru.balanсe.atm;

import lombok.Setter;
import ru.balanсe.client.Client;

@Setter
public class Atm {
    private Client client1;
    private Balance balance1;

    public void balance() {
        System.out.println("баланс по карте " + client1.getNumberCard() + " - " + balance1.getSum() + "," + balance1.getCurrency());
    }


}

