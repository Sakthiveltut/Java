package array;

import java.util.Scanner;
import java.util.Arrays;

public class Question09{

	public static void main(String[] args){
		
		System.out.println("Enter a array1: ");
		int arr1[] = ArrayOperations.getValues();
		System.out.println("Enter a array2: ");
		int arr2[] = ArrayOperations.getValues();
		
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

