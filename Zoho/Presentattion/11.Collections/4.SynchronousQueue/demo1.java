import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) {
        // Create a SynchronousQueue
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();

        try {
            // Put an element into the queue
            System.out.println("Putting data into the queue...");
		System.out.println(queue);
            queue.put(42);
	    System.out.println(queue);
            System.out.println("Data has been put into the queue");

            // This line will be reached only after the element is taken from the queue by another thread
            System.out.println("Main thread continues...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


	
    }
}
