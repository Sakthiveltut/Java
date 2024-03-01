import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the LinkedList
        linkedList.add("Element 1");
        linkedList.add("Element 2");
        linkedList.add("Element 3");

        // Adding elements at specific positions
        linkedList.add(1, "Inserted Element");

        // Removing an element
        linkedList.remove("Element 2");

        // Iterating over the elements
        System.out.println("LinkedList elements:");
        for (String element : linkedList) {
            System.out.println(element);
        }

        // Accessing elements by index
        System.out.println("Element at index 1: " + linkedList.get(1));

        // Checking if the LinkedList contains an element
        boolean containsElement = linkedList.contains("Element 1");
        System.out.println("Contains Element 1? " + containsElement);

        // Checking if the LinkedList is empty
        boolean isEmpty = linkedList.isEmpty();
        System.out.println("Is LinkedList empty? " + isEmpty);

        // Size of the LinkedList
        int size = linkedList.size();
        System.out.println("Size of the LinkedList: " + size);
    }
}
