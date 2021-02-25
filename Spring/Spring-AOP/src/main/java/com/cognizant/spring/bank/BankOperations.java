package com.cognizant.spring.bank;

public class BankOperations {
	
	public void deposit() {
		System.out.println("----Generic Deposit Method---");
	}
	
	public void deposit(String acNo, float amt) {
		System.out.println("----Depositing Rs."+amt+ " in A/C: "+acNo);
	}

}
