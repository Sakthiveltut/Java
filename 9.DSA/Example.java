import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add elements to the list using offer(E e)
        boolean added1 = linkedList.offerFirst(1);
        boolean added2 = linkedList.offer(2);

        System.out.println("Element 'apple' added successfully: " + added1);
        System.out.println("Element 'banana' added successfully: " + added2);

        // Attempt to add more elements to the list exceeding its capacity
        //boolean added3 = linkedList.offerLast("cherry");
        //boolean added4 = linkedList.offer("date");

        //System.out.println("Element 'cherry' added successfully: " + added3);
        //System.out.println("Element 'date' added successfully: " + added4); // Will return false
    }
}
