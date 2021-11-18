package com.Stock;

public class Stock {
	String Stock_Name;
	int Number_Of_Share;
	int Share_Price;
	int Total_Price_Of_Share;
	int Total_Value;
	public Stock(String stock_Name, int number_Of_Share, int share_Price) {
		super();
		Stock_Name = stock_Name;
		Number_Of_Share = number_Of_Share;
		Share_Price = share_Price;
	}
	public int getTotal_Price_Of_Share() {
		return Total_Price_Of_Share;
	}
	public void setTotal_Price_Of_Share(int total_Price_Of_Share) {
		Total_Price_Of_Share = total_Price_Of_Share;
	}
	
	public int getTotal_Value() {
		return Total_Value;
	}
	public void setTotal_Value(int total_Value) {
		Total_Value = total_Value;
	}
	@Override
	public String toString() {
		return "\n------Stock_Name=" + Stock_Name+"------" +"\n"+ 
			   "Number_Of_Share=" + Number_Of_Share + "\n"+
			   "Share_Price="+ Share_Price + "\n"+
			   "Total_Price_Of_Share=" + Total_Price_Of_Share+ "\n\n"+
			   "------Total_Value="+ Total_Value +"------"+"\n";
	}
}
