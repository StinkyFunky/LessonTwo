package com.company.task23;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if((n == 1) && (n <= 5)) {
            System.out.println(n + 10);
        } else if ((n >= 10) && (n <= 20)){
            System.out.println(n - 5);
        } else if ((n < 0) || (n > 1000)){
            System.out.println(n * 3);
        } else {
            System.out.println(n = 0);
        }
    }
}
