import java.util.*;

public class PriorityQueueExample {
    public static void main(String[] args) {
        
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
		
	PriorityQueue<Integer> pq2 = new PriorityQueue<>();
	
	//pq1.addAll(Arrays.asList(32,23,45,35,86));	

	for(int i=1;i<=10;i++){
		//pq1.add(i);	
	}

	//pq2.addAll(pq1);

	pq1.add(5);
	pq1.add(4);
	pq1.add(3);
	pq1.add(2);
	pq1.add(1);
     		
        //System.out.println("First element:"+pq1.peek()); //null
	System.out.println("Data: " + pq1);
	
	//System.out.println("First element:"+pq1.offer(0)+pq1.offer(1)+pq1.offer(2)); //null
	System.out.println("Data: " + pq2);

        //System.out.println("Removed element: "+pq1.poll()); //null
	System.out.println("Data: " + pq1);
	
	//System.out.println("Removed element: "+pq1.remove()); //NoSuchElementException
	System.out.println("Data: " + pq1);

        //System.out.println("Is pq1 empty? " +pq1.isEmpty()); //true
	System.out.println("Data: " + pq1);

        //System.out.println("Size of the pq1: "+pq1.size()); //0
	System.out.println("Data: " + pq1);

	//System.out.println("First element: "+pq1.element()); //NoSuchElementException
	System.out.println("Data: " + pq1);
	
	//System.out.println("First element: "+pq1.add(1)); //NoSuchElementException
	System.out.println("Data q1: " + pq1);
	
    }
}
