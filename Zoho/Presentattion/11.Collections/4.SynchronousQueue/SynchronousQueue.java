import java.util.concurrent.*;
import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        
        SynchronousQueue<Integer> obj1 = new SynchronousQueue<>();
	
	SynchronousQueue<Integer> obj2 = new SynchronousQueue<>();

	for(int i=1;i<=10;i++){
		obj1.put(i);
	}	
	
	obj2.addAll(obj1);
	
	obj2.addAll(obj1);
     		
        System.out.println("First element:"+obj1.peek()); //null
	System.out.println("Data: " + obj1);
	
	System.out.println("First element:"+obj1.offer(0)+obj1.offer(1)+obj1.offer(2)); //null
	System.out.println("Data: " + obj1);

        System.out.println("Removed element: "+obj1.poll()); //null
	System.out.println("Data: " + obj1);
	
	System.out.println("Removed element: "+obj1.remove(10)); //NoSuchElementException
	System.out.println("Data: " + obj1);

        System.out.println("Is obj1 empty? " +obj1.isEmpty()); //true
	System.out.println("Data: " + obj1);

        System.out.println("Size of the obj1: "+obj1.size()); //0
	System.out.println("Data: " + obj1);

	obj2.clear();
	System.out.println("cleared Data obj2: " + obj2);
	
	//System.out.println("removeAll on obj2: "+obj2.removeAll(obj1)); 
	System.out.println("Data obj2: " + obj2);

	System.out.println("removeAll on obj2: "+obj2.retainAll(obj1)); //common data
	System.out.println("Data obj2: " + obj2);


	obj1.forEach(element -> System.out.println(element+" "));
    }
}
