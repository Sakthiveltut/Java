import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex4{
	public static void main(String[] args) {
		String str = "abbaa bbbaaa bbbbaaaaa bbbbbb abababa www.mosesh.com";
		
		StringTokenizer st = new StringTokenizer("mosesh","s",true);
		System.out.println(st);
		
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
		
		Pattern p = Pattern.compile("a.");
		
		Matcher m = p.matcher(str);
		/*while(m.find()){
			System.out.println(m.group()+" "+m.start());
		}*/
	}
}