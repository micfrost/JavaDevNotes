package Thread.E_5_Threadpool_ExecutorService.A_1_ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        // Create a thread pool with 3 threads
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Submit tasks for execution
        for (int i = 1; i <= 10; i++) {
            Runnable task = new Task(i);
            executorService.submit(task);
        }

        // Shutdown the thread pool after all tasks are completed
        executorService.shutdown();
    }
}

class Task implements Runnable {
    private int taskId;

    public Task(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("Task " + taskId + " is being executed by thread: " + Thread.currentThread().getName());

        // Simulate some task processing time
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Task " + taskId + " completed.");
    }
}
