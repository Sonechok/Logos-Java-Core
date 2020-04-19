package com.sasha.lesson22;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Human{" + "age=" + age + ", name='" + name + '\'' + ", sex='" + sex + '\'' + '}';
    }
}
