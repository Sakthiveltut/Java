import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex8{
	public static void main(String[] args) {
		//String str = "Phone numbers: 123-456-7890, 987-654-3210";
		String str = "Visit example.com or http://www.example.com for more information.";
		
		//Pattern p =Pattern.compile("\\p{Space}");
		//Pattern p =Pattern.compile("(?<name>\\d{3})-(\\d{3})-(\\d{4})");
		//Pattern p =Pattern.compile("(?:https?://)?(www\\.)?example\\.com");
		Pattern p =Pattern.compile("(?i)example");
		
		Matcher m=p.matcher(str);
		while(m.find()){
			System.out.println(m.group()+" "+m.start());
		}
	}
}
