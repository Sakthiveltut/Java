import java.util.*;

public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
	System.out.println("Enter a number: " );
	int num = sc.nextInt();
		for(int i=1;i<=num;i++){
			System.out.print("*");
		}
		System.out.println();
		
		for(int i=1;i<=num-2;i++){
			System.out.println("*");
		}
	//	System.out.println();
		
		for(int i=1;i<=num;i++){
			System.out.print("*");
		}
		System.out.println();
	}
}