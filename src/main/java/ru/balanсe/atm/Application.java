package ru.balanсe.atm;


import java.time.LocalDate;

public interface Application {
    String getBalance(String numberCard, LocalDate expDate, int pinCode);

}
