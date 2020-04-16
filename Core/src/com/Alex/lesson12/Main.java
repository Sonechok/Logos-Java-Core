package com.Alex.lesson12;

import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Months> listOfMonths = new ArrayList<Months>();
        ArrayList<Seasons> listOfSeasons = new ArrayList<Seasons>();
        Scanner scanner = new Scanner(System.in);
        Months[] months = Months.values();
        for (int i = 0; i < months.length; i++) {
            listOfMonths.add(i, months[i]);
        }
        Seasons[] seasons = Seasons.values();
        for (int i = 0; i < seasons.length; i++) {
            listOfSeasons.add(i, seasons[i]);
        }
        System.out.println("Завдання №2(Enums with ArrayList)");
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
        int action = scanner.nextInt();
        switch (action) {
            case 1:
                System.out.println("Уведіть місяць (на англійській): ");
                String month = scanner.nextLine();
                month = scanner.nextLine();
                int count = 0;
                for (int i = 0; i < listOfMonths.size(); i++) {
                    if (listOfMonths.get(i).toString().equalsIgnoreCase(month)) {
                        count++;
                    }
                }
                if (count > 0) {
                    System.out.println("Існує");
                } else {
                    System.out.println("Не існує");
                }
                break;
            case 2:
                System.out.println("Уведіть пору року (на англійській)");
                String season = scanner.nextLine();
                season = scanner.nextLine();
                for (int i = 0; i < listOfMonths.size(); i++) {
                    if (listOfMonths.get(i).getSeason().toString().equalsIgnoreCase(season)) {
                        System.out.println(listOfMonths.get(i));
                    }
                }
                break;
            case 3:
                System.out.println("Уведіть кількість днів");
                int day = scanner.nextInt();
                for (int i = 0; i < listOfMonths.size(); i++) {
                    if (listOfMonths.get(i).getDay() == day) {
                        System.out.println(listOfMonths.get(i));
                    }
                }
                break;
            case 4:
                System.out.println("Уведіть кількість днів");
                day = scanner.nextInt();
                for (int i = 0; i < listOfMonths.size(); i++) {
                    if (listOfMonths.get(i).getDay() < day) {
                        System.out.println(listOfMonths.get(i));
                    }
                }
                break;
            case 5:
                System.out.println("Уведіть кількість днів");
                day = scanner.nextInt();
                for (int i = 0; i < listOfMonths.size(); i++) {
                    if (listOfMonths.get(i).getDay() > day) {
                        System.out.println(listOfMonths.get(i));
                    }
                }
                break;
            case 6:
                System.out.println("Уведіть пору року (на англійській)");
                season = scanner.nextLine();
                season = scanner.nextLine();
                for (int i = 0; i < listOfSeasons.size(); i++) {
                    if (listOfSeasons.get(i).toString().equalsIgnoreCase(season)) {
                        if (i == (listOfSeasons.size() - 1)) {
                            System.out.println(listOfSeasons.get(0));
                        } else {
                            System.out.println(listOfSeasons.get(i + 1));
                        }
                    }
                }
                break;
            case 7:
                System.out.println("Уведіть пору року (на англійській)");
                season = scanner.nextLine();
                season = scanner.nextLine();
                for (int i = 0; i < listOfSeasons.size(); i++) {
                    if (listOfSeasons.get(i).toString().equalsIgnoreCase(season)) {
                        if (i == 0) {
                            System.out.println(listOfSeasons.get(listOfSeasons.size() - 1));
                        } else {
                            System.out.println(listOfSeasons.get(i - 1));
                        }
                    }
                }
                break;
            case 8:
                for (int i = 0; i < listOfMonths.size(); i++) {
                    if (listOfMonths.get(i).getDay() % 2 == 0) {
                        System.out.println(listOfMonths.get(i));
                    }
                }
                break;
            case 9:
                for (int i = 0; i < listOfMonths.size(); i++) {
                    if (listOfMonths.get(i).getDay() % 2 != 0) {
                        System.out.println(listOfMonths.get(i));
                    }
                }
                break;
            case 10:
                System.out.println("Уведіть місяць (на англійській): ");
                month = scanner.nextLine();
                month = scanner.nextLine();
                for (int i = 0; i < listOfMonths.size(); i++) {
                    if (listOfMonths.get(i).toString().equalsIgnoreCase(month)) {
                        if (listOfMonths.get(i).getDay() % 2 == 0) {
                            System.out.println("Ta");
                        } else {
                            System.out.println("Ні");
                        }
                    }
                }
                break;
            default:
                System.out.println("Invalid data");
                break;
        }
        ArrayList<ArrayList<Car>> cars=new ArrayList();
        int n = 1 + (int) (Math.random() * 5);
        int m = 1 + (int) (Math.random() * 5);
        ArrayList<String> materials = new ArrayList<>();
        materials.add("Leather");
        materials.add("Textile");
        materials.add("Dermantin");
        for(int i=0; i<n; i++){
            ArrayList <Car> arr1=new ArrayList<>();
            for(int j=0; j<m;j++){
                int material = (int) (Math.random() * 3);
                Helm helm = new Helm((Math.random() * 10), materials.get(material));
                Engine engine = new Engine((int) (Math.random() * 10));
                Car pass=new Car(((int) (Math.random() * 100)), ((int) (1000 + Math.random() * 1021)), helm, engine);
                arr1.add(pass);
            }
            cars.add(arr1);
        }
        System.out.println("Enter action (1.toString, 2.fill)");
        action = scanner.nextInt();
        switch (action) {
            case 1:
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {

                        System.out.println("[" + i + "]" + "[" + j + "]:" + cars.get(i).get(j).toString());
                    }
                }
                break;
            case 2:
                System.out.println("Enter numberOfHorsepower");
                int numberOfHorsepower = scanner.nextInt();
                System.out.println("Enter yearOfIssue");
                int yearOfIssue = scanner.nextInt();
                System.out.println("Enter diameter of helm");
                double diameter = scanner.nextDouble();
                System.out.println("Enter material of helm");
                scanner.nextLine();
                String material = scanner.nextLine();
                System.out.println("Enter numberOfCylinders of engine");
                int numberOfCylinders = scanner.nextInt();
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        cars.get(i).get(j).fill(numberOfHorsepower, yearOfIssue, diameter, material, numberOfCylinders);
                    }
                }
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        System.out.println("[" + i + "]" + "[" + j + "]:" + cars.get(i).get(j).toString());
                    }
                }
                break;
            default:
                System.out.println("Something bad has happened");
                break;

        }
        System.out.println("My ArrayList");
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("First");
        myArrayList.add("Second");
        for (int i=0; i < myArrayList.length();i++) {
            System.out.println((i+1)+". "+myArrayList.get(i));
        }
        myArrayList.remove(0);
        for (int i=0; i < myArrayList.length();i++) {
            System.out.println((i+1)+". "+myArrayList.get(i));
        }
    }
}