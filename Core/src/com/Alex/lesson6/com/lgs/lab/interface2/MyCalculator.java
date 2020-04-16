package com.Alex.lesson6.com.lgs.lab.interface2;

public class MyCalculator implements Numerable{
    @Override
    public int add(int number1, int number2) {
        return number1 + number2;
    }

    @Override
    public int subtract(int number1, int number2) {
        return number1-number2;
    }

    @Override
    public int multiply(int number1, int number2) {
        return number1*number2;
    }

    @Override
    public float divide(int number1, int number2) {
        return number1/number2;
    }
}
