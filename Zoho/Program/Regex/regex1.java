import java.util.regex.*;

public class regex1{

	public static void main(String[] args){
	
	String str = "welcome to java programming";

	//Pattern p = Pattern.compile("^java"); check starting word
	//Pattern p = Pattern.compile("java$"); check ending word
	Pattern p = Pattern.compile("w|j"); //check ending word

	//"[abc]" - check every character
	//"[^ab]" - except a and b
	//"[a-z]" - samll alphabet    [a-zA-Z0-9] all alphanumeric 
	//[^a-zA-Z0-9] all special character
	// //s - space, //S - except space
	// //d - digits, //D - except digits
	// //w - alphabets and number, //W - special character
	// //bTamil - check starting tamil
	// //bTamil//b - check starting and ending
//G

// . get all

	
	//Pattern p = Pattern.compile("^welcome$");
	
	Matcher m = p.matcher(str);

	System.out.println(m);

	//System.out.println(m.group());

	if(m.find()){

		System.out.println(m.group());
		System.out.println("start "+m.start()+"end "+m.end());
		
	}

	}
}