package com.company.task16;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if((a % 5 == 0 && a > 10) && (b % 5 == 0 && b > 10) && (c % 5 == 0 && c > 10)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
