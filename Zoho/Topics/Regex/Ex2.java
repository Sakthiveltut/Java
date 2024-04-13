import java.util.regex.*;

public class Ex2{
	public static void main(String[] args) {
		String str = "Tamil TamilTamil Tamilan Tamilnadu hello 628002 TamilTamilan @#$%& www.developer.org";
		
		//Pattern p = Pattern.compile("\\sa"); //space
		//Pattern p = Pattern.compile("\\S"); //except space
		//Pattern p = Pattern.compile("\\d"); //digit
		//Pattern p = Pattern.compile("\\D"); //except digit
		Pattern p = Pattern.compile("\\w"); //alphabets and number
		//Pattern p = Pattern.compile("\\W"); //except alphabets and number
		
		//Pattern p = Pattern.compile("\\bTamil");
		//Pattern p = Pattern.compile("\\bTamil");
		//Pattern p = Pattern.compile("\\bTamil");
		
		//Pattern p = Pattern.compile("\\bTamil");
		//Pattern p = Pattern.compile("^Tamil$");
		//Pattern p = Pattern.compile("\\bTamil\\b");
		//Pattern p = Pattern.compile("\\BTamil\\B");
		//Pattern p = Pattern.compile("Tamil\\B");
		//Pattern p = Pattern.compile(".");
		//Pattern p = Pattern.compile("\\.");
		//Pattern p = Pattern.compile("^.");
		//Pattern p = Pattern.compile(".$");

		Matcher m = p.matcher(str);
		while(m.find()){
			System.out.println(m.group()+" "+m.start());
		}
	}
}