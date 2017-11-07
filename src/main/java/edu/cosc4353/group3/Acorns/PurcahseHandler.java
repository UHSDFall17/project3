package edu.cosc4353.group3.Acorns;

import java.util.Scanner;

public class PurcahseHandler {

	
	public static void makePurchase(Customer c)
	{
		System.out.println("Input Purchase Amount....");
        Scanner UserScan =  new Scanner(System.in);
        double amount = UserScan.nextDouble();

		double decimal =0;
		long  conv = 0;
		double spareChange = 0;
		
		conv = (long) amount;
		decimal = amount - conv;
		spareChange = 1 - decimal;
		
		System.out.println("Spare Change: " + spareChange);

		c.setUser_balance(spareChange);
		System.out.println("New Account Balance: " + c.getUser_balance());

		UserInterface.UserInput(c);
	}
	
	
	
	
}
