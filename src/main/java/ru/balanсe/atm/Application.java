package ru.balanсe.atm;


public interface Application {
    String getBalance(String numberCard, String expireDate, int pinCode);

}
