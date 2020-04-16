package com.Alex.lesson15;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ZooClub zooClub = new ZooClub();
        int action;
        String nameOfPerson;
        int ageOfPerson;
        String typeOfAnimal;
        String nameOfAnimal;
        List<Animal> animalList= new ArrayList<>();
        while (true){
            System.out.println("1-Додати учасника клубу");
            System.out.println("2-Додати тваринку до учасника клубу");
            System.out.println("3-Видалити тваринку з учасника клубу");
            System.out.println("4-Видалити учасника з клубу");
            System.out.println("5-Видалити конкретну тваринку зі всіх власників");
            System.out.println("6-Вивести на екран зооклуб");
            System.out.println("7-Вийти з програми");
            System.out.println("Зробіть вибір");
            action=scanner.nextInt();
            switch (action){
                case 1:
                    System.out.println("Enter name of member of club");
                    scanner.nextLine();
                    nameOfPerson = scanner.nextLine();
                    System.out.println("Enter age of member of club");
                    ageOfPerson = scanner.nextInt();
                    System.out.println("Enter number of animals in " + nameOfPerson);
                    int numberOfAnimals = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < numberOfAnimals; i++){
                        System.out.println("Enter type of animal");
                        typeOfAnimal = scanner.nextLine();
                        System.out.println("Enter name of animal");
                        nameOfAnimal = scanner.nextLine();
                        animalList.add(new Animal(nameOfAnimal, typeOfAnimal));
                        System.out.println("Animal added");
                    }
                    zooClub.addMember(new Person(nameOfPerson, ageOfPerson), animalList);
                    animalList = new ArrayList<>();
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("Enter type of animal you want to add");
                    typeOfAnimal = scanner.nextLine();
                    System.out.println("Enter name of animal you want to add");
                    nameOfAnimal = scanner.nextLine();
                    System.out.println("Enter the name of the member to whom you want to add the animal");
                    nameOfPerson = scanner.nextLine();
                    System.out.println("Enter the age of the member to whom you want to add the animal");
                    ageOfPerson = scanner.nextInt();
                    zooClub.addAnimal(new Person(nameOfPerson, ageOfPerson), new Animal(nameOfAnimal, typeOfAnimal));
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("Enter the name of the member in which you want to remove the animal");
                    nameOfPerson = scanner.nextLine();
                    System.out.println("Enter the age of the member in which you want to remove the animal");
                    ageOfPerson = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter type of animal you want to remove");
                    typeOfAnimal = scanner.nextLine();
                    zooClub.removeAnimal(new Person(nameOfPerson, ageOfPerson), typeOfAnimal);
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.println("Enter the name of the member you want to remove");
                    nameOfPerson = scanner.nextLine();
                    System.out.println("Enter the age of the member you want to remove");
                    ageOfPerson = scanner.nextInt();
                    zooClub.removeMember(new Person(nameOfPerson, ageOfPerson));
                    break;
                case 5:
                    scanner.nextLine();
                    System.out.println("Enter type of animal you want to remove");
                    typeOfAnimal = scanner.nextLine();
                    zooClub.removeAnimalFromAllMembers(typeOfAnimal);
                    break;
                case 6:
                    zooClub.printClub();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Something bad has happened");
                    break;
            }
        }
    }
}