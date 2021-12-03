package com.company.task28;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("login:");
        String login = scanner.next();

        System.out.println("password:");
        String password = scanner.next();

        if(login.equals("user") && password.equals("qwerty")) {
            System.out.println("Authentication completed");
        }else {
            System.out.println("Invalid login or password");
        }
    }
}
