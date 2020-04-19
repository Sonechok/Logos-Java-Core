package com.sasha.lesson11;

import java.util.Arrays;
import java.util.Scanner;

public class Homework {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 1");
        Integer[] array = new Integer[20];
        for(int i = 0; i<array.length; i++){
            array[i]=(int) (Math.random()*10);
        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        Sorting.bubbleSort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Task2");
        int n = 1 + (int) (Math.random()*5);
        int m = 1 + (int) (Math.random()*5);
        String[] materials = {"Leather", "Textile", "Dermantin"};
        Car [] [] cars = new Car[n][m];
        for (int i = 0 ; i < n ; i++){
            for (int j = 0; j < m ; j++){
                int material = (int)(Math.random()*3);
                Helm helm = new Helm((Math.random()*10), materials[material]);
                Engine engine = new Engine((int)(Math.random()*10));
                cars[i][j] = new Car(((int)(Math.random()*100)),((int)(1000+Math.random()*1021)), helm, engine);
            }
        }
        System.out.println("Enter action (1.toString, 2.fill");
        int action = scanner.nextInt();
        switch (action){
            case 1:
                for (int i = 0 ; i < n ; i++){
                    for (int j = 0; j < m ; j++){
                        System.out.println("["+i+"]"+"["+j+"]:"+cars[i][j].toString());
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
                int numberOfCylinders=scanner.nextInt();
                for (int i = 0 ; i < n ; i++){
                    for (int j = 0; j < m ; j++){
                        cars[i][j].fill(numberOfHorsepower, yearOfIssue, diameter, material, numberOfCylinders);
                    }
                }
                for (int i = 0 ; i < n ; i++){
                    for (int j = 0; j < m ; j++){
                        System.out.println("["+i+"]"+"["+j+"]:"+cars[i][j].toString());
                    }
                }
                break;
            default:
                System.out.println("Something bad has happened");
                break;
        }
    }
}
