import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueuePerformanceExample {
    public static void main(String[] args) {
 
        int smallQueueSize = 1000;
        benchmarkQueue(new LinkedBlockingQueue<>(smallQueueSize), "LinkedBlockingQueue (Small)");
        benchmarkQueue(new ArrayBlockingQueue<>(smallQueueSize), "ArrayBlockingQueue (Small)");

        // Large Queue
        int largeQueueSize = 1000000000;
        benchmarkQueue(new LinkedBlockingQueue<>(largeQueueSize), "LinkedBlockingQueue (Large)");
        benchmarkQueue(new ArrayBlockingQueue<>(largeQueueSize), "ArrayBlockingQueue (Large)");
    }

    public static void benchmarkQueue(LinkedBlockingQueue<Integer> queue, String queueType) {
        long startTime = System.currentTimeMillis();

        // Adding elements to the queue
        for (int i = 0; i < queue.size(); i++) {
            queue.add(i);
        }
	for (int i = 0; i < queue.size(); i++) {
            queue.take();
        }

        long endTime = System.currentTimeMillis();
        System.out.println(queueType + " Time taken to add elements: " + (endTime - startTime) + " ms");
    }

    public static void benchmarkQueue(ArrayBlockingQueue<Integer> queue, String queueType) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < queue.size(); i++) {
            queue.add(i);
        }
	for (int i = 0; i < queue.size(); i++) {
            queue.take();
        }


        long endTime = System.currentTimeMillis();
        System.out.println(queueType + " Time taken to add elements: " + (endTime - startTime) + " ms");
    }
}
