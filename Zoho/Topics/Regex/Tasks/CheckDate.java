import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CheckDate{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Date: ");
		String date = sc.next();
		
		
		Pattern p=Pattern.compile("^(([1-9]|[0][1-9]|[1-2][0-9]|[3][0-1])[-|.|/]([1-9]|[0][1-9]|[1][0-2])[-|.|/]([1-9][0-9][0-9][0-9]))$");
		Matcher m=p.matcher(date);
		
		if(m.find()){
			System.out.println("Valid");
			System.out.println(m.group());
		}else
			System.out.println("Invalid");
	}
}
