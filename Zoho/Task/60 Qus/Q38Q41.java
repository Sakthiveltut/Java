import java.util.Scanner;

public class Q38toQ41Q45{
	public static void main(String[] args) {
	
	//int arr[] = {1,2,4,5,8,7,9,76,65,0,-56};
	int arr[] = {1,2,4,5};
	int copyArray[] = new int[arr.length];
	int largestElement = arr[0], smallestElement = arr[0],sumOfItems = 0;
	for(int i=0;i<arr.length;i++){
		if(arr[largestElement] < arr[i]){
			largestElement = i;
		}
		if(arr[smallestElement] > arr[i]){
			smallestElement = i;
		}	
	}
	System.out.println("Largest element is "+arr[largestElement]); 
	System.out.println("Smallest element is "+arr[smallestElement]); 
	System.out.println("Number of elements in array "+arr.length); 
	
	for(int i=0;i<arr.length;i++){
		copyArray[i] = arr[i];
	}
	for(int value: copyArray){
		System.out.print(value+" ");
	}
	for(int i=0;i<arr.length;i++){
		sumOfItems +=arr[i];
	}
	System.out.println("\nsum of elements is "+sumOfItems);
	}
	
	
}