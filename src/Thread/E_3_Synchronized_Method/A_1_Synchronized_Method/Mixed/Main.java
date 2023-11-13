package Thread.E_3_Synchronized_Method.A_1_Synchronized_Method.Mixed;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//`synchronizedMethod` is a synchronized method, which means only one thread can execute it at a time.
// In the `lockBasedSynchronizedMethod`, we use a lock to achieve the same synchronization effect,
// allowing only one thread to execute the critical section at any given time.


class SynchronizedExample {
    private int sharedCounter = 0;

    // Synchronized method
    public synchronized void synchronizedMethod() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread ID: " + Thread.currentThread().getId() +
                    ", Counter (synchronizedMethod): " + sharedCounter);
            sharedCounter++;
        }
    }

    // Lock-based synchronized method
    private Lock lock = new ReentrantLock();

    public void lockBasedSynchronizedMethod() {
        lock.lock();  // Acquire the lock
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread ID: " + Thread.currentThread().getId() +
                        ", Counter (lockBasedSynchronizedMethod): " + sharedCounter);
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

        // Create two threads to access the synchronized method
        Thread thread1 = new Thread(example::synchronizedMethod);
        Thread thread2 = new Thread(example::synchronizedMethod);

        // Create two threads to access the lock-based synchronized method
        Thread thread3 = new Thread(example::lockBasedSynchronizedMethod);
        Thread thread4 = new Thread(example::lockBasedSynchronizedMethod);

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
