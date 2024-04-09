package array;

import java.util.*;

public class Q9{

	public static void main(String[] args){
		
		//int arr1[] = {0,1,4,7,5,4,3,2,11,1,1,1,0};
		//int arr2[] = {0,6,6,1,0,7,0,1,1,9,0};
		
		//int arr1[] = {1,1,1,2,2,2,3,3,3,3,4,4,4,5,5,5,5};
		//int arr2[] = {1,1,1,1,2,2,2,3,3,3,3,4,4,4,5,5,5,5,5,5,5};
		
		int arr1[] = {};
		int arr2[] = {};
		
		
		
		
		int result[] = new int[arr1.length+arr2.length];

		for(int i=0, count=0;i<result.length;i++){
			if(i<arr1.length){
				result[count++] = arr1[i];
			}
			if(i<arr2.length){
				result[count++] = arr2[i];
			}
		}
		
		
		System.out.println(Arrays.toString(result));
		System.out.println(Arrays.toString(ArrayOperations.removeDuplicates(result)));
		System.out.println(Arrays.toString(ArrayOperations.sortArray(ArrayOperations.removeDuplicates(result),"ascending")));
			
	}
}

