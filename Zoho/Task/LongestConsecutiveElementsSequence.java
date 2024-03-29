import java.util.*;

public class LongestConsecutiveElementsSequence {

	static ArrayList<Integer> list1 = new ArrayList<>();
		
	static ArrayList<Integer> list2 = new ArrayList<>();

	//static int arr[]  = {1,2,-106,3,4,6,7,8,-107,9,56,-102,57,58,1000,-101,-105,-104,-103};
	
	//static int arr[]  = {49, 1, 3, 200, 2, 4, 70, 5};
	static int arr[]  = {49, 1, 3, 6, 2, 4, 70, 50,71,51,72,52,53};
	//static int arr[]  = {49, 1, 3, 6, 2, 4, 70, 50,71,51,72,52,53,73,74};
	//static int arr[]  = {1,2,106,3,4,6,7,8,107,9,56,102,57,58,1000,101,105,104,103,108,};
	//static int arr[]  = {1,2,-106,3,4,6,7,8,-107,9,56,-102,57,58,1000,-101,-105,-104,-103};
	//static int arr[]  = {1,2,3,4,5};
	//static int arr[]  = {0,1,2,10,11,11,12,13};
	//static int arr[]  = {0,0};
	//static int arr[]  = {-2147483647, -2147483648};
	//static int arr[]  = {2147483647};



	static int count = arr[0], arrLength;

 	public static void main(String[] args) {
		
			
		Arrays.sort(arr);
		
		for(int a: arr){
			System.out.print(a+" ");
		}

		for(int i=0;i<arr.length;i++){
			
			if(count == arr[i]){
				list1.add(count);
				++count;
				//System.out.println(list1);
			}else{
				setValue();
				//System.out.println("count "+count);
				count = arr[i];
				//System.out.println("arr "+count);
				--i;
				//System.out.println(list1);
				list1.clear();
			}	
			setValue();
		}
		arrLength = list2.size();
		System.out.println("\n"+list2);
		System.out.println("Length is "+arrLength);
 	}

	static void setValue(){
		if(list1.size() >= arrLength){
				arrLength = list1.size();
				list2.clear();
				list2.addAll(list1);
				//System.out.println(list2);
		}
	}
}
