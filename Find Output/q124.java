import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        Integer[] arr = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr));
    }
}
