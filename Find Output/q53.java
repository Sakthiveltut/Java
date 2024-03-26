import java.util.*;
 
public class linkedList {
    public static void main(String[] args)
    {
        List<String> list1 = new LinkedList<>();
        list1.add("Geeks");
        list1.add("For");
        list1.add("Geeks");
        list1.add("GFG");
        list1.add("GeeksforGeeks");
        
        System.out.println(list1);
 
        List<String> list2 = new LinkedList<>();
        list2.add("Geeks");
 
        list1.removeAll(list2);
 
        for (String temp : list1)
            System.out.printf(temp + " ");
 
        System.out.println();
    }
}