package level2;
import java.util.Arrays;
import array.ArrayOperations;

public class Q40{
	public static void main(String[] args){

		System.out.println("Enter a array value: ");
		int arr[] = ArrayOperations.getValues();
		
		int count=0;
		a:
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					count++;
					if(count==2){
						System.out.println(arr[i]);
						break a;
					}
					break;
				}
			}
			if(i==arr.length-1)
				System.out.println("No such a second duplicate.");
		}
	}
}
