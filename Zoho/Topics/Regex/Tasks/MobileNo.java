import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;

public class MobileNo{
	public static void main(String[] args){
		//File file = new File("D:\\Sakthi\\Github\\Java\\Zoho\\Topics\\Regex\\mobileno.txt");
		
		File file = new File("D:/Sakthi/Github/Java/Zoho/Topics/Regex/Tasks/mobileno.txt");
		Scanner sc = new Scanner(file);
		while(sc.hasNext()){
			String word = sc.next();
			int index = word.lastIndexOf(":");
			checkMobileNo(word.substring(index+1));
		}
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Mobile No: ");
		checkMobileNo(sc.next());*/
	}
	static void checkMobileNo(String mobile){
	//Pattern p=Pattern.compile("^[+]91[6-9](\\d{9})$");
	//Pattern p=Pattern.compile("^[+]{1}[91]{2}[6-9]{1}(\\d{9})$");
	Pattern p=Pattern.compile("\\b+91[6-9](\\d{9})\\b");
		Matcher m=p.matcher(mobile);
		
		if(m.find()){
			System.out.println("Valid");
			System.out.println(m.group());
		}else
			System.out.println("Invalid");
	}
}
