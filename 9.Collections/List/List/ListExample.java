import java.util.*;

public class ListExample{


	public static void main(String[] args){
		
		

		//List<? super Integer> list = new ArrayList<>();
		List<?> list = new ArrayList<>();
		
		//list.add(435);
		((List<Object>) list).add(23);	
		//list.add(new Long(234));				
		//list.add(new Integer(234));	
		
		System.out.println(list);
		
	}
}