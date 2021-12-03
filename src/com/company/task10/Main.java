package com.company.task10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ведите 4 числа: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        if(a > b && a > c && a > d && a % 2 == 0) {
            System.out.println(a);
        } else if(b > a && b > c && b > d && b % 2 == 0) {
            System.out.println(b);
        } else if(c > a && c > b && c > d && c % 2 == 0) {
            System.out.println(c);
        } else if(d > a && d > b && d > c && d % 2 == 0) {
            System.out.println(d);
        }
        else{
            System.out.println("not found");
        }
    }
}
