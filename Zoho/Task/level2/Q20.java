package level2;
import java.util.Scanner;
import java.util.Arrays;
//import array.ArrayOperations;

public class Q20{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		//int arr[] = ArrayOperations.getValues();
		int arr[] = {9,  7,  5,  14,  2,  3,  6,  10};
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	static void quickSort(int arr[],int i,int j){
		int pivot=i;
		while(i>j){
			while(pivot>arr[i+1]){
				i++;
			}
			while(pivot<arr[j]){
				j--;
			}
			if(i<j){
				swap(arr,i,j);
			}
		}
		swap(arr,pivot,j);
		quickSort(arr,pivot,j-1);
		quickSort(arr,j+1,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	static void swap(int arr[],int i, int j){
		arr[i]=arr[i]+arr[j];
		arr[j]=arr[i]-arr[j];
		arr[i]=arr[i]-arr[j];
	}
}


/*

9  7  5  14  2  3  6  10
pi                     j


9  7  5  14  2  3  6  10     //swap
p         i        j


9  7  5   6  2  3  14  10
p         i        j


9  7  5   6  2  3  14  10    //swap
p               j   i


3  7  5   6  2  9  14  10
j               p   i


3  7  5   6  2        9         14  10  //swap
p                     j          p  ij


3  7  5   6  2                  10  14  
p  i         j                   j  pi


3  2   5   6  7  //swap
p  j   i   


2  3   5   6  7 
p  j   i


2      3          5   6  7          9   10  14
 
*/