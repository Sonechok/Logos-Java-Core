import java.util.Scanner;

public class Schedule {

    public static void printScheduleSwitch(String day)
    {
        System.out.println("Lesson № \t Lesson");
        switch (day){
            case "monday":
                System.out.println("2\t\t\t System analysis");
                System.out.println("3\t\t\t Equation of mathematical physics");
                break;
            case "tuesday":
                System.out.println("2\t\t\t Methods of optimization (laboratory)");
                System.out.println("4\t\t\t Database organization (laboratory)");
                break;
            case "wednesday":
                System.out.println("2\t\t\t Database organization");
                System.out.println("3\t\t\t WEB technology");
                break;
            case "thursday":
                System.out.println("3\t\t\t Methods of optimization");
                System.out.println("4\t\t\t Database organization (laboratory)");
                System.out.println("5\t\t\t WEB technology (laboratory)");
                break;
            case "friday":
                System.out.println("1\t\t\t Database organization");
                System.out.println("2\t\t\t System analysis (laboratory)");
                break;
            default:
                System.out.println("Invalid data");
        }
    }

    public static void printScheduleIf(String day)
    {
        System.out.println("Lesson № \t Lesson");
        if (day.equals("monday"))
        {
            System.out.println("2\t\t\t System analysis");
            System.out.println("3\t\t\t Equation of mathematical physics");
        }
        else if (day.equals("tuesday"))
        {
            System.out.println("2\t\t\t Methods of optimization (laboratory)");
            System.out.println("4\t\t\t Database organization (laboratory)");
        }
        else if (day.equals("wednesday"))
        {
            System.out.println("2\t\t\t Database organization");
            System.out.println("3\t\t\t WEB technology");
        }
        else if (day.equals("thursday"))
        {
            System.out.println("3\t\t\t Methods of optimization");
            System.out.println("4\t\t\t Database organization (laboratory)");
            System.out.println("5\t\t\t WEB technology (laboratory)");
        }
        else if (day.equals("friday"))
        {
            System.out.println("1\t\t\t Database organization");
            System.out.println("2\t\t\t System analysis (laboratory)");
        }
        else
        {
            System.out.println("Invalid data");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a day of week to see schedule: ");
        String day = scanner.nextLine();
        day=day.toLowerCase();
        printScheduleSwitch(day);
        System.out.println("___________________________________________________");
        printScheduleIf(day);
    }
}
