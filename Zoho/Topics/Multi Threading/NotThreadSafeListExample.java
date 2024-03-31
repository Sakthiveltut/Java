import java.util.ArrayList;
import java.util.List;

public class NotThreadSafeListExample {
    private static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                list.add(i);  // Not thread-safe operation
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("List size: " + list.size()); 
    }
}
