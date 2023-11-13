package Thread.E_3_Synchronized_Method.A_1_Synchronized_Method.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SynchronizedExample {
    private int sharedCounter = 0;
    private Lock lock = new ReentrantLock();

    public void lockBasedSynchronizedMethod() {
        lock.lock();  // Acquire the lock
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread ID: " + Thread.currentThread().getId() +
                        ", Counter: " + sharedCounter);
                sharedCounter++;
            }
        } finally {
            lock.unlock();  // Release the lock
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SynchronizedExample example = new SynchronizedExample();

        // Create two threads to access the lock-based synchronized method
        Thread thread1 = new Thread(example::lockBasedSynchronizedMethod);
        Thread thread2 = new Thread(example::lockBasedSynchronizedMethod);

        // Start the threads
        thread1.start();
        thread2.start();
    }
}
