import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        ExecutorService executor = Executors.newSingleThreadExecutor();
        System.out.println("Task1");
        MyThread myThread = new MyThread();
        Thread thread = new Thread(new RunnableThread());
        myThread.start();
        myThread.join();
        thread.start();
        thread.join();
        System.out.println("Task2");
        executor.submit(new MyThread());
        executor.submit(new RunnableThread());
        executor.shutdown();

    }
}

