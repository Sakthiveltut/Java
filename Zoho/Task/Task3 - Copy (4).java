import java.util.*;

public class Main {
 public static void main(String[] args) {
  List<String> names = new ArrayList<String>(); 
   
  names.add("rahul");
  names.add("mosesh");  //1 
  names.add("sakthi"); 
  names.add("mosesh");  //2
  names.add("jenishiya");
  names.add("madan"); 
  names.add("mosesh");  //3
  names.add("jenishiya");
  names.add("rahul"); 
  names.add("mosesh");
  names.add("mosesh");  //4
  names.add("sakthi"); 
  names.add("mosesh");  //5


   	/*int index1 = names.indexOf("mosesh")+1; //2
   	
	List<String> list1 = names.subList(index1, names.lastIndexOf("mosesh")+1);
	
	int index2 = list1.indexOf("mosesh")+1; //2

	List<String> list2 = list1.subList(index2, list1.lastIndexOf("mosesh")+1);

	int index3 = list2.indexOf("mosesh");

	names.remove(index1+index2+index3);

	System.out.println(index1+""+index2+""+index3);
   
   	System.out.println(names);*/


	/*int index = names.indexOf("mosesh")+1;
	List<String> sub = names.subList(index , names.lastIndexOf("mosesh"));
	sub.remove(sub.indexOf("mosesh"));
	names.remove(index + sub.indexOf("mosesh"));
	System.out.println(names);*/

	List<String> names1 = new ArrayList<String>();
	names1.addAll(names);
	int index1 = names1.indexOf("mosesh");
	names1.remove(index1);
	int index2 = names1.indexOf("mosesh");
	names1.remove(index2);
	int index3 = names1.indexOf("mosesh");
	names1.remove(index3);

	names.remove(index1+index2+index3-1);
	System.out.println(index1+""+index2+""+index3);
	System.out.println(names);
 }
}
