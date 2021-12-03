package com.company.task11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int y = scanner.nextInt();

        if(y > 2000 && y < 3000 && m > 0 && m <= 12) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
