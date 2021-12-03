package com.company.task4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите год: ");
        int n = scanner.nextInt();

        if(n <= 2019) {
            System.out.println("NO");
        } else if(n >= 2021) {
            System.out.println("YES");
        } else {
            System.out.println("ERROR");
        }
    }
}
