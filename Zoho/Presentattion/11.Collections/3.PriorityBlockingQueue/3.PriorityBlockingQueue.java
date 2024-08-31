import java.util.concurrent.*;
import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
	
	PriorityBlockingQueue<Integer> obj1 = new PriorityBlockingQueue<>(2);

	obj1.add(10);
		obj1.add(30);

	obj1.add(20);

	System.out.println(obj1);

    }
}
