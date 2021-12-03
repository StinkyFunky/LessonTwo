package com.company.task26;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите месяц: ");
        int month = scanner.nextInt();

        if(month == 1) {
            System.out.println("Январь");
        } else if(month == 2) {
            System.out.println("Февраль");
        } else if(month == 3) {
            System.out.println("Март");
        } else if(month == 4) {
            System.out.println("Апрель");
        } else if(month == 5) {
            System.out.println("Май");
        } else if(month == 6) {
            System.out.println("Июнь");
        } else if(month == 7) {
            System.out.println("Июль");
        } else if(month == 8) {
            System.out.println("Август");
        } else if(month == 9) {
            System.out.println("Сентябрь");
        } else if(month == 10) {
            System.out.println("Октябрь");
        } else if(month == 11) {
            System.out.println("Ноябрь");
        } else if(month == 12) {
            System.out.println("Декабрь");
        } else {
            System.out.println("Такого месяца не существует");
        }
    }
}
