package com.company.task15;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if(a == b || a == c || b == c ) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
