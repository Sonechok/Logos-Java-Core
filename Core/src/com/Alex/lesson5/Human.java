package com.Alex.lesson5;

public class Human {
    private int age;
    private String name;
    private String sex;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Human(int age, String name, String sex) {
        this(age, name);
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Human{" + "age=" + age + ", name='" + name + '\'' + ", sex='" + sex + '\'' + '}';
    }
}
