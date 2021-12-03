package com.company.task18;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if(n > 0) {
            System.out.println(n + 1);
        } else if(n < 0) {
            System.out.println(n - 2);
        } else {
            System.out.println(n = 10);
        }
    }
}
