package com.company.task22;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if(a == x || b == y) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
