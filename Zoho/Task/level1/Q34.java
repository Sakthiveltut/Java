import java.util.Scanner;

public class Q34{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int num = sc.nextInt();
	int result = 0,remainder = 0,largestDigit = 0;
	for(int i=1;i<=num;i++){
		result+=i;
	}
	System.out.println("Sum is "+result);
	
	while(result>0){
		remainder = result%10;
		result -= remainder;
		if(largestDigit<remainder){
			largestDigit = remainder;
		}
		if(result == 0){
			break;
			}
		result = result /10;
	}
	System.out.println("Largest digit is: "+largestDigit);
	}
}