import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(new RunnableThread());
        myThread.start();
        myThread.join();
        thread.start();
        thread.join();
    }
}

