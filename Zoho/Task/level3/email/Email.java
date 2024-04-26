package email;
import java.util.Scanner;

public class Email{
	static Scanner sc = new Scanner(System.in);
	static User user = new User();
	static UserDatabase userDatabase = new UserDatabase();
	static String name,email,password1,password2;
	 
	
	public static void main(String[] args){
		
		while(true){
			System.out.println("1.Signup\n2.Login");
			int choice = sc.nextInt();
			switch(choice){
				case 1:
					if(isName() && isEmail() && isPassword()){
						System.out.println("Account created successfully.");
					}
				case 2:
					System.out.println("Enter a email id: ");
					String email = sc.nextLine();
					if(Validator.isValidEmail(email)){
						System.out.println("Enter a password: ");
						String password = sc.nextLine();
						if(login(email, password)){
							System.out.println("Login successfully.");
						}else
							System.out.println("Invalid username or password.");
					}
			}
			userDatabase.addUser(user);
			System.out.println(userDatabase.getUser());
		}
	}
	
	static boolean isName(){
		System.out.println("Enter a name: ");
		name = sc.nextLine();
		if(!user.setName(name)){
			isName();
		}
		return true;
	}
	static boolean isEmail(){
		System.out.println("\nEnter a email id: ");	
		email = sc.nextLine();
		if(!user.setEmail(email)){
			isEmail();
		}
		return true;
	}
	static boolean isPassword(){
		System.out.println("\nEnter a new password: ");
		password1 = sc.nextLine();
		
		System.out.println("\nRe enter password: ");
		password2 = sc.nextLine();
		
		if(!user.setPassword(password1,password2)){
			isPassword();
		}
		return true;
	}
	static public boolean login(String email,String password){
		List<User> users = userDatabase.getUser();
		for(String user: users){
			if(user.getEmail().equals(email) && user.getPassword().equals(password)){
				return true;
			}
		}
		return false;
	}
}