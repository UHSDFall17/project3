package edu.cosc4353.group3.Acorns;

import java.util.Scanner;

public class FundsHandler {
	
	
	public static void makePurchase(Customer c){
		
	System.out.println("Input Purchase Amount....");
    Scanner UserScan =  new Scanner(System.in);
    double amount = UserScan.nextDouble();

	double decimal =0;
	long  conv = 0;
	double spareChange = 0;
	
	conv = (long) amount;
	decimal = amount - conv;
	if (decimal != 0){		
	spareChange = 1 - decimal;
	}
	else { spareChange = 0; }
	
	System.out.println("Spare Change: " + spareChange);

	c.setUser_balance(spareChange);
	System.out.println("New Account Balance: " + c.getUser_balance());

	
	}
	
	
	
	public static void depositFunds(Customer c)
	{
		
		System.out.println("Input Amount To Deposit....");
	    Scanner UserScan =  new Scanner(System.in);
	    double amount = UserScan.nextDouble();
		
		c.setUser_balance(amount);
		
		System.out.println("Depsoited: " + amount);
		System.out.println("New Balance: " + c.getUser_balance());


		
	}
	

	
	
}

