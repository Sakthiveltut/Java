class Counter {
    private int count = 0;

    // Synchronized method to ensure thread safety
    public synchronized void increment() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + (++count));
            try {
                Thread.sleep(100); // Simulating some processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Using Thread class
class MyThread extends Thread {
    private Counter counter;

    public MyThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        counter.increment();
    }
}

// Using Runnable interface
class MyRunnable implements Runnable {
    private Counter counter;

    public MyRunnable(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        counter.increment();
    }
}

public class MultithreadingExample {
    public static void main(String[] args) {
        Counter sharedCounter = new Counter();

        // Using Thread class
        MyThread thread1 = new MyThread(sharedCounter);
        MyThread thread2 = new MyThread(sharedCounter);

        // Using Runnable interface
        Thread thread3 = new Thread(new MyRunnable(sharedCounter));
        Thread thread4 = new Thread(new MyRunnable(sharedCounter));

        // Start all threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
