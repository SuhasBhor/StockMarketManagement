package com.Stock;

import java.util.ArrayList;
import java.util.Scanner;

public class StockPortfolio {
	Scanner scan = new Scanner(System.in);
	ArrayList<Stock> list = new ArrayList<Stock>();
	
	public void getStock() {
		System.out.print("Enter How Many Stock You Want: ");
		int n = scan.nextInt(),value=0;
		
		for (int i = 0; i < n; i++) {
			System.out.print("Enter Name Of Share: ");
			String name = scan.next();
			
			System.out.print("How Many Share You Want: ");
			int Number_Of_Share = scan.nextInt();
			
			System.out.print("Share Price: ");
			int Share_Price = scan.nextInt();
			
			Stock stock = new Stock(name,Number_Of_Share,Share_Price);
			stock.setTotal_Price_Of_Share(Number_Of_Share * Share_Price);
			value += stock.getTotal_Price_Of_Share();
			stock.setTotal_Value(value);
			list.add(stock);
		}
	}
	
	public void displayStock() {
		for (Stock stock : list) {
			System.out.println(stock.toString());
		}
	}
}