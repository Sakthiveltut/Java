import java.util.*;

public class Main{


	public static void main(String[] args){
		
		
		int arr[] = {1,2,3,4,5};
		
		Arrays.sort(arr);
		
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList((Integer)arr));

		System.out.println(list1);

		
	}
}

