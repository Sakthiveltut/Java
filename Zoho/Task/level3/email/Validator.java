package email;

import java.util.regex.Pattern;

public class Validator{
	static public boolean isValidName(String name){
		if(Pattern.compile("^[a-z]+$").matcher(name).find()){
			return true;
		}
		return false;
	}
	
	static public boolean isValidEmail(String name){
		if(Pattern.compile("^[a-z0-9]+(\\.[a-z0-9]+)*@[a-z]+(\\.[a-z]+)$").matcher(email).find()){
			return true;
		}
		return false;
	}

	static public boolean isValidPassword(String name){

		return true;
	}
	
}

