
import java.util.concurrent.ArrayBlockingQueue;

public class FairPolicyExample {
    public static void main(String[] args) {
        // Create a fair ArrayBlockingQueue with a capacity of 3
        //ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3, true);
	ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3, false);


        // Create producer and consumer threads
        Thread producerThread = new Thread(new Producer(queue));
        Thread consumerThread = new Thread(new Consumer(queue));

        // Start the threads
        producerThread.start();
        consumerThread.start();
    }
}

class Producer implements Runnable {
    private final ArrayBlockingQueue<Integer> queue;

    public Producer(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) { // Producing 5 items
                System.out.println("Producer: Producing item " + i);
                queue.put(i); // Put item into the queue (blocks if queue is full)
                Thread.sleep(1000); // Simulate some processing time
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Producer was interrupted");
        }
    }
}

class Consumer implements Runnable {
    private final ArrayBlockingQueue<Integer> queue;

    public Consumer(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) { // Consuming 5 items
                // Take item from the queue (blocks if queue is empty)
                int item = queue.take();
                System.out.println("Consumer: Consumed item " + item);
                Thread.sleep(2000); // Simulate some processing time
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Consumer was interrupted");
        }
    }
}
