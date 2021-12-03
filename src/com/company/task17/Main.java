package com.company.task17;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if(n > 20) {
            System.out.println(n / 6);
        } else {
            System.out.println(n * 6);
        }
    }
}
