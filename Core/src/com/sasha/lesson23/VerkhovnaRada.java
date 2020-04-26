package com.sasha.lesson23;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        System.out.println("Уведіть назву фракції, яку потрібно видалити");
        String nameOfFaction = scanner.nextLine();
        if (factionArray.isEmpty()){
            System.out.println("Верховна Рада не містить фракцій");
        } else {
            Stream<Faction> stream = factionArray.stream()
                    .filter(faction -> !faction.getNameOfFaction().equals(nameOfFaction));
            List<Faction> factions = stream.collect(Collectors.toList());
            if (factions.size()<factionArray.size()) {
                factionArray.clear();
                factionArray.addAll(factions);
                System.out.println("Вилучено фракцій: " + (factionArray.size()-factions.size()+1));
            } else {
                System.out.println("Такої фракції не існує");
            }
        }
    }

    public void clearFaction(){
        scanner.nextLine();
        System.out.println("Уведіть назву фракції, яку потрібно видалити");
        String nameOfFaction = scanner.nextLine();
        if (factionArray.isEmpty()){
            System.out.println("Верховна Рада не містить фракцій");
        } else {
            Stream<Faction> stream = factionArray.stream().filter(faction -> faction.getNameOfFaction().equals(nameOfFaction));
            List<Faction> factions = stream.collect(Collectors.toList());
            if (!factions.isEmpty()){
                factionArray.stream().filter(faction -> faction.getNameOfFaction().equals(nameOfFaction))
                        .forEach(Faction::removeAllDeputy);
            } else {
                System.out.println("Такої фракції не існує");
            }
        }
    }

    public void printAllFaction(){
        System.out.println("Список фракцій");
        factionArray.forEach(faction -> System.out.println(faction.toString()));
    }

    public void printFaction(){
        scanner.nextLine();
        System.out.println("Уведіть назву фракції, яку потрібно вивести");
        String nameOfFaction = scanner.nextLine();
        Stream<Faction> stream =factionArray.stream()
                .filter(faction -> faction.getNameOfFaction().equals(nameOfFaction));
        List<Faction> factions = stream.collect(Collectors.toList());
        if (!factions.isEmpty()) {
            factions.forEach(Faction::printAllDeputy);
        } else {
            System.out.println("Такої фракції не існує, перевірте коректність даних");
        }
    }

    public void addDeputyToFraction(){
        scanner.nextLine();
        System.out.println("Уведіть фракцію, до якої потрібно додати депутата");
        String nameOfFaction = scanner.nextLine();
        Stream<Faction> stream =factionArray.stream()
                .filter(faction -> faction.getNameOfFaction().equals(nameOfFaction));
        List<Faction> factions = stream.collect(Collectors.toList());
        if (!factions.isEmpty()) {
            factions.forEach(Faction::addDeputyToFaction);
        } else {
            System.out.println("Такої фракції не існує, перевірте коректність даних");
        }
    }

    public void removeDeputy(){
        scanner.nextLine();
        System.out.println("Процес вилучення депутата з фракції");
        System.out.println("Уведіть назву фракції з якої потрібно видалити депутата");
        String nameOfFaction = scanner.nextLine();
        System.out.println("Уведіть прізвище депутата, якого потрібно вилучити з фракції");
        String lastName = scanner.nextLine();
        System.out.println("Уведіть ім'я депутата, якого потрібно вилучити з фракції");
        String firstName = scanner.nextLine();
        Stream<Faction> stream =factionArray.stream()
                .filter(faction -> faction.getNameOfFaction().equals(nameOfFaction));
        List<Faction> factions = stream.collect(Collectors.toList());
        if(!factions.isEmpty()){
            factionArray.stream()
                    .filter(faction -> faction.getNameOfFaction().equals(nameOfFaction))
                    .forEach(faction -> faction.removeDeputyFromFaction(firstName, lastName));
        } else {
            System.out.println("Такої фракції не існує");
        }
    }

    public void printBribeTakersInFaction(){
        scanner.nextLine();
        System.out.println("Уведіть фракцію, щоб вивести всіх хабарників");
        String nameOfFaction = scanner.nextLine();
        Stream<Faction> stream = factionArray.stream()
                .filter(faction -> faction.getNameOfFaction().equals(nameOfFaction));
        List<Faction> factions = stream.collect(Collectors.toList());
        if(!factions.isEmpty()){
            factions.forEach(Faction::printAllBribeTakers);
        } else {
            System.out.println("В цій фракції нема хабарників");
        }
    }

    public void printTheBiggestBribeTakersInFaction(){
        System.out.println("Уведіть фракцію, щоб вивести найбільшого хабарника");
        scanner.nextLine();
        String nameOfFaction = scanner.nextLine();
        Stream<Faction> stream = factionArray.stream()
                .filter(faction -> faction.getNameOfFaction().equals(nameOfFaction));
        List<Faction> factions = stream.collect(Collectors.toList());
        if(!factions.isEmpty()){
            factions.forEach(Faction::printTheBiggestBribeTaker);
        } else {
            System.out.println("В цій фракції нема хабарників");
        }
    }

    public void giveBribe(){
        System.out.println("Процес передачі хабаря");
        System.out.println("Уведіть прізвище депутата, якому потрібно дати хабаря");
        String lastName = scanner.nextLine();
        System.out.println("Уведіть ім'я депутата, якому потрібно дати хабаря");
        String firstName = scanner.nextLine();
        factionArray.forEach(faction -> faction.giveBribe(firstName, lastName));
    }
}
