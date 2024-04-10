import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        
    Queue<Integer> queue = new LinkedList<>();
    Deque<Integer> deque = new LinkedList<>();

	
	Queue<Integer> queue1 = new LinkedList<>();	

	for(int i=1;i<=10;i++){
		queue.add(i);	
	}
	deque.addAll(queue);
	System.out.println(deque);
	deque.pollFirst();
	deque.poll();
	System.out.println(deque);
	
	/*queue1.addAll(Arrays.asList(345,435));
	queue1.addAll(queue);
	
	//queue1.addAll(queue);
     		
        //System.out.println("First element:"+queue.peek()); //null
	System.out.println("Data: " + queue);
	
	System.out.println("First element:"+queue.offer(0)+queue.offer(1)+queue.offer(2)); //null
	System.out.println("Data: " + queue);

        //System.out.println("Removed element: "+queue.poll()); //null
	System.out.println("Data: " + queue);
	
	//System.out.println("Removed element: "+queue.remove()); //NoSuchElementException
	System.out.println("Data: " + queue);

        //System.out.println("Is queue empty? " +queue.isEmpty()); //true
	System.out.println("Data: " + queue);

        //System.out.println("Size of the queue: "+queue.size()); //0
	System.out.println("Data: " + queue);

	//System.out.println("First element: "+queue.element()); //NoSuchElementException
	System.out.println("Data: " + queue);
	
	//System.out.println("First element: "+pqueue.add(1)); //NoSuchElementException
	System.out.println("Data q1: " + queue1);
	
	*/
	
    }
}
