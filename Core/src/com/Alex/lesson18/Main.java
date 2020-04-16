package com.Alex.lesson18;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new Map<>();
        List<Integer> list = new ArrayList<>();
        String data;
        list.add(2);
        System.out.println("Task1");
        System.out.println("Enter string data:");
        data = scanner.nextLine();
        addToList(list, data);
        System.out.println("List:");
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("Task2");
        map.put("1", 1);
        map.put("2", 2);
        map.put("3", 9);
        map.put("4", 3);
        map.put("5", 1);
        map.put("4", 1);
        System.out.println(map.toString());
        map.removeKey("5");
        System.out.println("Key '5' removed");
        System.out.println(map.valuesToString());
        System.out.println(map.toString());
        map.removeValue(1);
        System.out.println("Values 1 removed");
        System.out.println(map.toString());
        System.out.println(map.keysToString());
        System.out.println(map.valuesToString());
    }

    public static void addToList(List list, String data){
        list.add(data);
    }
}

