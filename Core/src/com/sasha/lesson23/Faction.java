package com.sasha.lesson23;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Faction {
    private Scanner scanner = new Scanner(System.in);
    private List<Deputy> deputyArray= new ArrayList<>();
    private String nameOfFaction;
    private int countOfDeputies;

    public Faction(String nameOfFaction, int countOfDeputy) {
        this.nameOfFaction = nameOfFaction;
        this.countOfDeputies = countOfDeputy;
    }

    public int getCountOfDeputies() {
        return countOfDeputies;
    }

    public void setCountOfDeputies(int countOfDeputies) {
        this.countOfDeputies = countOfDeputies;
    }

    public String getNameOfFaction() {
        return nameOfFaction;
    }

    public void setNameOfFaction(String nameOfFaction) {
        this.nameOfFaction = nameOfFaction;
    }

    public void addDeputyToFaction(){
        boolean isBribeTaker;
        System.out.println("Процес додавання депутата до фракції");
        System.out.println("Уведіть прізвище");
        String lastName = scanner.nextLine();
        System.out.println("Уведіть ім'я");
        String firstName = scanner.nextLine();
        System.out.println("Уведіть вік");
        byte age = scanner.nextByte();
        System.out.println("Уведіть чи бере хабарі(так/ні)");
        scanner.nextLine();
        String bribeTaker = scanner.nextLine();
        isBribeTaker= bribeTaker.equalsIgnoreCase("так");
        Deputy deputy = new Deputy(firstName, lastName, age, isBribeTaker);
        deputyArray.add(deputy);
        System.out.println("Депутат доданий до фракції");
    }

    public void removeDeputyFromFaction() {
        if (deputyArray.isEmpty()){
            System.out.println("Фракцій пуста");
        } else {
            System.out.println("Процес вилучення депутата з фракції");
            System.out.println("Уведіть прізвище депутата, якого потрібно вилучити з фракції");
            String lastName = scanner.nextLine();
            System.out.println("Уведіть ім'я депутата, якого потрібно вилучити з фракції");
            String firstName = scanner.nextLine();
            removeDeputyFromFaction(firstName, lastName);
        }
    }

    public void removeDeputyFromFaction(String firstName, String lastName){
        if (deputyArray.isEmpty()){
            System.out.println("Фракцій пуста");
        } else {
            Stream<Deputy> stream = deputyArray.stream()
                    .filter(deputy -> !deputy.firstName.equals(firstName) && !deputy.lastName.equals(lastName));
            List<Deputy> deputyArrayList = stream.collect(Collectors.toList());
            if (deputyArrayList.size()<deputyArray.size()) {
                deputyArray.clear();
                deputyArray.addAll(deputyArrayList);
                System.out.println("Вилучено депутатів: " + (deputyArray.size()-deputyArrayList.size()+1));
            } else {
                System.out.println("Жодного депутата не вилучено");
            }
        }
    }

    public void printAllBribeTakers(){
        System.out.println("Список хабарників");
        Stream<Deputy> stream = deputyArray.stream()
                .filter(deputy -> deputy.isBribeTaker);
        List<Deputy> bribeTakers = stream.collect(Collectors.toList());
        if (bribeTakers.size()==0){
            System.out.println("Хабарників не знайдено");
        } else {
            bribeTakers.forEach(deputy -> System.out.println(deputy.firstName+" "+deputy.lastName));

        }
    }

    public void printTheBiggestBribeTaker(){
        Comparator<Deputy> comparator = Deputy::compareTo;
        if(deputyArray.stream().max(comparator).isPresent()){
            Deputy theBiggestBribeTaker = deputyArray.stream().max(comparator).get();
            System.out.println("Найбільший хабарник:" +
                    theBiggestBribeTaker.firstName +
                    " " + theBiggestBribeTaker.lastName);
        } else {
            System.out.println("В цій фракції нема хабарників");
        }
    }

    public void printAllDeputy(){
        if (deputyArray.isEmpty()){
            System.out.println("Фракція пуста");
        } else {
            for (Deputy deputy: deputyArray) {
                System.out.print(deputy.toString());
            }
        }
    }

    public void removeAllDeputy(){
        if (deputyArray.isEmpty()){
            System.out.println("Фракцій пуста");
        } else {
            deputyArray.clear();
            System.out.println("Фракція очищена");
        }
    }

    public void giveBribe(){
        System.out.println("Процес передачі хабаря");
        System.out.println("Уведіть прізвище депутата, якому потрібно дати хабаря");
        String lastName = scanner.nextLine();
        System.out.println("Уведіть ім'я депутата, якому потрібно дати хабаря");
        String firstName = scanner.nextLine();
        giveBribe(firstName, lastName);
    }

    public void giveBribe(String firstName, String lastName){
        Stream<Deputy> stream = deputyArray.stream()
                .filter(deputy -> deputy.firstName.equals(firstName) && deputy.lastName.equals(lastName));
        List<Deputy> deputyArrayList = stream.collect(Collectors.toList());
        if (deputyArrayList.size()==0){
            System.out.println("Такого депутата в '" + getNameOfFaction() + "' не існує");
        } else {
            deputyArrayList.forEach(Deputy::giveBribe);
        }
    }

    @Override
    public String toString() {
        StringBuilder data = new StringBuilder("Фракція " + nameOfFaction + "\n");
        for (Deputy deputy: deputyArray){
            data.append(deputy.toString());
        }
        return data.toString();
    }
}
