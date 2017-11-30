package edu.cosc4353.group3.Acorns;

import org.junit.Test;
import org.junit.Assert;

public class AppTest
{
	

	@Test
	public void testCustomerCreation(){
		String user = "Dee";
		String password = "111111";
		String cardNo = "4929933965135652";
		int portIden = 1;
		double balance = 100;
		String accountType = "corporate";
		boolean isInvest = true;
		double[] stock = new double[10];
		double[] bond = new double[10];
		int investLength = 4;
		
		Customer customer = new Customer(user, password, cardNo, portIden, balance, accountType
										,isInvest, stock, bond, investLength);
		
		Assert.assertEquals(user, customer.getUser_Name());
		

	}
	
	@Test
	public void testDeposit(){
		String user = "Dee";
		String password = "111111";
		String cardNo = "4929933965135652";
		int portIden = 1;
		double balance = 100;
		String accountType = "corporate";
		boolean isInvest = true;
		double[] stock = new double[10];
		double[] bond = new double[10];
		int investLength = 4;
		
		Customer customer = new Customer(user, password, cardNo, portIden, balance, accountType
										,isInvest, stock, bond, investLength);
		double amount = 100;
		double temp = customer.getUser_balance();
		FundsHandler.depositFunds(customer);
		
		Assert.assertEquals(amount, temp, 0);
						
	}
}
