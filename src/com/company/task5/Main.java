package com.company.task5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите день недели: ");
        int day = scanner.nextInt();

        if(day == 1) {
            System.out.println("Понедельник");
        } else if(day == 2) {
            System.out.println("Вторник");
        } else if(day == 3) {
            System.out.println("Среда");
        } else if(day == 4) {
            System.out.println("Четверг");
        } else if(day == 5) {
            System.out.println("Пятница");
        } else if(day == 6) {
            System.out.println("Суббота");
        } else {
            System.out.println("Воскресенье");
        }
    }
}
