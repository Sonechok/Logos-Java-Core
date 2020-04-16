package com.Alex.lesson2.homework2;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Helm helm = new Helm(1.2f, "Electric");
        Wheel wheel = new Wheel(1.5f, "Michelin", 100);
        CarBody carBody = new CarBody("Sedan", 1000, 2);
        Car car = new Car(helm, wheel, carBody, "Audi", 7000f);
        System.out.println(car.toString());
        helm.helmDiameterChangePlus(2);
        helm.helmTypeChange("Normal");
        wheel.sizeChangeMinus(0.5f);
        carBody.weightChangeMinus(500f);
        car.priceChange(100.20f);
        System.out.println(car.toString());
    }
}
