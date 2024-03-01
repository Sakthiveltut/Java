import java.util.*;

public class queueExample{

	public static void main(String[] args){

	Queue<Integer> q = new LinkedList<>();

	q.add(1);
	q.add(2);
	q.add(3);
	q.add(4);
	q.offer(0);
	
	System.out.println(q);

	int delete = q.remove();

	System.out.println("delete "+delete);

	int pollElement = q.poll();

	System.out.println("pollElement "+pollElement);

	

	}
}
