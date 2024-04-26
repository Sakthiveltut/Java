package email;
import java.util.regex.Pattern;

public class User{
	
	private	String name, email, password;
	
	/*User(String name,String email,String password){
		this.name = name;
		this.email = email;
		this.password = password;
	}*/
	
	public String getName(){
		return name;
	}
	public String getEmail(){
		return email;
	}
	public String getPassword(){
		return password;
	}
	
	public boolean setName(String name){
		if(Validator.isValidName(name)){
			this.name=name;
			return true;
		}else{
			System.out.println("\nPlease enter a valid name");
			return false;
		}
	}
	public boolean setEmail(String email){
		
		if(Validator.isValidEmail(email)){
			this.email=email;
			return true;
		}else{
			System.out.println("\nPlease enter a valid email id");
			return false;
		}
	}
	public boolean setPassword(String password1,String password2){
		
		if(Validator.isValidPassword(password1) && password1.equals(password2)){
			this.password=password1;
			return true;
		}else{
			System.out.println("\nPassword mismatch.");
			return false;
		}
	}
	@Override
	public String toString(){
		return "Name: "+name+" Email: "+email+" Password: "+password;
	}
}