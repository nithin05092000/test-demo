package com.nagra.junit.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AccountTest {

	private Account account;
	
	
	@BeforeAll
	public void beforeAll() {
		System.out.println("beforeAll executed");
		account=new Account(1, "nithin", 0);
	}
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("beforeEach execued");
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("afterEach executed");
	}
	
	@AfterAll
	public void afterAll() {
		System.out.println("afterAll executed"); 
		int balanceAmount= (int) account.getBalance();
		System.out.println(balanceAmount);
	}
	@Test
	void creditMoney() {
		account.credit(1000);
		System.out.println("balance : "+account.getBalance() );
	 }
	
	@Test
	void debitMoney() {
		account.debit(500);
		System.out.println(account.getBalance());
	}

}
