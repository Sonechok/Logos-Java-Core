import java.util.ArrayList;
import java.util.Scanner;

public class RunnableThread implements Runnable {

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int firstNumber = 0;
        int secondNumber = 1;
        int currentNumber;
        System.out.println("Enter count of numbers");
        int numbersCount = scanner.nextInt();
        System.out.print("Потік Runnable : ");
        if (numbersCount == 1){
            System.out.print(firstNumber + ";");
        } else if(numbersCount == 2 ){
            arrayList.add(firstNumber);
            arrayList.add(secondNumber);
            for(int i = arrayList.size()-1 ; i>=0 ; i--){
                if (i == 0) {
                    System.out.print(arrayList.get(i) + ";");
                } else {
                    System.out.print(arrayList.get(i) + ", ");
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } else if (numbersCount<=0){
            System.out.print(";");
        } else {
            arrayList.add(firstNumber);
            arrayList.add(secondNumber);
            numbersCount-=2;
            while (numbersCount > 0) {
                currentNumber = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = currentNumber;
                arrayList.add(currentNumber);
                numbersCount--;
            }
            for(int i = arrayList.size()-1 ; i>=0 ; i--){
                if (i == 0) {
                    System.out.print(arrayList.get(i) + ";");
                } else {
                    System.out.print(arrayList.get(i) + ", ");
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println();
    }
}
