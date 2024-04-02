import java.util.*;  
public class HashMapEx1{  

	public static void main(String args[]){ 
 
	HashMap<Integer,String> map=new HashMap<Integer,String>();   
	map.put(1,"Moses");  
	map.put(2,"Abraham");    
	map.put(3,"Sakthi");   
	map.put(5,"Madan"); 
	map.put(4,"selvamadan");
	map.put(6,null);
	map.put(10,null);
	map.put(11,null);

	System.out.println(map);
	
	System.out.println("\nget() "+map.get(3));
	System.out.println(map);
	
	System.out.println("\ncontainsKey() "+map.containsKey(3));
	System.out.println(map);
	
	System.out.println("\ncontainsValue() "+map.containsValue("Moses"));
	System.out.println(map);
	
	System.out.println("\nisEmpty() "+map.isEmpty());
	System.out.println(map);
	
	System.out.println("\nkeySet() "+map.keySet());
	System.out.println(map);
	
	System.out.println("\nvalues() "+map.values());
	System.out.println(map);
	
	System.out.println("\nentrySet() "+map.entrySet());
	System.out.println(map);
	
	System.out.println("\nremove(1) "+map.remove(1));
	System.out.println(map);
	
	System.out.println("\nputIfAbsent() "+map.putIfAbsent(6,"francis"));
	System.out.println("\nputIfAbsent() "+map.putIfAbsent(6,"Afrancis"));
	System.out.println("\nputIfAbsent() "+map.putIfAbsent(70,"francis"));
	System.out.println("\nputIfAbsent() "+map.putIfAbsent(1,"Mosesh"));
	System.out.println(map);
	
	System.out.println("\ngetOrDefault() "+map.getOrDefault(1,"hello"));
	System.out.println("\ngetOrDefault() "+map.getOrDefault(20,"hello"));
	System.out.println(map);
	
	System.out.println("\nreplace() "+map.replace(2,"Rahul"));
	System.out.println(map);
	
	System.out.println("\nreplace() "+map.replace(2,"Rahul","Abraham"));
	System.out.println(map);
	
	map.replaceAll((key,value)-> key+value);
	System.out.println(map);

	System.out.println(map);

	map.clear();
	System.out.println(map);	

   }
}