package Thread.E_5_ReentrantLock.A_1_Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadExample {
    private static int sharedVariable = 0;
    private static Lock lock = new ReentrantLock();

    public static void increment() {
        for (int i = 0; i < 1000000; i++) {
            lock.lock();  // Acquire the lock
            try {
                sharedVariable++;
            } finally {
                lock.unlock();  // Release the lock
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(ThreadExample::increment);
        Thread thread2 = new Thread(ThreadExample::increment);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Final shared variable value: " + sharedVariable);  // Should be 2000000
    }
}

