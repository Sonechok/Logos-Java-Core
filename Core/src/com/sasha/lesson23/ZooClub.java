package com.sasha.lesson23;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ZooClub {
    Map<Person, List<Animal>> map = new HashMap<>();

    public void addMember (Person person, List<Animal> animalList){
        map.put(person, animalList);
        System.out.println("Member added");
    }

    public void removeMember(Person person){
        map.remove(person);
        System.out.println("Member removed");
    }

    public void addAnimal (Person person, Animal animal){
        List<Animal> animalList = map.get(person);
        animalList.add(animal);
        map.put(person, animalList);
        System.out.println("Animal added");
    }

    public void removeAnimal (Person person, String typeOfAnimal, String nameOfAnimal){
        List<Animal> animalList = map.get(person);
        if (animalList==null){
            System.out.println("Such person doesn't exist");
        } else {
            int sizeOfAnimalList = animalList.size();
            Stream<Animal> stream = animalList.stream()
                    .filter(animal -> !animal.name.equals(nameOfAnimal) && !animal.type.equals(typeOfAnimal));
            List<Animal> animals = stream.collect(Collectors.toList());
            if (animals.size() < sizeOfAnimalList) {
                map.put(person, animals);
                System.out.println("Animal removed");
            } else {
                System.out.println("Such animal doesn't exist in this person");
            }
        }
    }

    public void removeAnimalFromAllMembers(String typeOfAnimal){

        for (Map.Entry<Person, List<Animal>> entry: map.entrySet()){
            List<Animal> animalList = entry.getValue();
            Stream<Animal> stream = animalList.stream()
                    .filter(animal -> !animal.type.equals(typeOfAnimal));
            List<Animal> animals = stream.collect(Collectors.toList());
            if (animals.size() < animalList.size()) {
                map.put(entry.getKey(), animals);
                System.out.println("Animal removed in " + entry.getKey().name);
            } else {
                System.out.println("Such animal doesn't exist in " + entry.getKey().name);
            }
        }
    }

    public void printClub(){
        for (Map.Entry<Person, List<Animal>> entry: map.entrySet()){
            System.out.println(entry.getKey().toString());
            System.out.println("Animals:");
            entry.getValue().forEach(animal -> System.out.println(animal.toString()));
        }
    }
}
