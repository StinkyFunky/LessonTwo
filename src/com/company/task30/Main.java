package com.company.task30;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose your branch:");
        System.out.println("[1] Science");
        System.out.println("[2] Humanitarian subjects");
        System.out.println("[3] Art");
        System.out.println("[4] Sport");

        int select = scanner.nextInt();

        if(select == 1) {
            select = scanner.nextInt();
            System.out.println("Choose your subject: ");
            System.out.println("[1] Math");
            System.out.println("[2] Physics");

            if(select == 1) {
                System.out.println("You are Financier");
            } else if(select == 2) {
                System.out.println("You are Engineer");
            } else {
                System.out.println("Incorrect operation");
            }
        } else if(select == 2) {
            select = scanner.nextInt();
            System.out.println("Choose your subject: ");
            System.out.println("[1] History");
            System.out.println("[2] Foreign Languages");

            if(select == 1) {
                System.out.println("You are Historic or Diplomat");
            } else if(select == 2) {
                System.out.println("You are Translator");
            } else {
                System.out.println("Incorrect operation");
            }
        } else if(select == 3) {
            int choise = scanner.nextInt();
            System.out.println("Choose your subject: ");
            System.out.println("[1] Drawing");
            System.out.println("[2] Singing");

            if(choise == 1) {
                System.out.println("You are Painter or Architect");
            } else if(choise == 2) {
                System.out.println("You are Singer or Tamada");
            } else {
                System.out.println("Incorrect operation");
            }
        } else if(select == 4) {
            int choise = scanner.nextInt();
            System.out.println("Choose your subject: ");
            System.out.println("[1] Team");
            System.out.println("[2] Individual");

            if(choise == 1) {
                System.out.println("You are footballer or Basketball player");
            } else if(choise == 2) {
                System.out.println("You are boxer or tennis player");
            } else {
                System.out.println("Incorrect operation");
            }
        }
    }
}
