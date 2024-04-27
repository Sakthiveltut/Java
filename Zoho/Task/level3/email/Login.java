//package email;

import java.util.List;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;


public class Login{
	static Scanner sc = new Scanner(System.in);
	static UserDatabase userDatabase = UserDatabase.getInstance();
	static User currentUser;
	
	public void loggedIn(){
		if(login()){
			while(true){
				System.out.println("1.Send Message\n2.View send messages\n3.View received messages\n4.View draft messages\n5.Log out");
				int choice = sc.nextInt();
				switch(choice){
					case 1:
						sendMessage();
						break;
					case 2:
						viewSentMessages();
						break;
					case 3:
						viewReceivedMessages();
						break;
					case 4:
						break;
					case 5:
						logout();
						break;
					default:
						System.out.println("Invalid choice.Please try again...");
				}
			}
		}
	}
	
	public boolean login(){
		System.out.println("Enter a email id: ");
		String email = sc.nextLine();
		System.out.println("Enter a password: ");
		String password = sc.nextLine();
		
		if(Validator.isValidEmail(email)){
			User user = findUser(email);
			if(user!=null && user.getPassword().equals(password)){
				currentUser=user;					
				System.out.println("Login successfully.");
				return true;
			}
			System.out.println("Invalid username or password.");
		}
		return false;
	}
	
	public void sendMessage(){
		System.out.print("To: ");
		String to = sc.nextLine();
		sc.nextLine();
		System.out.print("\nCC(Optional): ");
		String cc = sc.nextLine();
		System.out.print("\nSubject: ");
		String subject = sc.nextLine();		
		System.out.print("\nBody: ");
		String body = sc.nextLine();
		
		StringBuilder sb = new StringBuilder();
		sb.append("Time").append(new SimpleDateFormat("dd-MM-yyyy hh:mm a").format(new Date()));
		sb.append("\nFrom: ").append(currentUser.getEmail());
		sb.append("\nTo: ").append(to);
		if(!cc.isEmpty())
			sb.append("\nCC: ").append(cc);
		sb.append("\nSubject: ").append(subject);
		sb.append("\nBody: ").append(body);
		
		currentUser.setSentMessage(sb.toString());
		User user = findUser(to);
		System.out.println(user);
		//user.setReceivedMessage(sb.toString());
		System.out.println("Message sented successfully.");
	}
	
	public void viewSentMessages(){
		System.out.println(currentUser.getSentMessages());
	}
	
	public void viewReceivedMessages(){
		System.out.println(currentUser.getReceivedMessages());
	}
	
	public void logout(){
		currentUser=null;
	}
	
	public User findUser(String email){
		List<User> users = userDatabase.getUser();
		for(User user: users){
			System.out.println(user.getEmail());
			if(user.getEmail().equals(email)){
				return user;
			}
		}
		return null;
	}
}

