package com.Alex.lesson7;

public class Su27 extends Plane implements SpecialAbility {
    private AirplaneControl airplaneControl=new AirplaneControl();
    private int maxSpeed;
    private String color;

    public Su27(int maxSpeed, String color) {
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    @Override
    public void NuclearStrike() {
        int bombs = (int)(1+Math.random()*10);
        if (bombs==1) {
            System.out.println(bombs+" bomb will be dropped");
        }
        else {
            System.out.println(bombs+" bombs will be dropped");
        }
    }

    @Override
    public void StealthTechnology() {
        System.out.println("Stealth: ON. Stealth time: "+(10+Math.random()*20)+" seconds");
    }

    @Override
    public void TurboAcceleration() {
        System.out.println("Turbo: ON. Max speed increased to "+((int)((this.maxSpeed+1)+Math.random()*10))+" km/h");
    }

    public void moveUp()
    {
        airplaneControl.moveUp();
    }

    public void moveDown()
    {
        airplaneControl.moveDown();
    }
    public void moveLeft()
    {
       airplaneControl.moveLeft();
    }
    public void moveRight()
    {
        airplaneControl.moveRight();
    }

}
