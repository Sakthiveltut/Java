import java.util.concurrent.*;
import java.util.*;

public class QueueExample {
    public static void main(String[] args) throws InterruptedException {
        
	SynchronousQueue<Integer> obj1 = new SynchronousQueue<>(true);	//unbounded

	//obj1.clear();

	obj1.offer(34);
	//obj1.offer(34);
	//obj1.poll();

	List<Integer> list1 = new ArrayList<>();

     	System.out.println("Original obj1 Data: " + obj1);	
	//System.out.println("Original obj2 Data: " + obj2);
	
        System.out.println("\npeek() "+obj1.peek()); //null
	System.out.println("Data: " + obj1);
	
	System.out.println("\noffer() "+obj1.offer(0)); 
	System.out.println("Data: " + obj1);

        System.out.println("\npoll() "+obj1.poll()); //null
	System.out.println("Data: " + obj1);
	
	//System.out.println("\nremove() "+obj1.remove());  //NoSuchElementException
	System.out.println("Data: " + obj1);

	System.out.println("\ncontains() "+obj1.contains(50)); 
	System.out.println("Data: " + obj1);

	System.out.println("\nremove(435) "+obj1.remove(435)); 
	System.out.println("Data: " + obj1);

	System.out.println("\nremainingCapacity() "+obj1.remainingCapacity()); 
	System.out.println("Data: " + obj1);

        System.out.println("\nisEmpty() " +obj1.isEmpty()); 
	System.out.println("Data: " + obj1);

        System.out.println("\nsize() "+obj1.size()); //0
	System.out.println("Data: " + obj1);

	//System.out.println("\nelement() "+obj1.element()); //NoSuchElementException
	System.out.println("Data: " + obj1);

	System.out.println("\ndrainTo() "+obj1.drainTo(list1,6));
	System.out.println("list1 Data: " + list1);
	System.out.println("obj1 Data: " + obj1);
	
	System.out.println("\ndrainTo() "+obj1.drainTo(list1));
	System.out.println("list1 Data: " + list1);
	System.out.println("obj1 Data: " + obj1);

	System.out.println("\nremoveIf() "+obj1.removeIf(i -> i<3));
	System.out.println("Data: " + obj1);

	//System.out.println("\nremoveAll "+obj2.removeAll(obj1)); 
	//System.out.println("Data obj2: " + obj2);

	//System.out.println("\nretainAll "+obj2.retainAll(obj1)); //common data
	//System.out.println("Data obj2: " + obj2);

	obj1.forEach(element -> System.out.println(element+" "));

	//obj1.forEach(System.out::println);
	
    }
}
