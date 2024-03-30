import java.util.concurrent.SynchronousQueue;


public class SynchronousQueueExample {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();

       
        Thread producerThread = new Thread(new Producer(queue));
        Thread consumerThread = new Thread(new Consumer(queue));

        producerThread.start();
        consumerThread.start();

        // Wait for threads to finish
        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread exiting.");
    }
}
class Producer implements Runnable {
    private SynchronousQueue<Integer> queue;

    public Producer(SynchronousQueue<Integer> queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Producing item: " + i);
                queue.put(i); // Put item into the queue, will block until consumed
                Thread.sleep(1000); // Simulate some delay
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer implements Runnable {
    private SynchronousQueue<Integer> queue;

    public Consumer(SynchronousQueue<Integer> queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                Integer item = queue.take(); // Take item from the queue, will block until produced
                System.out.println("Consumed item: " + item);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

