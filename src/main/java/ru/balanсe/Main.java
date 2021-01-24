package ru.balanсe;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.balanсe.atm.Atm;
import ru.balanсe.client.Client;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");

        Client client = context.getBean("client", Client.class);
        Atm atm = context.getBean("atm", Atm.class);

        client.setExpDate(LocalDate.of(2021, 11, 15));
        // не смог разобраться, как через конструктор задать параметры LocalDate для Springa

        System.out.println(client.getBalance(atm));


    }

}