package com.company.task13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ведите 3 числа: ");

        int emp1 = scanner.nextInt();
        int emp2 = scanner.nextInt();
        int emp3 = scanner.nextInt();

        System.out.println(Math.max(Math.max(emp1, emp2), emp3) - Math.min(Math.min(emp1, emp2), emp3));
    }
}
