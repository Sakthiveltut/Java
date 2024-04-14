import java.util.Scanner;

public class Q35{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int num = sc.nextInt();
	int result = 1,sumOfDigit = 0,remainder =0;
	
	for(int i=1;i<=num;i++){
		result *=i;
	}
	
	System.out.println(result);
	
	while(result>0){
		remainder = result%10;
		result -= remainder;
		sumOfDigit += remainder; 
		if(result == 0){
			break;
		}
		result = result /10;
	}
	System.out.println("sum of digit is: "+sumOfDigit);
	}
}