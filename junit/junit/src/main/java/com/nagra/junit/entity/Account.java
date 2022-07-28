package com.nagra.junit.entity;

public class Account {

	private int accountId;
	private String accountUser;
	private int balance;
	
	
	public Account(int accountId, String accountUser, int balance) {
		super();
		this.accountId = accountId;
		this.accountUser = accountUser;
		this.balance = balance;
	}
	
	
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountUser() {
		return accountUser;
	}
	public void setAccountUser(String accountUser) {
		this.accountUser = accountUser;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	public void credit(int depositAmount) {
		balance=balance+depositAmount;
	}
	
	
	public void debit(int withdrawAmount) {
		
		if(balance<withdrawAmount) {
			System.out.println("Balance Low");
		}
		else {
			balance=balance-withdrawAmount;
	}
}
}