import java.util.Scanner;

public class Exception {
    public static void main(String[] args) throws MyException {
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
        scanner.nextLine();
        try {
            if (action == 1) {
                System.out.println("Уведіть місяць (на англійській): ");
                String month = scanner.nextLine();
                month = month.toUpperCase();
                if (month.equals(Months.APRIL)||month.equals(Months.AUGUST)||month.equals(Months.DECEMBER)
                        ||month.equals(Months.FEBRUARY)||month.equals(Months.JUNE)||month.equals(Months.JANUARY)
                        ||month.equals(Months.MARCH)||month.equals(Months.MAY)||month.equals(Months.JULY)
                        ||month.equals(Months.SEPTEMBER)||month.equals(Months.OCTOBER)||month.equals(Months.NOVEMBER)) {
                    int count = 0;
                    for (int i = 0; i < months.length; i++) {
                        if (months[i].toString().equals(month)) {
                            count++;
                        }
                    }
                    if (count > 0) {
                        System.out.println("Існує");
                    } else {
                        System.out.println("Не існує");
                    }
                }else {
                    throw new WrongInputConsoleParametersException();
                }
            } else if (action == 2) {
                System.out.println("Уведіть пору року (на англійській)");
                String season = scanner.nextLine();
                season = season.toUpperCase();
                if(season.equals(Seasons.AUTUMN)||season.equals(Seasons.SPRING)
                        ||season.equals(Seasons.SUMMER)||season.equals(Seasons.WINTER)) {
                    for (int i = 0; i < months.length; i++) {
                        if (months[i].getSeason().toString().equals(season)) {
                            System.out.println(months[i]);
                        }
                    }
                }else {
                    throw new WrongInputConsoleParametersException();
                }
            } else if (action == 3) {
                System.out.println("Уведіть кількість днів");
                int day = scanner.nextInt();
                if(day>0 && day<32) {
                    for (int i = 0; i < months.length; i++) {
                        if (months[i].getDay() == day) {
                            System.out.println(months[i]);
                        }
                    }
                }else {
                    throw new WrongInputConsoleParametersException();
                }
            } else if (action == 4) {
                System.out.println("Уведіть кількість днів");
                int day = scanner.nextInt();
                if(day>0 && day<32) {
                    for (int i = 0; i < months.length; i++) {
                        if (months[i].getDay() < day) {
                            System.out.println(months[i]);
                        }
                    }
                }else {
                    throw new WrongInputConsoleParametersException();
                }
            } else if (action == 5) {
                System.out.println("Уведіть кількість днів");
                int day = scanner.nextInt();
                if(day>0 && day<32) {
                    for (int i = 0; i < months.length; i++) {
                        if (months[i].getDay() > day) {
                            System.out.println(months[i]);
                        }
                    }
                }else {
                    throw new WrongInputConsoleParametersException();
                }
            } else if (action == 6) {
                System.out.println("Уведіть пору року (на англійській)");
                String season = scanner.nextLine();
                season = season.toUpperCase();
                if(season.equals(Seasons.AUTUMN)||season.equals(Seasons.SPRING)
                        ||season.equals(Seasons.SUMMER)||season.equals(Seasons.WINTER)) {
                    for (int i = 0; i < seasons.length; i++) {
                        if (seasons[i].toString().equals(season)) {
                            if (i == (seasons.length - 1)) {
                                System.out.println(seasons[0]);
                            } else {
                                System.out.println(seasons[i + 1]);
                            }
                        }
                    }
                }else {
                    throw new WrongInputConsoleParametersException();
                }
            } else if (action == 7) {
                System.out.println("Уведіть пору року (на англійській)");
                String season = scanner.nextLine();
                season = season.toUpperCase();
                if(season.equals(Seasons.AUTUMN)||season.equals(Seasons.SPRING)
                        ||season.equals(Seasons.SUMMER)||season.equals(Seasons.WINTER)) {
                    for (int i = 0; i < seasons.length; i++) {
                        if (seasons[i].toString().equals(season)) {
                            if (i == 0) {
                                System.out.println(seasons[seasons.length - 1]);
                            } else {
                                System.out.println(seasons[i - 1]);
                            }
                        }
                    }
                }else {
                    throw new WrongInputConsoleParametersException();
                }
            } else if (action == 8) {
                for (int i = 0; i < months.length; i++) {
                    if (months[i].getDay() % 2 == 0) {
                        System.out.println(months[i]);
                    }
                }
            } else if (action == 9) {
                for (int i = 0; i < months.length; i++) {
                    if (months[i].getDay() % 2 != 0) {
                        System.out.println(months[i]);
                    }
                }
            } else if (action == 10) {
                System.out.println("Уведіть місяць (на англійській): ");
                String month = scanner.nextLine();
                month = month.toUpperCase();
                if (month.equals(Months.APRIL)||month.equals(Months.AUGUST)||month.equals(Months.DECEMBER)
                        ||month.equals(Months.FEBRUARY)||month.equals(Months.JUNE)||month.equals(Months.JANUARY)
                        ||month.equals(Months.MARCH)||month.equals(Months.MAY)||month.equals(Months.JULY)
                        ||month.equals(Months.SEPTEMBER)||month.equals(Months.OCTOBER)||month.equals(Months.NOVEMBER)) {
                    for (int i = 0; i < months.length; i++) {
                        if (months[i].toString().equals(month)) {
                            if (months[i].getDay() % 2 == 0) {
                                System.out.println("Ta");
                            } else {
                                System.out.println("Ні");
                            }
                        }
                    }
                }else {
                    throw new WrongInputConsoleParametersException();
                }
            } else {
                System.out.println("Invalid data");
                throw new WrongInputConsoleParametersException();
            }
        }
        catch (WrongInputConsoleParametersException e) {
            e.printStackTrace();
        }
        System.out.println("Завдання №2");
        System.out.println("Уведіть число 1");
        double number1 = scanner.nextDouble();
        System.out.println("Уведіть число 2");
        double number2 = scanner.nextDouble();
        System.out.println(Methods.addition(number1, number2));
    }
}
