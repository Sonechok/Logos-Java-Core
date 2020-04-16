package com.Alex.lesson2.homework2;

public class Helm {

    private float diameter;
    private String type;

    public Helm(float diameter, String type) {
        this.diameter = diameter;
        this.type = type;
    }

    public float getDiameter() {
        return diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    void helmDiameterChangePlus(float diameterChange)
    {
        System.out.println("Helm diameter changed");
        this.diameter=this.diameter+diameterChange;
    }

    void helmDiameterChangeMinus(float diameterChange)
    {

        if (this.diameter-diameterChange>0)
        {
            System.out.println("Helm diameter changed");
            this.diameter = this.diameter - diameterChange;
        }
        else
        {
            System.out.println("Invalid data");
        }

    }

    void helmTypeChange(String type)
    {
        System.out.println("Helm type changed");
        this.type=type;
    }

    @Override
    public String toString() {
        return "Helm diameter = " + diameter + ", helm type='" + type + ";"+'\n';
    }
}
