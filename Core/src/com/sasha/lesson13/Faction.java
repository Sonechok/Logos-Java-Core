package com.sasha.lesson13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        if (bribeTaker.equalsIgnoreCase("так")){
            isBribeTaker=true;
        } else {
            isBribeTaker=false;
        }
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
            int counter = 0;
            for (int i=0; i <deputyArray.size();i++){
                if (deputyArray.get(i).firstName.equals(firstName) && deputyArray.get(i).lastName.equals(lastName)){
                    deputyArray.remove(i);
                    i--;
                    System.out.println("Депутат вилучений");
                    counter++;
                }
            }
            if (counter == 0) {
                System.out.println("Такого депутата в '" + getNameOfFaction() + "' не існує");
            }
        }
    }

    public void printAllBribeTakers(){
        int counter=0;
        System.out.println("Список хабарників");
        for (Deputy deputy: deputyArray) {
            if (deputy.isBribeTaker) {
                System.out.println(deputy.firstName+" "+deputy.lastName);
                counter++;
            }
        }
        if (counter==0){
            System.out.println("Хабарників не знайдено");
        }
    }

    public void printTheBiggestBribeTaker(){
        int maxBribe = 0;
        int maxIndex = 0;
        int i=0;
        for (Deputy deputy: deputyArray) {
            if (deputy.sizeOfBribe>maxBribe) {
                maxBribe = deputy.sizeOfBribe;
                maxIndex = i;
            }
            i++;
        }
        if (maxBribe == 0 ) {
            System.out.println("В цій фракції нема хабарників");
        } else {
            System.out.println("Найбільший хабарник:" +
                    deputyArray.get(maxIndex).firstName +
                    " " + deputyArray.get(maxIndex).lastName);
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
            for (int i = 0; i<deputyArray.size(); i++) {
                deputyArray.remove(i);
            }
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
        int counter = 0;
        for (Deputy deputy: deputyArray) {
            if (deputy.firstName.equals(firstName) && deputy.lastName.equals(lastName)) {
                deputy.giveBribe();
                counter++;
            }
        }
        if (counter==0){
            System.out.println("Такого депутата в '" + getNameOfFaction() + "' не існує");
        }
    }

    @Override
    public String toString() {
        String data = "Фракція "+ nameOfFaction+"\n";
        for (Deputy deputy: deputyArray){
            data+=deputy.toString();
        }
        return data;
    }
}
