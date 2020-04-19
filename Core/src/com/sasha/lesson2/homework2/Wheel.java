package com.sasha.lesson2.homework2;

public class Wheel {
    private float size;
    private String model;
    private float price;

    public Wheel(float size, String model, float price) {
        this.size = size;
        this.model = model;
        this.price = price;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    void sizeChangePlus(float size)
    {
        System.out.println("Wheel size changed");
        this.size=this.size+size;
    }

    void sizeChangeMinus(float size)
    {
        if ((this.size+size)>0)
        {
            System.out.println("Wheel size changed");
            this.size = this.size + size;
        }
        else
        {
            System.out.println("Invalid data");
        }
    }

    void modelChange(String model)
    {
        System.out.println("Wheel model changed");
        this.model = model;
    }

    @Override
    public String toString() {
        return "Wheel size = " + size + ", wheel model = '" + model  + "', wheel price=" + price+';'+'\n';
    }
}
