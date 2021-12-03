package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Выберите язык: ");
        Scanner scanner = new Scanner(System.in);

//        System.out.println("[1] Русский");
//        System.out.println("[2] Английский");
//        System.out.println("[2] Кахаский");
//
//        int choiсe = scanner.nextInt();

        //System.out.println(choiсe == 1 ? "Русский" : "English");

//        if(choiсe == 1) {
//            System.out.println("Выбран русский язык");
//        } else if(choiсe == 2) {
//            System.out.println("Выбран английский язык");
//        } else{
//            System.out.println("Некоректно выбрана комбинация!");
//        }

//        switch (choiсe){
//            case 1:
//                System.out.println("Выбран русский язык");
//                break;
//            case 2:
//                System.out.println("Выбран английский язык");
//                break;
//            case 3:
//                System.out.println("Выбран кахаский язык");
//                break;
//            default:
//                System.out.println("Некоректно выбрана комбинация!");
//        }

        int i = scanner.nextInt();

//        while(i < 10){
//            System.out.println("Hello");
//            i++;
//        }
//
//        do{
//            System.out.println("Hello");
//            i++;
//        } while (i < 10);

        for (int j = 0; j < 10; j++) {
            System.out.println("Hello");
        }

        int[] arr = {1, 2, 3};
        String mass[];

        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}
