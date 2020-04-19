package com.sasha.lesson2.homework2;

public class CarBody {
    private String type;
    private float weight;
    private int countOfDoors;

    public CarBody(String type, float weight, int countOfDoors) {
        this.type = type;
        this.weight = weight;
        this.countOfDoors = countOfDoors;
    }

    public int getCountOfDoors() {
        return countOfDoors;
    }

    public void setCountOfDoors(int countOfDoors) {
        this.countOfDoors = countOfDoors;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "CarBody type = '" + type + "', weight=" + weight + ", countOfDoors=" + countOfDoors + ";\n";
    }

    void typeChange (String type)
    {
        System.out.println("Car Body type changed");
        this.type=type;
    }

    void weightChangePlus(float weight)
    {
        System.out.println("Car Body weight changed");
        this.weight=this.weight+weight;
    }

    void weightChangeMinus(float weight)
    {
        if (this.weight-weight>0)
        {
            System.out.println("Car Body weight changed");
            this.weight = this.weight - weight;
        }
        else
        {
            System.out.println("Invalid data");
        }
    }

    void countOfDoorsChangePlus(int countOfDoors)
    {
        System.out.println("Car Body count of doors");
        this.countOfDoors=this.countOfDoors+countOfDoors;
    }

    void countOfDoorsChangeMinus(int countOfDoors) {
        if (this.countOfDoors - countOfDoors > 0) {
            System.out.println("Car Body count of doors");
            this.countOfDoors = this.countOfDoors + countOfDoors;
        }
        else
        {
            System.out.println("Invalid data");
        }
    }
}

