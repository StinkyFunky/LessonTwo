package com.company.task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");

        int a = 10;
        int b = scanner.nextInt();
        int c = 20;

        if(((a < b) && (b < c)) || ((a > b) && (b > c))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
