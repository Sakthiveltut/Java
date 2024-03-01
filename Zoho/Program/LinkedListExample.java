import java.util.*;

public class LinkedListExample{

	public static void main(String[] args){
	
		System.out.println("LinkedList");
		
		LinkedList<Integer> ll = new LinkedList<>();
		
		ll.add(1);

		ll.add(2);
		
		ll.add(3);

		System.out.println(ll);

		ll.set(1,0);

		System.out.println("update "+ll);

		ll.remove(2);

		System.out.println("remove "+ll);

		ll.add(0,10);

		System.out.println(ll);

		System.out.println(ll.size());

		System.out.println(ll.get(1));


		List<Integer> additionalElements = new ArrayList<>();
       		additionalElements.add(99);
        	additionalElements.add(999);

	        ll.addAll(additionalElements);

		ll.addAll(2,additionalElements);

		System.out.println(ll);

	
	}
}