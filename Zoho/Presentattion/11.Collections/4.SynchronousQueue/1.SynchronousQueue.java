import java.util.concurrent.*;

public class QueueExample {
    public static void main(String[] args) {
        
        SynchronousQueue<Integer> obj1 = new SynchronousQueue<Integer>();
	
	SynchronousQueue<Integer> obj2 = new SynchronousQueue<Integer>();	
	
	try{
	
		obj1.put(12);
	}catch(InterruptedException e){
		e.printStackTrace();
	}

	//obj1.clear();

     	/*System.out.println("Original obj1 Data: " + obj1);	
	System.out.println("Original obj2 Data: " + obj2);
	
        System.out.println("\npeek() "+obj1.peek()); //null
	System.out.println("Data: " + obj1);
	
	System.out.println("\noffer() "+obj1.offer(0)); 
	System.out.println("Data: " + obj1);

        System.out.println("\npoll() "+obj1.poll()); //null
	System.out.println("Data: " + obj1);
	
	System.out.println("\nremove() "+obj1.remove());  //NoSuchElementException
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

	System.out.println("\nelement() "+obj1.element()); //NoSuchElementException
	System.out.println("Data: " + obj1);

	System.out.println("\ndrainTo() "+obj1.drainTo(list1,6));
	System.out.println("list1 Data: " + list1);
	System.out.println("obj1 Data: " + obj1);
	
	System.out.println("\ndrainTo() "+obj1.drainTo(list1));
	System.out.println("list1 Data: " + list1);
	System.out.println("obj1 Data: " + obj1);

	System.out.println("\nremoveIf() "+obj1.removeIf(i -> i<3));
	System.out.println("Data: " + obj1);

	System.out.println("\nremoveAll "+obj2.removeAll(obj1)); 
	System.out.println("Data obj2: " + obj2);

	obj1.addAll(Arrays.asList(3450,4350,50));

	System.out.println("\nretainAll "+obj2.retainAll(obj1)); //common data
	System.out.println("Data obj2: " + obj2);

	obj1.forEach(element -> System.out.println(element+" "));*/

	//obj1.forEach(System.out::println);
	
    }
}
