package com.bank_application;

public class Transaction {
	private long id,accountNumber;
	private String dateTime,type;
	private double balance,amount;
	public static final String DEBIT = "Debited", CREDIT = "Credited";
	
	public Transaction(long id,String dateTime,long accountNumber,String type,double amount,double balance) {
		this.id = id;
		this.dateTime = dateTime;
		this.accountNumber = accountNumber;
		this.type = type;
		this.amount = amount;
		this.balance = balance;
	}
	
	public long getId() {
		return id;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	} 
	public double getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return id+" "+dateTime+" "+accountNumber+" "+type+" "+amount+" "+balance;
	}
	
	
}
