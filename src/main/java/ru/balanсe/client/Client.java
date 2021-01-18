package ru.balanсe.client;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ru.balanсe.atm.Application;

import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
public class Client {
    private String numberCard;
    private LocalDate expDate;
    private int pinCode;


    public String getBalance(Application atm) {
        return atm.getBalance(numberCard, expDate, pinCode);
    }
}