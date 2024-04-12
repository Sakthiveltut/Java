import java.util.regex.*;

public class Ex3{
	public static void main(String[] args) {
		String str = "abbaabbbaaabbbbaaaaabbbbbbabababa";
		//Pattern p = Pattern.compile("a.");
		//Pattern p = Pattern.compile(".a");
		//Pattern p = Pattern.compile("ab.");
		
		//Pattern p = Pattern.compile("a+");
		Pattern p = Pattern.compile("a*");
		
		//Pattern p = Pattern.compile("a?");
		
		//Pattern p = Pattern.compile("a{2}");
		//Pattern p = Pattern.compile("a{2}a");
		//Pattern p = Pattern.compile("a{1,3}")
		//Pattern p = Pattern.compile("a{1,3}a");
		//Pattern p = Pattern.compile("a{2,3}aa");
		
		Matcher m = p.matcher(str);
		while(m.find()){
			System.out.println(m.group()+" "+m.start());
		}
	}
}