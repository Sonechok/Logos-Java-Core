package com.Alex.lesson5;

public class Coin {
    static void coinThrow()
    {
        int res = (int) (Math.random()*3);
        switch (res){
            case 0:
                System.out.println("Emblem");
                break;
            case 1:
                System.out.println("Eagle");
                break;
            case 2:
                System.out.println("Edge");
                break;
        }
    }
}
