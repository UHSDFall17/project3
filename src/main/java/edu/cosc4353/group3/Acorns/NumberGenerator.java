package edu.cosc4353.group3.Acorns;

import java.util.Random;

public class NumberGenerator {
	
	public static int negativeHighInteger() {
		Random randomIntegerRange = new Random();
		int number = randomIntegerRange.nextInt(-50 +1+ 100) -100;
		return number;
	}
	
	public static int negativeLowInteger() {
		Random randomIntegerRange = new Random();
		int number = randomIntegerRange.nextInt(-1+1 +10) -1;		
		return number;
	}
	
	public static int positiveHighInteger() {
		Random randomIntegerRange = new Random();
		int number = randomIntegerRange.nextInt(100 + 1 -50) + 50; 
		

		return number;
	}
	
	public static int positiveLowInteger() {
		Random randomIntegerRange = new Random();
		int number = randomIntegerRange.nextInt(10 + 1 -1) + 1; 
		
		return number;
	}
}

