package com.company.task29;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double usd = 440;
        double eur = 510;
        double rub = 5.8;

        System.out.println("Insert amount in KZT:");
        double kzt = scanner.nextInt();

        System.out.println("Choose currency:");
        System.out.println("[1] USD");
        System.out.println("[2] EUR");
        System.out.println("[3] RUB");

        int choise = scanner.nextInt();

        if(choise == 1) {
            System.out.println(kzt / usd + " USD");
        } else if(choise == 2) {
            System.out.println(kzt / eur + " EUR");
        } else if(choise == 3) {
            System.out.println(kzt / rub + " RUB");
        } else {
            System.out.println("Incorrect currency");
        }
    }
}
