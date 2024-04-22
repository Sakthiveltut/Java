import java.util.Scanner;

public class Q29{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a num1:");
		String num1=sc.nextLine(); 
		System.out.println("Enter a num2:");
		String num2=sc.nextLine();
		try{
		System.out.println(Integer.parseInt(num1)*Integer.parseInt(num2));
		}catch(Exception e){
			System.out.println("Invalid input.");
		}
		
		
	}
}