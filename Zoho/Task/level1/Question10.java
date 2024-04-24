import java.util.Scanner;
import java.util.Arrays;

public class Question10{

	public static void main(String[] args){
		
		int arr[] = ArrayOperations.getValues();
		arr = ArrayOperations.sortArray(arr,"ascending");
		int mid = arr.length/2;
		
		int result[] = new int[arr.length];
		int j=0,k=arr.length-1;
		for(int i=0;i<arr.length;i++){
			while(k>=mid){
				result[i]=arr[k];
				k--;
				i++;
				break;
			}
			while(j<mid){
				result[i]=arr[j];
				j++;
				break;
			}			
		}
		System.out.println(Arrays.toString(result));
	}	
}

