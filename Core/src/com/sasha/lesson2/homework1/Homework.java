package com.sasha.lesson2.homework1;

public class Homework {
    public static void main(String[] args) {
        CoffeeRobot coffeeRobot = new CoffeeRobot();
        Robot robot = new Robot();
        RobotDancer robotDancer = new RobotDancer();
        RobotCoocker robotCoocker = new RobotCoocker();
        coffeeRobot.work();
        robot.work();
        robotCoocker.work();
        robotDancer.work();
        Robot[] robotArray = {robot, robotDancer, robotCoocker, coffeeRobot};
        for (Robot r:robotArray) {
            r.work();
        }
    }
}
