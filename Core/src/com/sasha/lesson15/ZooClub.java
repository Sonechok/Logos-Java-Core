package com.sasha.lesson15;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
            for (int i = 0; i < animalList.size(); i++) {
                if (animalList.get(i).type.equals(typeOfAnimal) && animalList.get(i).name.equals(nameOfAnimal)) {
                    animalList.remove(i);
                    i--;
                }
            }
            if (animalList.size() < sizeOfAnimalList) {
                map.put(person, animalList);
                System.out.println("Animal removed");
            } else {
                System.out.println("Such animal doesn't exist in this person");
            }
        }
    }

    public void removeAnimalFromAllMembers(String typeOfAnimal){
        for (Map.Entry<Person, List<Animal>> entry: map.entrySet()){
            List<Animal> animalList = entry.getValue();
            for (int i=0; i < animalList.size(); i++){
                if(animalList.get(i).type.equals(typeOfAnimal)) {
                    animalList.remove(i);
                    map.put(entry.getKey(), animalList);
                    System.out.println("Animal removed in " + entry.getKey().name);
                }
            }
        }
    }

    public void printClub(){
        for (Map.Entry<Person, List<Animal>> entry: map.entrySet()){
            System.out.println(entry.getKey().toString());
            System.out.println("Animals:");
            for (Animal animal: entry.getValue()) {
                System.out.println(animal.toString());
            }
        }
    }
}
