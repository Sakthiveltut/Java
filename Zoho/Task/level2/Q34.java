import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a password");
		String password =sc.nextLine();
		
			
		if(Pattern.compile("^([\\w\\W]{1,7})$").matcher(password).find()){
			System.out.println("Weak");
		}else if(Pattern.compile("^([a-zA-Z]+)$").matcher(password).find()){
			System.out.println("Medium");
		}else if(Pattern.compile("^(^[a-zA-Z0-9]+)$").matcher(password).find()){
			System.out.println("Good");
		}else if(Pattern.compile("^(^[\\w\\W]+)$").matcher(password).find()){
			System.out.println("Strong");
		}
	}
}