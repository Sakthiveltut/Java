import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Create a queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // Enqueue (add) elements to the queue
        queue.add("Element 1");
        queue.offer("Element 2");
        queue.add("Element 3");

        // Peek at the front element without removing it
        String frontElement = queue.peek();
        System.out.println("Front element: " + frontElement);

        // Dequeue (remove) elements from the queue
        String removedElement = queue.poll();
        System.out.println("Removed element: " + removedElement);

        // Check if the queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is queue empty? " + isEmpty);

        // Size of the queue
        int size = queue.size();
        System.out.println("Size of the queue: " + size);
    }
}
