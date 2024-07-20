package com.bank;

public class Authentication {
	
	public static boolean signUp(User user) {
		UserDAO.getUsersFromFile().put(user.getAccount().getAccountNumber(), user);
		System.out.println("Sign up successfully");
		return true;
	}
	
	public static boolean signIn(String email,String password) {
		for(User user:UserDAO.getUsersFromFile().values()) {
			if(user.getEmail().equals(email)) {
				if(user.getPassword().equals(password)) {
					UserDAO.setCurrentUser(user);
					System.out.println("Sign in successfully");
					return true;
				}
				return false;
			}
		}
		return false;
	}
	
}
