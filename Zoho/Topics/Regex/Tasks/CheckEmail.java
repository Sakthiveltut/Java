import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CheckEmail{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Email: ");
		String email = sc.next();
		
		//Pattern p=Pattern.compile("^((\b[a-z0-9[.][_]]+\b)(@gmail.com))$");
		Pattern p=Pattern.compile("^[a-z0-9]+(\.[a-z0-9]+)*@[a-z]+(\.[a-z]+)$");

		Matcher m=p.matcher(email);
		
		if(m.find()){
			System.out.println("Valid");
		}else
			System.out.println("Invalid");
	}
}


