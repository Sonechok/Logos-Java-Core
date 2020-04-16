package com.Alex.lesson19;

import java.io.*;
import java.util.List;

public class Methods {
    public static void serialize(Employee employee) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("infoLesson19.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(employee);
        objectOutputStream.flush();
        objectOutputStream.close();
    }

    public static void serialize(List list) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("infoListLesson19.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(list);
        objectOutputStream.flush();
        objectOutputStream.close();
    }

    public static Employee deserialize(Employee employee) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("infoLesson19.txt");
        ObjectInputStream oin = new ObjectInputStream(fis);
        employee = (Employee) oin.readObject();
        System.out.println(employee.toString());
        return employee;
    }

    public static List deserialize(List list) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("infoListLesson19.txt");
        ObjectInputStream oin = new ObjectInputStream(fis);
        list = (List) oin.readObject();
        System.out.println(list.toString());
        System.out.println(list);
        return list;
    }
}
