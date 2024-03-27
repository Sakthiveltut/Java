import java.util.*;

public class Main {
 public static void main(String[] args) {
  List<String> names = new ArrayList<String>(); 
   
  names.add("rahul"); 
  names.add("mosesh"); 
 
  names.add("sakthi"); 
  names.add("mosesh"); 
  names.add("madan"); 
  names.add("mosesh"); 
  names.add("jenishiya"); 
  names.add("mosesh"); 
  names.add("mosesh1"); 
  names.add("mosesh"); 
  names.add("mosesh1"); 
   
   
   List<String> sub = names.subList(0, names.lastIndexOf("mosesh")); 
   
   names.remove(sub.lastIndexOf("mosesh"));
   
   System.out.println(names);
 }
}
