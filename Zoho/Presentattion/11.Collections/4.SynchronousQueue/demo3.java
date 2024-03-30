import java.util.concurrent.*;

public class QueueExample {
    public static void main(String[] args) throws InterruptedException {

        SynchronousQueue<Integer> obj1 = new SynchronousQueue<>();

        obj1.offer(34); // returns false
        //obj1.offer(34); // returns false
        //obj1.poll();    // returns null

        System.out.println("Data: " + obj1);  // []


        System.out.println("peek(): " + obj1.peek());                 // null
        System.out.println("offer(0): " + obj1.offer(0));             // false
        System.out.println("poll(): " + obj1.poll());                 // null
        System.out.println("contains(50): " + obj1.contains(50));      // false
        System.out.println("remove(435): " + obj1.remove(435));       // false
        System.out.println("remainingCapacity(): " + obj1.remainingCapacity()); // 0
        System.out.println("isEmpty(): " + obj1.isEmpty());           // true
        System.out.println("size(): " + obj1.size());                 // 0

        try {
            System.out.println("element(): " + obj1.element());       // Throws NoSuchElementException
        } catch (Exception e) {
            System.out.println("element(): NoSuchElementException");
        }
        System.out.println("drainTo(): " + obj1.drainTo(new java.util.ArrayList<>())); // 0

        System.out.println("Data: " + obj1);  // []
        System.out.println("removeIf(): " + obj1.removeIf(i -> i < 3)); // false

        System.out.println("Data: " + obj1);  // []

        obj1.forEach(System.out::println);  // (no output)
    }
}
