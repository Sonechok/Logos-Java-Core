package com.Alex.lesson5;

public class Homework {
    public static void main(String[] args) {
        Pet cat = new Cat();
        Pet cow = new Cow();
        Pet dog = new Dog();
        System.out.println("Task 1");
        cat.voice();
        cow.voice();
        dog.voice();

        System.out.println("Task 2");
        System.out.println("You threw a coin");
        Coin.coinThrow();

        System.out.println("Task 3");
        System.out.println("Max value of double in exponential form:");
        ExponentialForm.numberToExponentialForm(Double.MAX_VALUE);
        System.out.println("Min value of double in exponential form:");
        ExponentialForm.numberToExponentialForm(Double.MIN_VALUE);
        System.out.println("Max value of float in exponential form:");
        ExponentialForm.numberToExponentialForm(Float.MAX_VALUE);
        System.out.println("Min value of float in exponential form:");
        ExponentialForm.numberToExponentialForm(Float.MAX_VALUE);

        System.out.println("Task 4");
        Human human = new Human(19, "Alex", "male");
        System.out.println(human.toString());

        System.out.println("Task 5");
        Amphibia frog = new Frog();
        frog.eat();
        frog.sleep();
        frog.swim();
        frog.walk();

    }
}
