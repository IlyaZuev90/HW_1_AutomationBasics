package ru.netology;

import ru.netology.service.CashbackHackService;

public class Main {
    public static void main(String[] args) {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int boundary = 1000;

        if (amount < boundary) {
            System.out.println("Необходимо докупить товаров на сумму: " + service.remain(amount));
        } else {
            System.out.println("Кэш-бэк зачислен на счёт покупателя");
            System.out.println(service.remain(amount));
        }
    }
}