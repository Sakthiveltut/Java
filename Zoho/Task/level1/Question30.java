package array;
import java.util.Scanner;
import java.util.Arrays;

public class Question30{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a values: ");
	int num[] = ArrayOperations.getValues();
	
	int result = num[0];
	for(int i = 0;i<num.length;i++){
		if(result<num[i]){
			result = num[i];
		}
	}
	System.out.println("Largest number is "+result);
	}
}