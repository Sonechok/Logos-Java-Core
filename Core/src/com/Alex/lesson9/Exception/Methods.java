package com.Alex.lesson9.Exception;

public class Methods {
    static double addition(double number1, double number2) throws MyException {
        if(number1<0 && number2<0) {
            throw new IllegalArgumentException();
        }else if(number1==0 && number2!=0) {
            throw new ArithmeticException();
        }else if(number1!=0 && number2==0) {
            throw new ArithmeticException();
        }else if(number1==0 && number2==0) {
            throw new ArithmeticException();
        }else if(number1>0 && number2>0) {
            throw new MyException();
        } else {
            return number1+number2;
        }
    }

    static double subtraction (double number1, double number2) throws MyException {
        if(number1<0 && number2<0) {
            throw new IllegalArgumentException();
        }else if(number1==0 && number2!=0) {
            throw new ArithmeticException();
        }else if(number1!=0 && number2==0) {
            throw new ArithmeticException();
        }else if(number1==0 && number2==0) {
            throw new ArithmeticException();
        }else if(number1>0 && number2>0) {
            throw new MyException();
        } else {
            return number1-number2;
        }
    }

    static double multiplication (double number1, double number2) throws MyException {
        if(number1<0 && number2<0) {
            throw new IllegalArgumentException();
        }else if(number1==0 && number2!=0) {
            throw new ArithmeticException();
        }else if(number1!=0 && number2==0) {
            throw new ArithmeticException();
        }else if(number1==0 && number2==0) {
            throw new ArithmeticException();
        }else if(number1>0 && number2>0) {
            throw new MyException();
        } else {
            return number1*number2;
        }
    }

    static double division(double number1, double number2) throws MyException {
        if(number1<0 && number2<0) {
            throw new IllegalArgumentException();
        }else if(number1==0 && number2!=0) {
            throw new ArithmeticException();
        }else if(number1!=0 && number2==0) {
            throw new ArithmeticException();
        }else if(number1==0 && number2==0) {
            throw new ArithmeticException();
        }else if(number1>0 && number2>0) {
            throw new MyException();
        } else {
            return number1/number2;
        }
    }
}
