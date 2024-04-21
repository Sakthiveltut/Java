package level2;
import java.util.Arrays;
import array.ArrayOperations;

public class Q41{
	public static void main(String[] args){

		System.out.println("Enter a value: ");
		int arr[] = ArrayOperations.getValues();
		
		for(int i=0;i<arr.length-1;i++){
			arr[i]=arr[i+1]; 				
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]<arr[j]){
					arr[i]=arr[j];
				}
			}
		}
		arr[arr.length-1]=-1;
		System.out.println(Arrays.toString(arr));
	}
}

