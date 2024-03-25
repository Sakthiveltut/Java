public class PriorityExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable(), "Thread 1");
        Thread thread2 = new Thread(new MyRunnable(), "Thread 2");

        // Set the priority of thread1 to maximum (10)
        thread1.setPriority(Thread.MAX_PRIORITY);

        // Set the priority of thread2 to minimum (1)
        thread2.setPriority(Thread.MIN_PRIORITY);

        // Start the threads
        thread1.start();
        thread2.start();
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " with priority " + Thread.currentThread().getPriority() + " is running.");
    }
}
