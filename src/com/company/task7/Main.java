package com.company.task7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(Math.abs(a - b) == 100) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
