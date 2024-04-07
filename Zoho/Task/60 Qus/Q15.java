import java.util.Scanner;

public class Q15{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a radius: ");
	int radius = sc.nextInt();
	System.out.println("Enter a height: ");
	int height = sc.nextInt();
	
	System.out.println(2*3.14*radius*(radius+height));
	}
}