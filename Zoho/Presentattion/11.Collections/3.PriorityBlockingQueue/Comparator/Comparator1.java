import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Creating a priority queue with a custom comparator
        PriorityQueue<Integer> pq = new PriorityQueue<>(new CustomComparator());

        // Adding elements to the priority queue
        pq.offer(3);
        pq.offer(1);
        pq.offer(2);
	pq.offer(5);
	pq.offer(9);
	pq.offer(21);
	pq.offer(4);

        // Retrieving the comparator used by the priority queue
        Comparator<? super Integer> comparator = pq.comparator();

        // Printing the comparator (if any)
        if (comparator != null) {
            System.out.println("Custom comparator in use: " + comparator);
        } else {
            System.out.println("Using natural ordering");
        }

        // Printing the elements of the priority queue
        System.out.println("PriorityQueue elements:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}

// Custom comparator class
class CustomComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        // Custom logic for comparing integers in reverse order
        return o1.compareTo(o2);
    }
}
