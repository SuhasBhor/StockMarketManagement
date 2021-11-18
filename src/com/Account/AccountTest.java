package com.Account;

import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Account acc = new Account();
		
		while(true) {
			System.out.print(	"1.Credit \n"+
								"2.Debit \n"+
								"3.Print \n"+
								"4.Exit\n");
			System.out.print("Enter Your Choice: ");
			int ch = scan.nextInt();
			
			switch(ch) {
			case 1:
				acc.credit();
				break;
			case 2:
				acc.debit();
				break;
			case 3:
				System.out.println("Final Amount: "+acc.getAmount());
				break;
			case 4:
				return;
			default:
				System.out.println("Enter Valid Input!!");
			}
		}
	}
}
