package com.sasha.lesson7;

public abstract class Plane {
    public void startingEngine()
    {
        System.out.println("I will be ready in "+((int)(20+Math.random()*69) +" seconds"));
    }
    public void planeTakeoff()
    {
        System.out.println("I will fly "+((Math.random()*1000) +" kilometers"));
    }
    public void planeLanding()
    {
        System.out.println("Plane is landing");
    }
}
