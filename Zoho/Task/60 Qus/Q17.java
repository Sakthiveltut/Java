import java.util.*;

public class Q17{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a circle1 radius: ");
		int radius1 = sc.nextInt();
		System.out.println("Enter a circle2 radius: ");
		int radius2 = sc.nextInt();
		
		System.out.println(Math.PI*((radius1*radius1)-(radius2*radius2)));					
	}
}

