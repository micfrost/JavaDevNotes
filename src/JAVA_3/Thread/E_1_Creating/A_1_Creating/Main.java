package JAVA_3.Thread.E_1_Creating.A_1_Creating;


        class MyRunnable implements Runnable {
            private String threadName;

            public MyRunnable(String threadName) {
                this.threadName = threadName;
            }

            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Thread " + threadName + ": " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Thread " + threadName + " interrupted.");
                    }

                }
            }
        }

        public class Main {
            public static void main(String[] args) {
                // Create threads using the Runnable interface
                Thread thread1 = new Thread(new MyRunnable("JAVA_3.Thread 1"));
                Thread thread2 = new Thread(new MyRunnable("JAVA_3.Thread 2"));
                Thread thread3 = new Thread(new MyRunnable("JAVA_3.Thread 3"));

                // Start the threads
                thread1.start();
                thread2.start();
                thread3.start();

            }
        }

