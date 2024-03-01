import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");

        // Obtaining an Iterator
        Iterator<String> iterator = list.iterator();

        // Iterating over the elements using Iterator
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);

            // Optional: Removing an element during iteration
            // iterator.remove();
        }
    }
}
