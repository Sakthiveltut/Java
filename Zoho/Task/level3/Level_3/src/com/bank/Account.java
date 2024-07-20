package com.bank;

public class Account {
	private long accountNumber;
	private double balance;
	private String type;
	
	public Account(long accountNumber,double balance,String type) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.type = type;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return accountNumber+","+balance+","+type;
	}
	
}
