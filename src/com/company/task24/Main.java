package com.company.task24;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        if((a > 5) && (b > 5) && (c > 5) && (d > 5) && (b % 4 == 0) && (c % 3 == 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
