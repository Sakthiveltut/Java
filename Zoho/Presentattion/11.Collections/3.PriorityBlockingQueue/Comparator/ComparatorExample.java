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
		
	}
}