import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex7{
	public static void main(String[] args) {
		String str = "abcdefghijklmnopqrstuvwxyz";
		
		//Pattern p =Pattern.compile("[a-d[m-n]]");
		//Pattern p =Pattern.compile("[a-z&&[def]]");
		//Pattern p =Pattern.compile("[a-z&&[^bc]]");
		Pattern p =Pattern.compile("[a-z&&[^m-p]]");
		Matcher m=p.matcher(str);
		//m.reset();
		while(m.find()){
			System.out.println(m.group()+" "+m.start());
		}
	}
}
