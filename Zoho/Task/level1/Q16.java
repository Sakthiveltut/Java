import java.util.*;

public class Q16{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a,b and c value: ");

		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		int root = (b*b)-(4*a*c);
		if(root<0){
			System.out.println("Cannot find square root for negative value. "+root);
		}else{
			System.out.println((-b+Math.sqrt(root))/(2*a));	
			System.out.println((-b-Math.sqrt(root))/(2*a));	
		}			
	}
}

