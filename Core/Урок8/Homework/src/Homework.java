import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Months[] months = Months.values();
        Seasons[] seasons = Seasons.values();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Завдання №1");
        System.out.println("1. Перевірити чи є такий місяць");
        System.out.println("2. Вивести всі місяці з такою ж порою року");
        System.out.println("3. Вивести всі місяці які мають таку саму кількість днів");
        System.out.println("4. Вивести на екран всі місяці які мають меншу кількість днів");
        System.out.println("5. Вивести на екран всі місяці які мають більшу кількість днів");
        System.out.println("6. Вивести на екран наступну пору року");
        System.out.println("7. Вивести на екран попередню пору року");
        System.out.println("8. Вивести на екран всі місяці які мають парну кількість днів");
        System.out.println("9. Вивести на екран всі місяці які мають непарну кількість днів");
        System.out.println("10. Вивести на екран чи введений з консолі місяць має парну кількість днів");
        System.out.println("Уведіть свою дію (Номер дії)");
        int action = scanner.nextInt();
        switch (action){
            case 1:
                System.out.println("Уведіть місяць (на англійській): ");
                String month = scanner.nextLine();
                month = scanner.nextLine();
                month = month.toUpperCase();
                int count = 0;
                for (int i = 0; i < months.length; i++)
                {
                    if (months[i].toString().equals(month))
                    {
                        count++;
                    }
                }
                if (count>0)
                {
                    System.out.println("Існує");
                }
                else {
                    System.out.println("Не існує");
                }
                break;
            case 2:
                System.out.println("Уведіть пору року (на англійській)");
                String season = scanner.nextLine();
                season = scanner.nextLine();
                season=season.toUpperCase();
                for (int i = 0; i < months.length; i++)
                {
                    if (months[i].getSeason().toString().equals(season))
                    {
                        System.out.println(months[i]);
                    }
                }
                break;
            case 3:
                System.out.println("Уведіть кількість днів");
                int day = scanner.nextInt();

                for (int i = 0; i < months.length; i++)
                {
                    if (months[i].getDay()==day)
                    {
                        System.out.println(months[i]);
                    }
                }
                break;
            case 4:
                System.out.println("Уведіть кількість днів");
                day = scanner.nextInt();

                for (int i = 0; i < months.length; i++)
                {
                    if (months[i].getDay()<day)
                    {
                        System.out.println(months[i]);
                    }
                }
                break;
            case 5:
                System.out.println("Уведіть кількість днів");
                day = scanner.nextInt();

                for (int i = 0; i < months.length; i++)
                {
                    if (months[i].getDay()>day)
                    {
                        System.out.println(months[i]);
                    }
                }
                break;
            case 6:
                System.out.println("Уведіть пору року (на англійській)");
                season = scanner.nextLine();
                season = scanner.nextLine();
                season= season.toUpperCase();
                for (int i = 0; i < seasons.length; i++)
                {
                    if (seasons[i].toString().equals(season))
                    {
                        if (i==(seasons.length-1))
                        {
                            System.out.println(seasons[0]);
                        }
                        else {
                            System.out.println(seasons[i+1]);
                        }
                    }
                }
                break;
            case 7:
                System.out.println("Уведіть пору року (на англійській)");
                season = scanner.nextLine();
                season = scanner.nextLine();
                season= season.toUpperCase();
                for (int i = 0; i < seasons.length; i++)
                {
                    if (seasons[i].toString().equals(season))
                    {
                        if (i==0)
                        {
                            System.out.println(seasons[seasons.length-1]);
                        }
                        else {
                            System.out.println(seasons[i-1]);
                        }
                    }
                }
                break;
            case 8:
                for (int i = 0; i < months.length; i++)
                {
                    if (months[i].getDay()%2==0)
                    {
                        System.out.println(months[i]);
                    }
                }
                break;
            case 9:
                for (int i = 0; i < months.length; i++)
                {
                    if (months[i].getDay()%2!=0)
                    {
                        System.out.println(months[i]);
                    }
                }
                break;
            case 10:
                System.out.println("Уведіть місяць (на англійській): ");
                month = scanner.nextLine();
                month = scanner.nextLine();
                month = month.toUpperCase();
                for (int i = 0; i < months.length; i++)
                {
                    if (months[i].toString().equals(month))
                    {
                        if (months[i].getDay()%2==0){
                            System.out.println("Ta");
                        }
                        else {
                            System.out.println("Ні");
                        }
                    }
                }
                break;
            default:
                System.out.println("Invalid data");
                break;
        }
        System.out.println("Завдання №2");
        System.out.println("Уведіть число");
        double number = scanner.nextDouble();
        if (number%1==0)
        {
            if (number%2==0){
                System.out.println("Парне");
            }
            else {
                System.out.println("Число не є парним");
            }
        }
        else {
            System.out.println("Число дробове");
        }
        System.out.println("Завдання №2");
        System.out.println("Уведіть число 1");

        double number1 = scanner.nextDouble();
        System.out.println("Уведіть число 2");
        double number2 = scanner.nextDouble();
        if (number1%1==0)
        {
            if(number2%1==0)
            {
                System.out.println((int)number1+" + "+(int)number2+" = "+(int)(number1+number2));
            }
            else {
                System.out.println("Число 2 дробове");
            }

        }
        else {
            System.out.println("Число 1 дробове");
        }
    }
}
