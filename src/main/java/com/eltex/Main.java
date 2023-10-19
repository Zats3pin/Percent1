package com.eltex;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) throws IOException {
        final var clientYearlyPurchases = 3_200;
        final var discount = 0.02;
        final var discountStart = 3_000;
        int choice = -1;
        Scanner in = new Scanner(System.in);


            System.out.println("Выберите версию программы (1 - локальный уровень. 0 - международный уровень)");
            choice = in.nextInt();
            if (choice == 1) {

                double totalDiscount = 0;
                if (clientYearlyPurchases > discountStart) {
                    totalDiscount = clientYearlyPurchases * discount;
                }
                if (totalDiscount == 0) {
                    System.out.printf("Экономия в этом месяце составила 0 RUB\n");
                }


                System.out.printf("За предыдущий год вы могли бы сэкономить %s RUB\n", totalDiscount);


            }

            if (choice == 0) {
                String currency = "";
                double totalDiscount = 0;
                while (choice == 0) {
                    System.out.println("Выберите вашу валюту (1 – RUB, 2 – BYN, 3 – KZT)");
                    choice = in.nextInt();

                    if (choice == 1) {
                        currency = "RUB";
                    }
                    if (choice == 2) {
                        currency = "BYN";
                    }
                    if (choice == 3) {
                        currency = "KZT";
                    }

                    if (clientYearlyPurchases > discountStart) {
                        totalDiscount = clientYearlyPurchases * discount;
                    }
                    if (totalDiscount == 0) {
                        System.out.printf("Экономия в этом месяце составила 0 %s\n", currency);
                    }


                    System.out.printf("За предыдущий год вы могли бы сэкономить %s %s\n", totalDiscount, currency);

                }
            }



    }
}