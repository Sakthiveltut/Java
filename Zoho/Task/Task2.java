import java.util.*;
public class Test{

	public static void main(String[] args){

	/*List<String> names = new ArrayList<String>();
		
		names.add("rahul");
		names.add("mosesh");
		names.add("sakthi");
		names.add("mosesh");
		names.add("madan");
		names.add("mosesh");
		names.add("jenishiya");
		names.add("mosesh");
		
		List<String> sub = names.subList(names.indexOf("mosesh"), names.lastIndexOf("mosesh"));

		List<String> sub1 = sub.subList(names.indexOf("mosesh"), sub.lastIndexOf("mosesh"));
		
		System.out.println(sub1);*/








		List<String> names = new ArrayList<String>();
		
		names.add("rahul");
		names.add("mosesh");

		names.add("sakthi");
		names.add("mosesh");
		names.add("madan");
		names.add("mosesh");
		names.add("jenishiya");

		names.add("mosesh");
		
		int index = names.indexOf("mosesh") + 1; //2
		
		List<String> sub = names.subList(index, names.lastIndexOf("mosesh"));
		
		names.remove(index + sub.indexOf("mosesh"));
		
		System.out.println(names);
	
		
	}
}
