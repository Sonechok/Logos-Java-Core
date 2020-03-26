package lesson4;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Task1");
        int data=1;
        int i=0;
        while (i<=55)
        {
            System.out.println(data);
            data=data+2;
            i++;
        }

        System.out.println("Task2");
        data=90;
        while(data>=0)
        {
            System.out.println(data);
            data=data-5;
        }

        System.out.println("Task3");
        System.out.println("Enter number");
        int n =scanner.nextInt();
        if ((n%2)==0)
        {
            System.out.println("Parne");
        }
        else
        {
            System.out.println("Neparne");
        }

        System.out.println("Task4");
        System.out.println("Enter 2 numbers");
        float first=scanner.nextFloat();
        float second=scanner.nextFloat();
        float firstMinus = 10-first;
        float secondMinus = 10-second;
        if (Math.abs(firstMinus)<Math.abs(secondMinus))
        {
            System.out.println(first+" closer to 10");
        }
        else if(Math.abs(firstMinus)==Math.abs(secondMinus))
        {
            if (first<second) {
                System.out.println(first+" closer to 10");
            } else if (first==second)
            {
                System.out.println("They are equal");
            } else {
                System.out.println(second+" closer to 10");
            }
        }
        else
        {
            System.out.println(second+" closer to 10");
        }

        System.out.println("Task5");
        int[] array = new int[10];
        for (int j=0; j<10;j++)
        {
            array[j] = (int) (Math.random()*10);
        }
        int max = array[0];
        int min = array[0];
        for (int j=0; j<10;j++)
        {
            if (max>array[j])
            {
                max=array[j];
            }
            if (min<array[j])
            {
                min=array[j];
            }
            System.out.print(array[j]+" ");
        }
        System.out.println(" ");
        System.out.println("Min = "+min+" Max = "+max);

    }
}
