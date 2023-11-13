package Thread.E_10_AtomicVariable.CH_1_AtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounterExample {
    public static void main(String[] args) {
        // Create an AtomicInteger with an initial value of 0
        AtomicInteger counter = new AtomicInteger(0);

        // Number of threads to run
        int numThreads = 5;

        // Create and start multiple threads
        Thread[] threads = new Thread[numThreads];
        for (int i = 0; i < numThreads; i++) {
            threads[i] = new IncrementThread(counter);
            threads[i].start();
        }

        // Wait for all threads to finish
        for (int i = 0; i < numThreads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Print the final value of the counter
        System.out.println("Final Counter Value: " + counter.get());
    }
}

class IncrementThread extends Thread {
    private AtomicInteger counter;

    public IncrementThread(AtomicInteger counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int j = 0; j < 1000; j++) {
            // Increment the counter atomically
            counter.incrementAndGet();
        }
    }
}
