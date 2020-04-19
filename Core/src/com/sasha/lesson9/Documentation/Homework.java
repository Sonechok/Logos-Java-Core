package com.sasha.lesson9.Documentation;/*
 * Copyright (c) 1994, 2019, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

import java.util.Scanner;

/**
 * This code is written as homework for Logos courses
 * This program processes Enums data, such as Seasons.java and Months.java
 * @author  Alexandr Gladun
 * @since   13.0.2
 */

public class Homework {
    /* Main class */

    public static void main(String[] args) {
        int action;         //variable to select an action from the list
        int day;            //variable for the number of days
        int count;          //variable for counting
        String month;       //variable for month name
        String season;      //variable for season name
        Months[] months = Months.values();      //an array of Months' values
        Seasons[] seasons = Seasons.values();   //an array of Months' values
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Перевірити чи є такий місяць");
        System.out.println("2. Вивести всі місяці з такою ж порою року");
        System.out.println("3. Вивести всі місяці які мають таку саму кількість днів");
        System.out.println("4. Вивести на екран всі місяці які мають меншу кількість днів");
        System.out.println("5. Вивести на екран всі місяці які мають більшу кількість днів");
        System.out.println("6. Вивести на екран наступну пору року");
        System.out.println("7. Вивести на екран попередню пору року");
        System.out.println("8. Вивести на екран всі місяці які мають парну кількість днів");
        System.out.println("9. Вивести на екран всі місяці які мають непарну кількість днів");
        System.out.println("10. Вивести на екран чи введений з консолі місяць має парну кількість днів");
        System.out.println("Уведіть свою дію (Номер дії)");
        action = scanner.nextInt();     //Read action
        scanner.nextLine();
        switch (action){
            case 1:
                System.out.println("Уведіть місяць (на англійській): ");
                month = scanner.nextLine();
                month = month.toUpperCase();    //Avoid the possibility of a different register
                count = 0;
                for (Months value : months) {
                    if (value.toString().equals(month)) {
                        count++;
                    }
                }
                if (count>0) {
                    //If more than 1 month
                    System.out.println("Існує");
                } else {
                    //If there is no such month
                    System.out.println("Не існує");
                }
                break;
            case 2:
                System.out.println("Уведіть пору року (на англійській)");
                season = scanner.nextLine();
                season=season.toUpperCase();        //Avoid the possibility of a different register
                for (Months value : months) {
                    if (value.getSeason().toString().equals(season)) {
                        //If there is a month with this name
                        System.out.println(value);
                    }
                }
                break;
            case 3:
                System.out.println("Уведіть кількість днів");
                day = scanner.nextInt();
                for (Months value : months) {
                    if (value.getDay() == day) {
                        //If there is a month with so many days
                        System.out.println(value);
                    }
                }
                break;
            case 4:
                System.out.println("Уведіть кількість днів");
                day = scanner.nextInt();
                for (Months value : months) {
                    if (value.getDay() < day) {
                        //If there is a month with fewer days
                        System.out.println(value);
                    }
                }
                break;
            case 5:
                System.out.println("Уведіть кількість днів");
                day = scanner.nextInt();
                for (Months value : months) {
                    if (value.getDay() > day) {
                        //If there is a month with more days
                        System.out.println(value);
                    }
                }
                break;
            case 6:
                System.out.println("Уведіть пору року (на англійській)");
                season = scanner.nextLine();
                season= season.toUpperCase();       //Avoid the possibility of a different register
                for (int i = 0; i < seasons.length; i++) {
                    if (seasons[i].toString().equals(season)) {
                        if (i==(seasons.length-1)) {
                            System.out.println(seasons[0]);
                        } else {
                            System.out.println(seasons[i+1]);
                        }
                    }
                }
                break;
            case 7:
                System.out.println("Уведіть пору року (на англійській)");
                season = scanner.nextLine();
                season= season.toUpperCase();       //Avoid the possibility of a different register
                for (int i = 0; i < seasons.length; i++)
                {
                    if (seasons[i].toString().equals(season)) {
                        if (i==0) {
                            System.out.println(seasons[seasons.length-1]);
                        } else {
                            System.out.println(seasons[i-1]);
                        }
                    }
                }
                break;
            case 8:
                for (Months value : months) {
                    if (value.getDay() % 2 == 0) {
                        //If the number of days is even
                        System.out.println(value);
                    }
                }
                break;
            case 9:
                for (Months value : months) {
                    if (value.getDay() % 2 != 0) {
                        //If the number of days is odd
                        System.out.println(value);
                    }
                }
                break;
            case 10:
                System.out.println("Уведіть місяць (на англійській): ");
                month = scanner.nextLine();
                month = month.toUpperCase();        //Avoid the possibility of a different register
                for (Months value : months) {
                    if (value.toString().equals(month)) {
                        if (value.getDay() % 2 == 0) {
                            //If the number of days is equal
                            System.out.println("Ta");
                        } else {
                            System.out.println("Ні");
                        }
                    }
                }
                break;
            default:
                //If action>10 or action<1
                System.out.println("Invalid data");
                break;
        }
    }
}
