package com.sasha.lesson14;

import java.util.Comparator;

public class MyComparator implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        String name1 = o1.name;
        String name2 = o2.name;
        return name1.compareTo(name2);
    }
}
