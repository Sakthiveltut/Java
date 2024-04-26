package email;
import java.util.List;
import java.util.ArrayList;

public class UserDatabase{
	private List<User> list;
	
	public UserDatabase(){
		list = new ArrayList<>();
	}
	
	public List<User> getUser(){
		return list;
	}
	
	public void addUser(User user){
		list.add(user);
	}
}