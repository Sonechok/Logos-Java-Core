package com.sasha.lesson13;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class VerkhovnaRada {
    private static VerkhovnaRada instance;
    private Scanner scanner = new Scanner(System.in);
    private List<Faction> factionArray = new ArrayList<>();

    private VerkhovnaRada(){}

    public static VerkhovnaRada getInstance(){
        if(instance == null){
            instance = new VerkhovnaRada();
        }
        return instance;
    }

    public void addFactionToArray(){
        scanner.nextLine();
        System.out.println("Уведіть назву фракції");
        String nameOfFaction = scanner.nextLine();
        System.out.println("Уведіть кількість депутатів");
        int countOfDeputies = scanner.nextInt();
        Faction faction = new Faction(nameOfFaction, countOfDeputies);
        for (int i = 0; i < countOfDeputies; i++){
            faction.addDeputyToFaction();
        }
        factionArray.add(faction);
        System.out.println("Фракцію додано");
    }

    public void removeFactionFromArray(){
        scanner.nextLine();
        ListIterator<Faction> iterator = factionArray.listIterator();
        int counter = 0;
        System.out.println("Уведіть назву фракції, яку потрібно видалити");
        String nameOfFaction = scanner.nextLine();
        if (factionArray.isEmpty()){
            System.out.println("Верховна Рада не містить фракцій");
        } else {
            while (iterator.hasNext()){
                Faction factionNext = iterator.next();
                if (factionNext.getNameOfFaction().equals(nameOfFaction)) {
                    iterator.remove();
                    System.out.println("Фракція видалена");
                    counter++;
                }
            }
            if (counter == 0) {
                System.out.println("Такої фракції не існує");
            }
        }
    }

    public void clearFaction(){
        int counter = 0;
        System.out.println("Уведіть назву фракції, яку потрібно видалити");
        String nameOfFaction = scanner.nextLine();
        if (factionArray.isEmpty()){
            System.out.println("Верховна Рада не містить фракцій");
        } else {
            for (Faction faction : factionArray) {
                if (faction.getNameOfFaction().equals(nameOfFaction)) {
                    faction.removeAllDeputy();
                    System.out.println("Фракція очищена");
                    counter++;
                }
            }
            if (counter == 0) {
                System.out.println("Такої фракції не існує");
            }
        }
    }

    public void printAllFaction(){
        System.out.println("Список фракцій");
        for (Faction faction: factionArray){
            System.out.println(faction.toString());
        }
    }

    public void printFaction(){
        scanner.nextLine();
        int counter=0;
        System.out.println("Уведіть назву фракції, яку потрібно вивести");
        String nameOfFaction = scanner.nextLine();
        for (Faction faction: factionArray){
            if(faction.getNameOfFaction().equals(nameOfFaction)){
                faction.printAllDeputy();
                counter++;
            }
        }
        if (counter==0){
            System.out.println("Такої фракції не існує, перевірте коректність даних");
        }
    }

    public void addDeputyToFraction(){
        int counter=0;
        System.out.println("Уведіть фракцію, до якої потрібно додати депутата");
        String nameOfFaction = scanner.nextLine();
        for (Faction faction: factionArray){
            if(faction.getNameOfFaction().equals(nameOfFaction)){
                faction.addDeputyToFaction();
                counter++;
            }
        }
        if (counter==0){
            System.out.println("Такої фракції не існує, перевірте коректність даних");
        }
    }

    public void removeDeputy(){
        scanner.nextLine();
        int counter=0;
        System.out.println("Процес вилучення депутата з фракції");
        System.out.println("Уведіть назву фракції з якої потрібно видалити депутата");
        String nameOfFaction = scanner.nextLine();
        System.out.println("Уведіть прізвище депутата, якого потрібно вилучити з фракції");
        String lastName = scanner.nextLine();
        System.out.println("Уведіть ім'я депутата, якого потрібно вилучити з фракції");
        String firstName = scanner.nextLine();
        for (Faction faction: factionArray){
            if(faction.getNameOfFaction().equals(nameOfFaction)) {
                faction.removeDeputyFromFaction(firstName, lastName);
                counter++;
            }
        }
        if (counter==0){
            System.out.println("Такої фракції не існує");
        }
    }

    public void printBribeTakersInFaction(){
        int counter=0;
        System.out.println("Уведіть фракцію, щоб вивести всіх хабарників");
        String nameOfFaction = scanner.nextLine();
        for (Faction faction: factionArray){
            if(faction.getNameOfFaction().equals(nameOfFaction)){
                faction.printAllBribeTakers();
                counter++;
            }
        }
        if (counter==0){
            System.out.println("Такої фракції не існує, перевірте коректність даних");
        }
    }

    public void printTheBiggestBribeTakersInFaction(){
        int counter=0;
        System.out.println("Уведіть фракцію, щоб вивести всіх хабарників");
        String nameOfFaction = scanner.nextLine();
        for (Faction faction: factionArray){
            if(faction.getNameOfFaction().equals(nameOfFaction)){
                faction.printTheBiggestBribeTaker();
                counter++;
            }
        }
        if (counter==0){
            System.out.println("Такої фракції не існує, перевірте коректність даних");
        }
    }

    public void giveBribe(){
        System.out.println("Процес передачі хабаря");
        System.out.println("Уведіть прізвище депутата, якому потрібно дати хабаря");
        String lastName = scanner.nextLine();
        System.out.println("Уведіть ім'я депутата, якому потрібно дати хабаря");
        String firstName = scanner.nextLine();
        for (Faction faction:factionArray){
            faction.giveBribe(firstName, lastName);
        }
    }
}
