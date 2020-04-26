package com.sasha.lesson23;

import java.util.Scanner;

public class Deputy extends Human {
    private Scanner scanner = new Scanner(System.in);
    String firstName;
    String lastName;
    byte age;
    boolean isBribeTaker;
    int sizeOfBribe;

    public Deputy(String firstName, String lastName, byte age, boolean isBribeTaker) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isBribeTaker = isBribeTaker;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public boolean isBribeTaker() {
        return isBribeTaker;
    }

    public void setBribeTaker(boolean bribeTaker) {
        isBribeTaker = bribeTaker;
    }

    public int getSizeOfBribe() {
        return sizeOfBribe;
    }

    public void setSizeOfBribe(int sizeOfBribe) {
        this.sizeOfBribe = sizeOfBribe;
    }

    void giveBribe(){
        if(isBribeTaker){
            System.out.println("Уведіть суму хабаря");
            sizeOfBribe = scanner.nextInt();
            if (sizeOfBribe>5000){
                System.out.println("Депутат був арештований");
                sizeOfBribe=0;
            } else {
                System.out.println("Хабар передано");
            }
        } else {
            System.out.println("Цей депутат не бере хабарів");
        }
    }

    @Override
    public String toString() {
        return  firstName + ' ' + lastName + ", вік:" + age + "\n";
    }

    public int compareTo(Deputy deputy){
        return Integer.compare(this.sizeOfBribe, deputy.sizeOfBribe);
    }
}
