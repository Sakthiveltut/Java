package level2;
import java.util.Arrays;
import array.ArrayOperations;

public class Q43{
	public static void main(String[] args){

		System.out.println("Enter a value: ");
		int arr[] = ArrayOperations.getValues();
		int length = arr.length/2;
		int lowIndex = 0, highIndex = 0;
		
		for(int i=0, j=arr.length%2!=0?length+1:length;i<length && j<arr.length;i++,j++){
			lowIndex+=arr[i];
			highIndex+=arr[j];
		}
		System.out.println(lowIndex+" "+highIndex);
		
		if(lowIndex==highIndex && arr.length%2!=0)
			System.out.println("Equilibrium index is "+length);
		else
			System.out.println(-1);	
	}
}

