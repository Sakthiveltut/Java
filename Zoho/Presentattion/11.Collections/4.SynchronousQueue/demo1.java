import java.util.concurrent.SynchronousQueue;

public class SynchronousQueueExample {
    public static void main(String[] args) {
        // Creating a SynchronousQueue with fairness set to true
        SynchronousQueue<Integer> queue = new SynchronousQueue<>(true);

        // Adding elements using offer()
        System.out.println("Offering 1: " + queue.offer(1));
        System.out.println("Offering 2: " + queue.offer(2));

        // Adding elements using put(), this will block until another thread removes the element
        new Thread(() -> {
            try {
                queue.put(3);
                System.out.println("Put 3");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        // Taking elements using take(), this will block until another thread offers the element
        new Thread(() -> {
            try {
                System.out.println("Taking: " + queue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        // Polling elements using poll()
        System.out.println("Polling: " + queue.poll());

        // Retrieving the element without removing it using peek()
        System.out.println("Peek: " + queue.peek());

        // Testing if the queue contains an element
        System.out.println("Contains 1: " + queue.contains(1));

        // Removing elements using remove()
        System.out.println("Removing: " + queue.remove(2));

        // Testing if the queue is empty
        System.out.println("Empty: " + queue.isEmpty());
    }
}
