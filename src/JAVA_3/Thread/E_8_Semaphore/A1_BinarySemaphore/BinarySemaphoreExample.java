package JAVA_3.Thread.E_8_Semaphore.A1_BinarySemaphore;

import java.util.concurrent.Semaphore;

//In this example, we use a binary semaphore with one permit.
// The first thread, thread1, acquires the permit, prints "Hello,"
// and then releases the permit.

// After that, the second thread, thread2, acquires the permit, prints "World,"
// and then releases the permit.

// This coordination ensures that "Hello" and "World" are printed in the correct order.

//        The binary semaphore guarantees that only one thread can access the critical section (printing "Hello" or "World") at a time, ensuring proper synchronization.


public class BinarySemaphoreExample {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1); // Initialize a binary semaphore with one permit

        Thread thread1 = new Thread(() -> {
            try {
                semaphore.acquire(); // Acquire the permit
                System.out.println("Hello");
                semaphore.release(); // Release the permit
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                semaphore.acquire(); // Acquire the permit
                System.out.println("World");
                semaphore.release(); // Release the permit
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();
    }
}
