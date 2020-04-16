package com.Alex.lesson11;

public class Car {
    public int numberOfHorsepower;
    public int yearOfIssue;
    Helm helm;
    Engine engine;

    public Car(int numberOfHorsepower, int yearOfIssue, Helm helm, Engine engine) {
        this.numberOfHorsepower = numberOfHorsepower;
        this.yearOfIssue = yearOfIssue;
        this.helm = helm;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfHorsepower = " + numberOfHorsepower +
                ", yearOfIssue = " + yearOfIssue +
                ", helm material = " + helm.material +
                ", helm diameter = " + helm.diameter +
                ", engine number of cylinders=" + engine.numberOfCylinders +
                "}\n";
    }
    public void fill(int numberOfHorsepower, int yearOfIssue, double diameter, String material, int numberOfCylinders){
        this.numberOfHorsepower = numberOfHorsepower;
        this.yearOfIssue = yearOfIssue;
        this.helm.diameter=diameter;
        this.helm.material=material;
        this.engine.numberOfCylinders=numberOfCylinders;
    }
}
