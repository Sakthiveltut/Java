import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class Q26{
	public static void main(String[] args) {
		//String str = "Alive is awesome";
		//String str = "Learning never stops";
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter  a sentence: ");
		String originalString = sc.nextLine();
		System.out.println("Enter a remove letters :");
		String removeLetters = sc.nextLine();
		
		removeLetters="(?i)[^"+removeLetters+"]";
		//Pattern p = Pattern.compile("(?i)[^alwsr]");
		Pattern p = Pattern.compile(removeLetters);
		Matcher m = p.matcher(originalString);
		while(m.find()){
			System.out.print(m.group());
		}
	}
}