package com.Alex.lesson20;

import java.util.Scanner;

public class MyThread extends Thread{

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = 0;
        int secondNumber = 1;
        int currentNumber;
        System.out.println("Enter count of numbers");
        int numbersCount = scanner.nextInt();
        System.out.print("Потік Thread : ");
        if (numbersCount == 1){
            System.out.print(firstNumber + ";");
        } else if(numbersCount == 2 ){
            System.out.print(firstNumber + ", ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(secondNumber + ";");
        } else if (numbersCount<=0){
            System.out.print(";");
        } else {
            System.out.print(firstNumber + ", ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(secondNumber + ", ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            numbersCount-=2;
            while (numbersCount > 0) {
                currentNumber = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = currentNumber;
                if (numbersCount == 1) {
                    System.out.print(currentNumber + ";");
                } else {
                    System.out.print(currentNumber + ", ");
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                numbersCount--;
            }
        }
        System.out.println();
    }
}
