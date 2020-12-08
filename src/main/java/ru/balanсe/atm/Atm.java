package ru.balanсe.atm;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class Atm implements Application {
    private int idAtm;


    @Override
    public String getBalance(String numberCard, String expireDate, int pinCode) {
        verificationPinCode(pinCode);
        return "баланас по карте " + numberCard;
    }

    public String balance(Balance balance) {
        return balance.getSum() + " " + balance.getCurrency();

    }

    private void verificationPinCode(int pinCode) {
        String c = String.valueOf(pinCode);
        for (int i = 0; i < 3; i++) {
            if (c.length() == 4) {
                return;
            } else System.out.println("Введите пин-код повторно");
        }
        System.out.println("Ваша карта заблокирована");
        System.exit(4);
    }


}


