import java.util.*;

public class Q1{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
	System.out.println("Enter a number: " );
	int num = sc.nextInt();
	
	for(int i=1;i<11;i++){
		System.out.println(i+"x"+num+"="+num*i);
	}
	for(int i=1;i<11;i++){
		System.out.println(num+"-"+i+"="+(num-i));
	}
		
	}
}