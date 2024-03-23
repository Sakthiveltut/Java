import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample{
	
	public static void main(String[] args){
		
		ArrayList<String> al = new ArrayList<>();
		al.add("one");
		al.add("two");
		al.add("three");
		al.add("four");	
		al.add("five");
		al.add("six");
		al.add("seven");
		al.add("eight");
 
		
		/*Iterator iterator = al.iterator();

		while(iterator.hasNext())
			System.out.println(iterator.next()+ " ");*/

		for(String s:al){
			System.out.println(s);		
		}
	}
}