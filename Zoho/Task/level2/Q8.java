package level2;

import java.util.Scanner;
import array.ArrayOperations;

public class Q8{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		//int arr[] = {14,9,11,7,8,5,3};
		//int arr[] = {12, 9, 7, 14, 8, 6, 3};
		//int arr[] = {8, 23, 19, 21, 15, 6, 11};
		//int arr[] = {55, 67, 71, 57, 51, 63, 38};
		//int arr[] = {21, 58, 44, 14, 51, 36, 23};
		
		int arr[] = ArrayOperations.getValues();
		
		int leader = 0;
		for(int i=0;i<arr.length;i++){
			for(int j=leader+1;j<arr.length;j++){
				if(arr[i]<=arr[j]){
					leader=j;
					i=leader;
				}
			}
			System.out.println(arr[leader]);
		}
	}
}

