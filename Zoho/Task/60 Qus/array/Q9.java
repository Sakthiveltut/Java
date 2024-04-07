package array;

import java.util.*;

public class Q9{

	public static void main(String[] args){
		
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {3,4,5,6,7};
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
	}
}

