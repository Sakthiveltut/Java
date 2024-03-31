import java.util.concurrent.*;
import java.util.Comparator;

public class Main{

	public static void main(String[] args){
	
	//PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>(5,Comparator.naturalOrder());
	PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>(5,Comparator.reverseOrder());

	queue.add(2);
	queue.add(3);
	queue.add(1);

	Comparator<? super Integer> comparator = queue.comparator();
	
		
	System.out.println(queue);
	System.out.println(comparator);


		Comparator<Integer> customComparator = new Comparator<>(){
			//@Override			
			public int compare(Integer o1, Integer o2){
				
				return Integer.compare(o1, o2);
			}
		};

		PriorityBlockingQueue<Integer> queue1 = new PriorityBlockingQueue<>(5,customComparator);

		queue1.add(2);
		queue1.add(3);
		queue1.add(1);	

		System.out.println(queue1);
	}
}