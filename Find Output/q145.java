import java.util.*;
 
class Demo {
public void show()
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("banana");
        list.add("apple");
        Iterator itr = list.iterator();
 
        //Collections.sort(list);
        //concurrentModificationException
        /*while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }*/
        
        System.out.println(itr.hasNext());
        System.out.println(itr.hasNext());
        System.out.println(itr.hasNext());
        System.out.println(itr.hasNext());
        
       // System.out.println(itr.next());
        //System.out.println(itr.next());
        //System.out.println(itr.next());
        //System.out.println(itr.next());
        
        System.out.println();
        
        System.out.println(itr.hasNext());
        System.out.println(itr.next());
        System.out.println(itr.hasNext());
        System.out.println(itr.next());
        System.out.println(itr.hasNext());
        //System.out.println(itr.next());
        System.out.println(itr.hasNext());
        
    }
} public class Main {
public static void main(String[] args)
    {
        Demo demo = new Demo();
        demo.show();
    }
}