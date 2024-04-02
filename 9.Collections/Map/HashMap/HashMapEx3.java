import java.util.*;
public class HashMapEx3
{
public static void main(String []args)
{
HashMap<Integer,String> map = new HashMap<>();


map.put(1,"Abraham");
map.put(2,"Rahul");
map.put(3,"Sakthi");
map.put(4,"Mosesh");
map.put(null,null);
map.putIfAbsent(5,"Lazaras");

HashMap<Integer,String> newmap  =new  HashMap<>();

newmap.putAll(map);

System.out.println(map+"\n"+newmap);

System.out.println(newmap.get(null));
System.out.println(newmap.getOrDefault(6,"Paul"));

newmap.compute(4,(key,value) -> "raj");
newmap.computeIfAbsent(7,key-> "madan");
newmap.computeIfPresent(5,(key,value)-> value + value);

System.out.println(newmap);


newmap.merge(4,"Madan",(oldvalue,newvalue)-> newvalue);
System.out.println(newmap);

Collection coll = map.values();
System.out.println(coll);
}
}