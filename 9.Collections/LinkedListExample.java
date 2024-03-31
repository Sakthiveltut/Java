import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Element 1");
        linkedList.add("Element 2");
        linkedList.add("Element 3");

        linkedList.add(1, "Inserted Element");

        linkedList.remove("Element 2");

        System.out.println("LinkedList elements:");
        for (String element : linkedList) {
            System.out.println(element);
        }

        System.out.println("Element at index 1: " + linkedList.get(1));

        boolean containsElement = linkedList.contains("Element 1");
        System.out.println("Contains Element 1? " + containsElement);

        boolean isEmpty = linkedList.isEmpty();
        System.out.println("Is LinkedList empty? " + isEmpty);

        int size = linkedList.size();
        System.out.println("Size of the LinkedList: " + size);
    }
}
