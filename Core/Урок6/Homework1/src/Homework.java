import com.lgs.lab.interface2.MyCalculator;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import com.lgs.lab.interface2.*;

public class Homework {
    public static void main(String[] args) throws IOException {
        WorkerHours workerHours = new WorkerHours();
        WorkerMonth workerMonth = new WorkerMonth();
        MyCalculator myCalculator = new MyCalculator();
        //InputStreamReader in = new InputStreamReader(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 1");
        System.out.println("Salary for an hourly employee");
        System.out.println(workerHours.salaryGet(4, 13, 100, 10, 50, 1000));
        System.out.println("Salary for an monthly employee");
        System.out.println(workerMonth.salaryGet(4, 13, 100, 10, 50, 1000));
        System.out.println("Task 2");
        System.out.println("Enter two integer numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("Enter your action(+,-,*,/)");

        char action = (char) System.in.read();
        switch (action)
        {
            case '+':
                System.out.println(myCalculator.add(num1, num2));
                break;
            case '-':
                System.out.println(myCalculator.subtract(num1,num2));
                break;
            case '*':
                System.out.println(myCalculator.multiply(num1,num2));
                break;
            case '/':
                System.out.println(myCalculator.divide(num1, num2));
                break;
            default:
                System.out.println("Something bad has happened");
                break;
        }

    }
}
