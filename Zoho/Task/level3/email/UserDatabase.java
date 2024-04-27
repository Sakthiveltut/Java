package email;
import java.util.List;
import java.util.ArrayList;

public class UserDatabase{
	private UserDatabase(){};
	private static UserDatabase userDatabase;
	private List<User> list = new ArrayList<>();
	
	public static UserDatabase getInstance(){
		if(userDatabase==null){
			userDatabase = new UserDatabase();
		}
		return userDatabase;
	}
	
	public List<User> getUser(){
		return list;
	}
	
	public void addUser(User user){
		list.add(user);
	}
}