import java.util.Scanner;

public class RunnableThread implements Runnable {
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = 0;
        int secondNumber = 1;
        int currentNumber;
        System.out.println("Enter count of words");
        int wordCount = scanner.nextInt();
        System.out.print("Потік Runnable : ");
        if (wordCount == 1){
            System.out.print(firstNumber + ";");
            wordCount=0;
        } else if(wordCount == 2 ){
            System.out.print(firstNumber + ", ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(secondNumber + ";");
            wordCount=0;
        } else {
            System.out.print(firstNumber + ", ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(secondNumber + ", ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            wordCount-=2;
            while (wordCount > 0) {
                currentNumber = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = currentNumber;
                if (wordCount == 1) {
                    System.out.print(currentNumber + ";");
                } else {
                    System.out.print(currentNumber + ", ");
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                wordCount--;
            }
        }
        System.out.println();
    }
}
