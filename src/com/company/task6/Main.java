package com.company.task6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int a = console.nextInt();

        if (a < 100) {
            a = 0;
        } else if (a < -100) {
            a = 0;
        } else {
            a++;
        }

        System.out.println(a);
    }
}
