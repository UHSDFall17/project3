package edu.cosc4353.group3.Acorns;

import org.junit.Test;
import org.junit.Assert;

public class AppTest
{
// Tests for Customer class
	@Test 
	public void testHashUserForInt() {
		long num = 1111;
		int test = CreditCardValidation.sumOfOddPlace(num);
		
		Assert.assertEquals(2, test);
	}
}
