import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");


        Iterator<String> iterator = list.iterator();


        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);

            // iterator.remove();
        }
    }
}
