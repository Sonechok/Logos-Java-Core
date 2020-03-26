package lesson3.сalculator;

import java.util.Scanner;

public class Calculator {

    public static void сalculation(float firstNum, String operation, float secondNum)
    {
        double res;
        switch (operation){
            case "+":
                res = firstNum + secondNum;
                System.out.printf("%.2f %s %.2f = %.2f", firstNum, operation, secondNum, res);
                break;
            case "-":
                res = firstNum - secondNum;
                System.out.printf("%.2f %s %.2f = %.2f", firstNum, operation, secondNum, res);
                break;
            case "*":
                res = firstNum * secondNum;
                System.out.printf("%.2f %s %.2f = %.2f", firstNum, operation, secondNum, res);
                break;
            case "/":
                if (secondNum!=0)
                {
                    res = firstNum/secondNum;
                    System.out.printf("%.2f %s %.2f = %.2f", firstNum, operation, secondNum, res);
                }
                else
                {
                    System.out.println("You can't divide by 0");
                }
                break;
            case ":":
                if (secondNum!=0)
                {
                    res = firstNum/secondNum;
                    System.out.printf("%.2f %s %.2f = %.2f", firstNum, operation, secondNum, res);
                }
                else
                {
                    System.out.println("You can't divide by 0");
                }
                break;
            case "^":
                res = Math.pow(firstNum,secondNum);
                System.out.printf("%.2f %s %.2f = %.2f", firstNum, operation, secondNum, res);
                break;
            default:
                System.out.println("Something bad has happened(");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter mathematical expression. Example: 1 + 2\nNow you)");
        float firstNum = scanner.nextFloat();
        String operation = scanner.next();
        float secondNum = scanner.nextFloat();
        сalculation(firstNum, operation, secondNum);
    }
}
