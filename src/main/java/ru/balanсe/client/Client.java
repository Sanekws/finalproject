package ru.balanсe.client;

public class Client {
    private String numberCard;
    private String expireDate;
    private int pinCode;

    public Client(String numberCard, String expireDate, int pinCode) {
        this.numberCard = numberCard;
        this.expireDate = expireDate;
        this.pinCode = pinCode;
    }

    public String getNumberCard() {
        return numberCard;
    }

    public int getPinCode() {
        return pinCode;
    }


}