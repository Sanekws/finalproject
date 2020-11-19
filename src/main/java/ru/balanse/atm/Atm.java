package ru.balanse.atm;

import ru.balanse.client.Client;

import java.util.Scanner;

public class Atm {
    Client client1 = new Client();
    int pinCodCard12345678 = 4444;
    double balansCard12345678 = 500.58;

    public void numberCard() {
        System.out.println("Вставьте банковскую карту");
        client1.setNumberCard(12345678);
        client1.setExpireDate("12/12");
    }

    public void pinCod() {
        System.out.println("Введите пин код");
        Scanner scanner = new Scanner(System.in);
        client1.setPinCode(scanner.nextInt());
    }

    public void balance() {
        if (client1.getPinCode() == pinCodCard12345678) {
            System.out.println("Баланс по вашей карте № " + client1.getNumberCard() + " - " + balansCard12345678 + " руб.");
        } else System.out.println("Вы ввели неверный Пин-Код");

    }

}