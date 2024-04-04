import java.util.*;
public class Main {
	public static void main(String[] args) {
		TreeSet<Object> treeSet = new TreeSet<>();
		treeSet.add("a");
		treeSet.add("b");
		treeSet.add("c");
		treeSet.add("d");
		treeSet.add("e");
		treeSet.add("a");
		treeSet.add(89);
		
		System.out.println(treeSet);
	}
}