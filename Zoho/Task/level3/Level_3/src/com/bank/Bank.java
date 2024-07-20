package com.bank;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Bank {
	private String bankName, branch, IFSC_Code;
	private static Map<Long,User> users;
	private static List<Transaction> transactionList = new ArrayList<>();
	private static long transactionId = 1;
	
	static {
		users = UserDAO.getUsersFromFile();
	}
	
	public Bank(String bankName,String branch,String IFSC_Code) {
		this.bankName = bankName;
		this.branch = branch;
		this.IFSC_Code = IFSC_Code;
	}
	
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getIFSC_Code() {
		return IFSC_Code;
	}
	public void setIFSC_Code(String iFSC_Code) {
		IFSC_Code = iFSC_Code;
	}
	public static Map<Long, User> getUsers() {
		return users;
	}
	public static List<Transaction> getTransactionList() {
		return transactionList;
	}
	public static void setTransactionList(List<Transaction> transactionList) {
		Bank.transactionList = transactionList;
	}
	
	public void deposit(double amount) {
		Account account = UserDAO.getCurrentUser().getAccount();
		double balance = account.getBalance()+amount;
		account.setBalance(balance);
		transactionList.add(new Transaction(transactionId++,getCurrentDateTime(),account.getAccountNumber(),Transaction.CREDIT,amount,account.getBalance()));
        System.out.println(amount+" credited successfully.");
	}
	
	public void withdraw(double amount) {
		Account account = UserDAO.getCurrentUser().getAccount();
		double balance = account.getBalance();
		if(balance>=amount) {
			balance-=amount;
			account.setBalance(balance);
			transactionList.add(new Transaction(transactionId++,getCurrentDateTime(),account.getAccountNumber(),Transaction.DEBIT,amount,account.getBalance()));
	        System.out.println(amount+" debited successfully.");
		}else {
            System.out.println("Insufficient balance.");
		}
	}
	
	public void displayTransactions(long accountNumber) {
		for(Transaction transaction:Bank.getTransactionList()) {
			if(transaction.getAccountNumber()==accountNumber) {
				System.out.println(transaction);
			}
		}
	}
	
	public String getCurrentDateTime() {
		Date now = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyy hh:mm a");
		String dateTime = formatter.format(now);
		return dateTime;
	}
}
