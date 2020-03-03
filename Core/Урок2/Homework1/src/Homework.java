import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        CoffeRobot coffeRobot = new CoffeRobot();
        Robot robot = new Robot();
        RobotDancer robotDancer = new RobotDancer();
        RobotCoocker robotCoocker = new RobotCoocker();
        coffeRobot.work();
        robot.work();
        robotCoocker.work();
        robotDancer.work();
        Robot[] robotArray = {robot, robotDancer, robotCoocker, coffeRobot};
        for (Robot r:robotArray) {
            r.work();
        }
    }
}
