import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex4{
	public static void main(String[] args) {
		String str = "abbaa bbbaaa bbbbaaaaa bbbbbb abababa https:www.mosesh.com";
		//String str = "abcd";
		Pattern p = Pattern.compile("a.");

		System.out.println(Arrays.toString(str.split(".")));
		System.out.println(Arrays.toString(str.split("\\.")));
		System.out.println(Arrays.toString(str.split("[b]")));
		
		System.out.println(Arrays.toString(str.split("")));
		System.out.println(Arrays.toString(str.split("|")));
		
		System.out.println(Arrays.toString(str.split("|")));
		System.out.println(Arrays.toString(str.split("\\:|\\.")));
		
		//System.out.println(Arrays.toString(p.split(".")));
		//System.out.println(Arrays.toString(p.split("\\.")));

		Matcher m = p.matcher(str);
		/*while(m.find()){
			System.out.println(m.group()+" "+m.start());
		}*/
	}
}