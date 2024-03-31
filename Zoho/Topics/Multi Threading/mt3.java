class MyRunnable implements Runnable {
    private int counter = 0;

    public synchronized void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " Counter: " + counter++);
            try {
                Thread.sleep(100); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class mt3{
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();

        // Creating multiple threads that share the same instance of MyRunnable
        Thread thread1 = new Thread(myRunnable, "Thread 1");
        Thread thread2 = new Thread(myRunnable, "Thread 2");

        // Start the threads
        thread1.start();
        thread2.start();
    }
}
