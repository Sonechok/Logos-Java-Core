package com.Alex.lesson16;

public class Human {
    private String name = "NONE";
    private int age = 0;
    private String sex = "NONE";

    public Human() {
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.sex = "None";
    }

    public Human(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private void privateMethod(){
        System.out.println("I am a private method");
    }

    public void myMethod(String a, int ... args){
        System.out.println(a);
        for (int arg: args) {
            System.out.println(arg);
        }
    }
    public void myMethod(int ... args){
        for (int arg: args) {
            System.out.println(arg);
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    private class TestPrivate{

    }

    public class TestPublic{

    }
}
