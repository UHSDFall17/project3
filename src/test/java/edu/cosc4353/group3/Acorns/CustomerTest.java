package edu.cosc4353.group3.Acorns;

import org.junit.Test;
import org.junit.Assert;

public class CustomerTest {
	@Test
	public void testCustomerSets(){
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
		
		Assert.assertEquals(password, customer.getUser_Pass());
		Assert.assertEquals(cardNo, customer.getUser_CardNumb());
		Assert.assertEquals(portIden, customer.getUser_PortId());
		Assert.assertEquals(balance, customer.getUser_balance(), .001);
		Assert.assertEquals(accountType, customer.getUser_AccountType());
		Assert.assertEquals(isInvest, customer.getStatus_Invest());
		
		customer.setStatus_Invest(false);
		Assert.assertEquals(false, customer.getStatus_Invest());
		Customer.setPortfolio(customer, 2);
		Assert.assertEquals(2, customer.getUser_PortId());
	}
//	@Test
//	public void testUniqueUser() {
//		Assert.assertEquals(true, Customer.isNotUnique("null"));
//	}
}
