package level2;
import java.util.Scanner;
import java.util.Arrays;
import array.ArrayOperations;

public class Q19{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int arr[] = ArrayOperations.getValues();

		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j>0;j--){
				if(arr[j-1]>arr[j]){
					arr[j-1]=arr[j-1]+arr[j];
					arr[j]=arr[j-1]-arr[j];
					arr[j-1]=arr[j-1]-arr[j];
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}