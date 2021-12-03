package com.company.task25;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(a > b) {
            System.out.println("Yes");
        } else {
            int temp = a;
            a = b;
            b = temp;
            System.out.println(a);
            System.out.println(b);
        }
    }
}
