import java.util.Scanner;

public class Q25 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number1: ");
	int num1 = sc.nextInt();
	System.out.println("Enter a number2: ");
	int num2 = sc.nextInt();
	
	System.out.println("Quotient: "+((double)num1/(double)num2));
	System.out.println("Remainder: "+num1%num2);
	}
}