package com.company.task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Введите 2 числа: ");
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(a > b) {
            System.out.println("Число " + a + " больше");
        } else {
            System.out.println("Число " + b + " больше");
        }
    }
}
