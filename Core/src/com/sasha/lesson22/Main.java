package com.sasha.lesson22;

import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        double data = random.nextDouble();
        task1();
        task2(data);
        task3();
        task4();
        task5();
    }

    public static void task1(){
        Supplier<String> cat = ()-> "Я кіт- Мяууу-Мяууу";
        Supplier<String> dog = ()-> "Я пес-Гаууу-Гаууу";
        Supplier<String> cow = ()-> "Я корова- Мууу-Мууу";
        System.out.println("Task1");
        System.out.println(cat.get());
        System.out.println(dog.get());
        System.out.println(cow.get());
    }

    public static void task2(Double data){
        System.out.println("Task2");
        Consumer<Double> coin = (res)->{
            if(res>0.5){
                System.out.println("Emblem");
            } else if(res==0.5){
                System.out.println("Edge");
            } else {
                System.out.println("Eagle");
            }
        };
        System.out.println("You threw a coin");
        coin.accept(data);
    }

    public static void task3() {
        System.out.println("Task3");
        Consumer<Double> exponentialForm = (data)->{System.out.printf("%.10e\n", data);};
        System.out.println("Max value of double in exponential form:");
        exponentialForm.accept(Double.MAX_VALUE);
        System.out.println("Min value of double in exponential form:");
        exponentialForm.accept(Double.MIN_VALUE);
        System.out.println("Max value of float in exponential form:");
        double data = Float.MAX_VALUE;
        exponentialForm.accept(data);
        System.out.println("Min value of float in exponential form:");
        data = Float.MAX_VALUE;
        exponentialForm.accept(data);
    }

    public static void task4(){
        Human human = new Human(19, "Stepan");
        BiConsumer<Human, String> biConsumer = (person, sex)->{
            Human newHuman = new Human(person.getAge(), person.getName(), sex);
            System.out.println(newHuman.toString());
        };
        System.out.println("Task4");
        biConsumer.accept(human, "man");
    }

    public static void task5(){
        Supplier<Amphibia> amphibia = ()->{
            return (Amphibia)new com.sasha.lesson22.Frog();
        };
        System.out.println("Task5");
        amphibia.get().eat();
        amphibia.get().sleep();
        amphibia.get().walk();
        amphibia.get().swim();
    }
}
