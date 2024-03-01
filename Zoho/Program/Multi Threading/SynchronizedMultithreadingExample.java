class SharedResource {
    public int counter = 0;

    // Synchronized method
    public synchronized void increment() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + (++counter));
            try {
                Thread.sleep(100); // Simulating some processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class SynchronizedMultithreadingExample {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        // Creating multiple threads that share the same resource
        Thread thread1 = new Thread(() -> sharedResource.increment(), "Thread-1");
        Thread thread2 = new Thread(() -> sharedResource.increment(), "Thread-2");

        // Start the threads
        thread1.start();
        thread2.start();

        // Wait for both threads to complete
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final value of the counter
        System.out.println("Final Counter Value: " + sharedResource.counter);
    }
}
