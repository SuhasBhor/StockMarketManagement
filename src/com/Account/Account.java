package com.Account;

import java.util.Scanner;

public class Account {
double amount;
	
	Scanner scan = new Scanner(System.in);
	
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public void credit() {
		System.out.print("Enter Amount You Want To Credit: ");
		int credit_Amount = scan.nextInt();
		
		amount += credit_Amount;
		System.out.println("Final Amount: "+amount);
	}
	
	public void debit() {
		System.out.print("Enter Amount You Want TO Debit: ");
		int debit_Amount = scan.nextInt();
		
		if(amount - debit_Amount < 0) {
			System.out.println("Balance Insufficient Founds!");
			return;
		}else {
			amount -= debit_Amount;
			System.out.println("Final Amount: "+amount);
		}
	}
}
