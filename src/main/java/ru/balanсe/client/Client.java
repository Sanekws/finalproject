package ru.balanсe.client;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ru.balanсe.atm.Application;


@Getter
@Setter
@AllArgsConstructor
public class Client {
    private String numberCard;
    private String expireDate;
    private int pinCode;


    public String getBalance(Application atm) {
        return atm.getBalance(numberCard, expireDate, pinCode);
    }
}