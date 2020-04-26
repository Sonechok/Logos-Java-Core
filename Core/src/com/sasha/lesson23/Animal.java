package com.sasha.lesson23;

import java.util.Objects;

public class Animal {
    String name;
    String type;

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return name +"(" + type + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name) &&
                Objects.equals(type, animal.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type);
    }
}
