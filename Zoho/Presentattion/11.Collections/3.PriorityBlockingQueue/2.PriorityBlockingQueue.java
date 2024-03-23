import java.util.concurrent.*;
import java.util.*;

public class QueueExample {
	@SuppressWarnings("rawtypes")
    public static void main(String[] args) {
	
	ArrayList<Integer> al = new ArrayList<>();
	al.add(342);
	al.add(343);
	
	Vector<Integer> v = new Vector<>();
	
	for(int i=1;i<=10;i++){
		v.addElement(i);
	}
	
	PriorityBlockingQueue<Integer> obj1 = new PriorityBlockingQueue<>(al);

	System.out.println(obj1);
    }
}
