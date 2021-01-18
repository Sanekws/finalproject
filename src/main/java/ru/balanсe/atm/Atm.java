package ru.balanсe.atm;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.HashSet;


@Slf4j
@Setter
@Getter
public class Atm implements Application {
    public HashSet<String> doubleChek = new HashSet<>();


    @Override
    public String getBalance(@NotNull String numberCard, LocalDate expDate, @Min(0000) @Max(9999) int pinCode) {
        verificationNumberCard(numberCard);
        verificationPinCode(pinCode);
        verificationExpDate(expDate);

        return "баланас по карте " + numberCard;
    }

    public String getBalance(Balance balance) {
        return balance.getAmount() + " " + balance.getCurrency();

    }

    private void verificationNumberCard(String numberCard) {
        if (numberCard == null) {
            throw new NullPointerException("Карта не читается!");
        }
        if (!doubleChek.add(numberCard)) {
            log.info("Операция по запросу баланса была выполнена ранее");
            System.exit(7);
        }

    }

    private void verificationPinCode(int pinCode) {

        String c = String.valueOf(pinCode);
        for (int i = 0; i < 3; i++) {
            if (c.length() == 4) {
                return;
            } else log.info("Введите пин-код повторно");
        }
        log.info("Ваша карта заблокирована");
        System.exit(4);
    }

    private void verificationExpDate(LocalDate expDate) {
        LocalDate date = LocalDate.now();
        if (date.isBefore(expDate)) ;
        else {
            log.info("Срок действия карты закончился");
            System.exit(4);
        }
    }
}





