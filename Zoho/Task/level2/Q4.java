import java.util.Scanner;
import java.util.Arrays;

public class Q4{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String input = sc.nextLine(), value="";
		
		String arr[] = input.split(" ");
		for(int i=0;i<arr.length;i++){
			for(int j=arr[i].length()-1;j>=0;j--){
				value+=arr[i].charAt(j);
			}
			arr[i]=value;
			value="";
		}
		System.out.println(Arrays.toString(arr));			
	}
}
