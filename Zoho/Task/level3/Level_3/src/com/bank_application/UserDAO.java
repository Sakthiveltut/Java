package com.bank_application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class UserDAO {
	
	private static final String PATH = System.getProperty("user.dir")+"\\src\\com\\bank_application\\users.csv";
	private static ThreadLocal<User> currentUser = new ThreadLocal<>();
	

	public static User getCurrentUser() {
		return currentUser.get();
	}

	public static void setCurrentUser(User user) {
		currentUser.set(user);
	}
	
	public static Map<Long,User> getUsersFromFile(){
		//BufferedReader bufferedReader = new BufferedReader(new FileReader(System.getProperty("user.dir")+"/users.csv"));
		Map<Long,User> users = new LinkedHashMap<>();
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(PATH))) {
			String line;
			while((line = bufferedReader.readLine())!=null) {
				String[] userDetails =  line.split(",");
				long phoneNumber = Long.parseLong(userDetails[4]);
				long accountNumber = Long.parseLong(userDetails[5]);
				double balance = Double.parseDouble(userDetails[6]);
				users.put(accountNumber,new User(userDetails[0],userDetails[1],userDetails[2],userDetails[3],phoneNumber,new Account(accountNumber,balance,userDetails[7])));
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}
	
	public static void setUsersToFile(Map<Long,User> users) {
		try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(PATH))) {
			for(User user:users.values()) {
				bufferedWriter.write(user.toString());
				bufferedWriter.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
