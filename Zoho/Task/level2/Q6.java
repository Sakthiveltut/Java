import java.util.Scanner;
import java.util.Arrays;

public class Q6{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String input = sc.nextLine(), value="";
		
		String arr[] = input.split(" ");
		for(int i=0;i<arr.length;i++){
			for(int j=arr[i].length()-1;j>=0;j--){
				value+=arr[i].charAt(j);
			}
			if(arr[i].equals(value)){
				arr[i]=null;
			}
			value="";
		}
		for(String str: arr){
			if(str!=null)
				System.out.print(str+" ");
		}
	}
}

