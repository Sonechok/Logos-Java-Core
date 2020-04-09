import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Number[] array = new Number[]{12, 4.2, 8, 0, -120, 13, 13, 4, 11};
        Number[] newArray = new Number[array.length];
        Collection collection = new Collection(array);
        Collection.FirstTask firstTask = collection.new FirstTask();
        Collection.SecondTask secondTask = collection.new SecondTask();
        Iterator<Number> thirdTask = collection.thirdTask();
        Collection.FifthTask fifthTask = new Collection.FifthTask(array);

        System.out.println("Початковий масив");
        printInfo(array);
        System.out.println("Заввдання1: виводить значення масиву від першого до останнього. \n" +
                "Зроблена заміна непарних елементів на нуль");
        int currentIndex=0;
        while (firstTask.hasNext()){
            newArray[currentIndex] = firstTask.next();
            currentIndex++;
        }
        currentIndex = 0;
        Main.printInfo(newArray);

        System.out.println("Завдання2: виводить від останнього до першого значення через одну цифру");
        while (secondTask.hasNext()){
            newArray[currentIndex] = secondTask.next();
            currentIndex++;
        }
        currentIndex = 0;
        Main.printInfo(newArray);

        System.out.println("Завдання3: виводить від останнього до першого елементу масиву. \n" +
                "Перевірити кожен третій елемент масиву від останнього чи він непарний, \n" +
                "якщо так то вивести дані елементи на консоль");
        while (thirdTask.hasNext()){
            newArray[currentIndex] = thirdTask.next();
            currentIndex++;
        }
        Main.printInfo(newArray);

        System.out.println("Завдання4: від першого до останнього елементу масиву, \n" +
                "перевіряє кожен п’ятий елемент масиву, якщо він парний то віднімає від нього число 100, \n" +
                "і виводить на консоль ці числа.");
        Main.printInfo(collection.fourthTask());

        System.out.println("Завдання5 :від першого до останнього елемента масиву. \n" +
                "Перевіряє кожен другий елемент масив на парність, якщо він парний, \n" +
                "тоді робить з нього непарний і виводить дані елементи на консоль");
        currentIndex = 0;
        while (fifthTask.hasNext()){
            newArray[currentIndex] = fifthTask.next();
            currentIndex++;
        }
        Main.printInfo(newArray);
    }

    static void printInfo(Number[] numbers){
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == null){
            } else {
                System.out.print(numbers[i] + "; ");
            }
        }
        System.out.println();
    }
}

