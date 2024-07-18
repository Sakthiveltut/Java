package com.bank_application;
import java.util.Scanner;

public class BankApplication {
	private static final byte SIGN_IN=2,SIGN_UP=1,EXIT=3, DEPOSIT=1,WITHDRAW=2,TRANSACTIONS=3,ACCOUNT_INFO=4, LOG_OUT = 5;
	private static Scanner scanner = new Scanner(System.in);
	private static Bank bank = new Bank("SBI","Surandai","SBI123456789");
	private static Long accountNumber;

	public static void main(String[] args) {
		accountNumber = initializeAccountNumber();
		accountNumber = accountNumber==null?1001:accountNumber;
		System.out.println("Bank Application");
		boolean exit = false;
		while(!exit) {
			System.out.println("1.Sign Up\n2.Sign In\n3.Exit");
			System.out.print("Choose an option: ");
			byte choice = scanner.nextByte();
			scanner.nextLine();
			
			if(SIGN_UP==choice) {
				System.out.print("Enter name: ");
				String name = scanner.nextLine();
				
				System.out.print("Enter phone no: ");
				long phoneNumber = scanner.nextLong();
				scanner.nextLine();
				
				System.out.print("Enter email: ");
				String email = scanner.nextLine();
				
				System.out.print("Enter address: ");
				String address = scanner.nextLine();
			
				System.out.print("Enter password: ");
				String password = scanner.nextLine();
				
				Authentication.signUp(new User(name,address,email,password,phoneNumber,new Account(++accountNumber,1000,"Savings")));
			}else if(SIGN_IN==choice) {
				System.out.print("Enter email: ");
				String email = scanner.nextLine();
				
				System.out.print("Enter password: ");
				String password = scanner.nextLine();
				
				if(Authentication.signIn(email,password)) {
					boolean logOut = false;
					while(!logOut) {
						System.out.println("1.Deposit\n2.Withdraw\n3.Transactions\n4.Account Info\n5.Log out");
						System.out.print("Choose an option: ");
						choice = scanner.nextByte();
						if(DEPOSIT==choice) {
							System.out.print("Enter deposit amount: ");
							double amount = scanner.nextDouble();
							bank.deposit(amount);
						}else if(WITHDRAW==choice) {
							System.out.print("Enter withdraw amount: ");
							double amount = scanner.nextDouble();
							bank.withdraw(amount);
						}else if(TRANSACTIONS==choice) {
							bank.displayTransactions(UserDAO.getCurrentUser().getAccount().getAccountNumber());
						}else if(ACCOUNT_INFO==choice) {
							System.out.println("Bank: "+bank.getBankName());
							System.out.println("IFSC Code: "+bank.getIFSC_Code());
							System.out.println("Branch: "+bank.getBranch());
							System.out.println("Account Number: "+UserDAO.getCurrentUser().getAccount().getAccountNumber());
							System.out.println("Balance: "+UserDAO.getCurrentUser().getAccount().getBalance());
							System.out.println("Account Type: "+UserDAO.getCurrentUser().getAccount().getType());
						}else if(LOG_OUT==choice) {
							logOut = true;
						}
					}
				}else {
					System.out.println("Invalid username or password.");
				}
			}else if(EXIT==choice) {
				exit=true;
				UserDAO.setUsersToFile(Bank.getUsers());
				System.out.println("Thank you");
			}else {
				System.out.println("Invalid choice.");
			}
		}
	}

	private static Long initializeAccountNumber() {
		Long accountNumber=null;
		for(long key:Bank.getUsers().keySet()) {
			accountNumber = key;
		}
		return accountNumber;
	}	

}
