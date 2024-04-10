import java.util.regex.*;

public class RegexEx1{

	public static void main(String[] args){
	
		String str = "welcome to java programming java java@#$%&";
		
		//Pattern p = Pattern.compile("java");
		//Pattern p = Pattern.compile("^welcome"); //check starting word
		//Pattern p = Pattern.compile("programming$"); //check ending word
		//Pattern p = Pattern.compile(" |to|java|j|p|g|m|o");
		
		//Pattern p = Pattern.compile("[java]");
		//Pattern p = Pattern.compile("[$java]");
		//Pattern p = Pattern.compile("[^java]"); //except j,a,v,v
		//Pattern p = Pattern.compile("[a-z]");
		//Pattern p = Pattern.compile("[A-Z]");
		//Pattern p = Pattern.compile("[0-9]");
		Pattern p = Pattern.compile("[^a-zA-z0-9]");
		
		
		
		
		
		Matcher m = p.matcher(str);
		
		//System.out.println(p);
		//System.out.println(m);
		//System.out.println(m.group());

		while(m.find()){
			System.out.println(m.group());
			//System.out.println(m.start()+" "+m.end());
		}
	}
}