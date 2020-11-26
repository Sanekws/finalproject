package ru.balanсe.client;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Client {
    private String numberCard;
    private String expireDate;
    private int pinCode;

}