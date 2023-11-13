package Thread.E_7_Priority.A_1_Priority;

class PriorityThread extends Thread {
    public void run() {
        System.out.println("Thread with priority " + getPriority() + " is running.");
    }
}

public class Main {
    public static void main(String[] args) {
        PriorityThread thread1 = new PriorityThread();
        PriorityThread thread2 = new PriorityThread();

        // Setting thread priorities
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
    }
}
