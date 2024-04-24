package level1;
import java.util.Scanner;
import java.util.Arrays;

public class Question44{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int arr[] = ArrayOperations.getValues();
		
		Integer[] temp = new Integer[arr.length];
		int count =0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<=i;j++){
				if(temp[j]!=null && arr[i]==temp[j]){
					break;
				}
				if(j==i){
					System.out.print(arr[i]+" ");
					temp[count++]=arr[i];
				}
			}
		}
	}
}

