package level2;
import java.util.Scanner;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Q46{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a sentence: ");
		String input = sc.nextLine();
		System.out.println("Enter a substring: ");
		String substring = sc.nextLine();
		
		String arr[] = input.split(" ");
		int count=arr.length-1;
		boolean pos = false;
		for(int i=0;i<arr.length;i++){
			if(Pattern.compile(substring).matcher(arr[i]).find() || pos){
				pos = true;
				String temp = arr[i]; 
				arr[i]=arr[count]; 
				arr[count]=temp; 
				count--;
			}
			if(i==count || i+1==count)//odd || even (mid point to exit)
				break;
		}
		System.out.println(Arrays.toString(arr));
	}
}