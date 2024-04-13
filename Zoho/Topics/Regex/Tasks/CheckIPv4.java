import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CheckIPv4{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a IP Address: ");
		String ip = sc.next();
		
		//Pattern p=Pattern.compile("^(([0-9]|[1][\\d]{2}|[1-9]{2}|[2][0-5]{2})[.]([0-9]|[1][\\d]{2}|[1-9]{2}|[2][0-5]{2}))$");
		Pattern p=Pattern.compile("^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
		Matcher m=p.matcher(ip);
		
		if(m.find()){
			System.out.println("Valid");
		}else
			System.out.println("Invalid");
	}
}
