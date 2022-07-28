package com.nagra.junit.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AccountTest {

	private static Account account;
	
	
	@BeforeAll
	public static void beforeAll() {
		System.out.println("beforeAll executed");
		account =new Account(1, "nithin", 0);
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
	public static void afterAll() {
		System.out.println("afterAll executed"); 
		int balanceAmount= account.getBalance();
	}
	@Test
	void creditMoney() {
		account.credit(1000);
		Assert.assertEquals("Account balance should be 1000", 1000, account.getBalance());
	 }
	
	@Test
	void debitMoney() {
		account.debit(500);
		Assert.assertEquals("credit balance should be 500", 500, account.getBalance());
		
		
	}

}
