import java.util.Scanner;

public class Q33{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	char value = sc.next().charAt(0);
	
	if((value>='A'  && value<='Z') || (value>='a'  && value<='z'))
	System.out.println(value+" is an alphabet");
	else
	System.out.println(value+" is not an alphabet");
	}
}