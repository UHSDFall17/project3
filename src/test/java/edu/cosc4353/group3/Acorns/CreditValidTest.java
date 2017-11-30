package edu.cosc4353.group3.Acorns;

import org.junit.Assert;
import org.junit.Test;

public class CreditValidTest {
	@Test 
	public void testSumOdd() {
		long num = 1111;
		int test = CreditCardValidation.sumOfOddPlace(num);
		Assert.assertEquals(2, test);
	}
	@Test 
	public void testSumDbEven() {
		long num = 1111;
		int test = CreditCardValidation.sumOfDoubleEvenPlace(num);
		System.out.println(test);
		Assert.assertEquals(4, test);
	}
	@Test 
	public void testSumOddNull() {
		long num = 0000;
		int test = CreditCardValidation.sumOfOddPlace(num);
		Assert.assertEquals(0, test);
	}
	@Test 
	public void testSumDbEvenNull () {
		long num = 0000;
		int test = CreditCardValidation.sumOfDoubleEvenPlace(num);
		Assert.assertEquals(0, test);
	}
	@Test 
	public void testSumOddOrdered() {
		long num = 123456;
		int test = CreditCardValidation.sumOfOddPlace(num);
		Assert.assertEquals(12, test);
	}
	@Test 
	public void testSumDbEvenOrdered() {
		long num = 123456;
		int test = CreditCardValidation.sumOfDoubleEvenPlace(num);
		Assert.assertEquals(9, test);
	}
}
