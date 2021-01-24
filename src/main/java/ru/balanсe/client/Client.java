package ru.balanсe.client;

import lombok.Setter;
import ru.balanсe.atm.Application;

import java.time.LocalDate;

@Setter
public class Client {
    private String numberCard;
    private LocalDate expDate;
    private int pinCode;

    public Client(String numberCard, int pinCode) {
        this.numberCard = numberCard;
        this.pinCode = pinCode;
    }

    public String getBalance(Application atm) {
        return atm.getBalance(numberCard, expDate, pinCode);
    }
}