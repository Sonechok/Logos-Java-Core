package com.sasha.lesson13;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вітаємо вас у Верховній Раді України.");
        boolean isProgramRunning = true;
        while (isProgramRunning){
            System.out.println("Згідно наступного списку зробіть вибір");
            System.out.println("Уведіть 1, щоб додати фракцію");
            System.out.println("Уведіть 2, щоб видалити конкретну фракцію");
            System.out.println("Уведіть 3, щоб вивести усі  фракції");
            System.out.println("Уведіть 4, щоб очистити конкретну фракцію");
            System.out.println("Уведіть 5, щоб вивести конкретну фракцію");
            System.out.println("Уведіть 6, щоб додати депутата в фракцію");
            System.out.println("Уведіть 7, щоб видалити депутата з фракції");
            System.out.println("Уведіть 8, щоб дати хабар");
            System.out.println("Уведіть 9, щоб вивести список хабарників в фракції");
            System.out.println("Уведіть 10, щоб вивести найбільшого хабарника в фракції");
            System.out.println("Уведіть будь-яку іншу цифру, щоб вийти з програми");
            System.out.println("Якщо не відбулося дії, повторно натисніть клавішу ENTER");
           try{
                int action = scanner.nextInt();
                switch (action) {
                    case 1:
                        scanner.nextLine();
                        VerkhovnaRada.getInstance().addFactionToArray();
                        break;
                    case 2:
                        scanner.nextLine();
                        VerkhovnaRada.getInstance().removeFactionFromArray();
                        break;
                    case 3:
                        scanner.nextLine();
                        VerkhovnaRada.getInstance().printAllFaction();
                        break;
                    case 4:
                        scanner.nextLine();
                        VerkhovnaRada.getInstance().clearFaction();
                        break;
                    case 5:
                        scanner.nextLine();
                        VerkhovnaRada.getInstance().printFaction();
                        break;
                    case 6:
                        scanner.nextLine();
                        VerkhovnaRada.getInstance().addDeputyToFraction();
                        break;
                    case 7:
                        scanner.nextLine();
                        VerkhovnaRada.getInstance().removeDeputy();
                        break;
                    case 8:
                        scanner.nextLine();
                        VerkhovnaRada.getInstance().giveBribe();
                        break;
                    case 9:
                        scanner.nextLine();
                        VerkhovnaRada.getInstance().printBribeTakersInFaction();
                        break;
                    case 10:
                        scanner.nextLine();
                        VerkhovnaRada.getInstance().printTheBiggestBribeTakersInFaction();
                        break;
                    default:
                        System.out.println("Дякуємо, що відвідали Верховну Раду України");
                        isProgramRunning = false;
                        break;
                }
           } catch (Exception e){
                System.out.println(e.toString());
                System.out.println("Try again(");
                isProgramRunning=false;
           }
        }
    }
}