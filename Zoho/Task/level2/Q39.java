package level2;
import java.util.Scanner;
import java.util.Arrays;
import array.ArrayOperations;

public class Q39{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a blocks height: ");
		int arr[] = ArrayOperations.getValues();
		
		System.out.println("Enter your desired height: ");
		int height[] = ArrayOperations.getValues();

		arr = ArrayOperations.sortArray(arr,"ascending");
		
		System.out.println(Arrays.toString(arr));
		int sum=0, pos=0;
		
		for(int h=0;h<height.length;h++){
			for(int i=pos;i<arr.length;i++){
				if(height[h]==sum){
					pos=i;
					System.out.print("& ");
					break;
				}else{
					System.out.print(arr[i]+" ");
					sum+=arr[i];
				}
			}
			sum=0;
		}
	}
}

