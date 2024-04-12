import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex4{
	public static void main(String[] args) {
		String str = "abbaa bbbaaa bbbbaaaaa bbbbbb abababa www.mosesh.com";

		System.out.println(Pattern.compile(str).matcher("com").matches());
		System.out.println(Pattern.matches(".a","gask"));
		
		/*Pattern p =Pattern.compile(".a");
		Matcher m=p.matcher("4ask");
		System.out.println(m.find());
		System.out.println(m.group());*/
		
		Pattern p =Pattern.compile("(\\dc)([9]|0)");
		Matcher m=p.matcher("4ask");
		System.out.println(m.find());
		System.out.println(m.group());
	}
}
