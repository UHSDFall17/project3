package edu.cosc4353.group3.Acorns;
import java.util.Random;

public class StockSimulate {
	
	Random rand = new Random();

	public static int negativeHighInteger() {
		Random rand = new Random();
		int number = rand.nextInt(-50) -100;
		
		return number;
	}
	public static int negativeLowInteger() {
		Random rand = new Random();
		int number = rand.nextInt(-1) -10;
		
		return number;
	}
	public static int positiveHighInteger() {
		Random rand = new Random();
		int number = rand.nextInt(10) +1;
		
		return number;
	}
	public static int positiveLowInteger() {
		Random rand = new Random();
		int number = rand.nextInt(100) +50;
		
		return number;
	}
}


