package com.Alex.lesson16;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task1: Information about class Human");
        Class myClass = Class.forName("com.Alex.lesson16.Human");
        System.out.println("Is interface : " + myClass.isInterface());
        Class[] classes = myClass.getDeclaredClasses();
        printInfo("All Classes", classes);
        Constructor[] constructors = myClass.getConstructors();
        printInfo("Constructors", constructors);
        Method[] methods = myClass.getDeclaredMethods();
        printInfo("All Methods", methods);
        Field[] fields = myClass.getDeclaredFields();
        printInfo("All Fields", fields);

        System.out.println("Task2: fill in the class field information");
        Object o = myClass.newInstance();
        Human human = (Human) o;
        System.out.println("Initial values");
        System.out.println("Name: " + human.getName());
        System.out.println("Sex: " + human.getSex());
        System.out.println("Age: " + human.getAge());

        Field fieldName = myClass.getDeclaredField("name");
        Field fieldAge = myClass.getDeclaredField("age");
        Field fieldSex = myClass.getDeclaredField("sex");
        fieldName.setAccessible(true);
        fieldAge.setAccessible(true);
        fieldSex.setAccessible(true);
        fieldName.set(human, "Stepan");
        fieldAge.set(human, 20);
        fieldSex.set(human, "Male");
        System.out.println("Data after changes");
        System.out.println("Name: " + human.getName());
        System.out.println("Sex: " + human.getSex());
        System.out.println("Age: " + human.getAge());
        System.out.println("Task3");
        Method methodA = myClass.getMethod("myMethod", String.class, int[].class);
        Method methodB = myClass.getMethod("myMethod", int[].class);
        methodA.invoke(human, "test", new int[]{12, 21, 22, 20});
        methodB.invoke(human, new int[]{12, 21, 22, 20});


    }
    static void printInfo(String s, Object[] o) {
        System.out.println(s + ":");
        for (int i = 0; i < o.length; i++) {
            System.out.println(o[i].toString( ));
        }
    }
}