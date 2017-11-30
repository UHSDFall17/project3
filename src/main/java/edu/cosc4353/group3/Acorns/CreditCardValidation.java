package edu.cosc4353.group3.Acorns;

import java.util.Scanner;

public class CreditCardValidation {

	public static String CardWizard(Customer c) {
	  Scanner input = new Scanner(System.in);
	  Scanner Number = new Scanner(System.in);

	  System.out.println("Enter First Name");
	  String Fname = input.next();
	
	  System.out.println("Enter Last Name");
	  String Lname = input.next();

	  System.out.println("Enter your credit card number");

	  Long number = Number.nextLong();
	  if(isValid(number)) {
		  System.out.println("Credit Card Number is Valid");
	  }
	  else {
		  System.out.println("Credit Card Number is Invalid");
		  CardWizard(c);
	  }
	  String cardNo = Long.toString(number);
	  //Number.close();
	  
	  return cardNo;
	}
	
	public static String initializeCard() {
		try {
			Scanner input = new Scanner(System.in);
			Scanner Number = new Scanner(System.in);

			System.out.println("Enter First Name");
			String Fname = input.next();
			
			System.out.println("Enter Last Name");
			String Lname = input.next();

			System.out.println("Enter your credit card number");

			Long number = Number.nextLong();
			if(isValid(number)) {
			    System.out.println("Credit Card Number is Valid");
			}
			else {
				System.out.println("Credit Card Number is Invalid");
				initializeCard();
			}
			String cardNo = Long.toString(number);
			//Number.close();
			return cardNo;
		}catch(Exception e) {
			System.out.println("Credit Card Number is Invalid");
			  initializeCard();
		}
		return null;
	}

    public static boolean isValid(long Number) {
    	try {
            int sumEvenPlaces = 0;
		    int sumOddPlaces = 0;
		    boolean result = false;

		    if(getSize(Number) >= 13 && getSize(Number) <= 16)
		        if (prefixMatched(Number, 4) || prefixMatched(Number, 5) || prefixMatched(Number, 6) || prefixMatched(Number, 37)) {
		            sumEvenPlaces = sumOfDoubleEvenPlace(Number);
		        	sumOddPlaces = sumOfOddPlace(Number);
		        	result = ((sumEvenPlaces + sumOddPlaces) % 10 == 0);
		    }
		    return result;
    	}catch(Exception e) {
		return false;
    	}
    }

	public static int sumOfOddPlace(long number) {
		int sumOddPlaces = 0;
		String numberToString = Long.toString(number);

		for (int i =1; i < numberToString.length(); i += 2) {
			sumOddPlaces += getDigit(Character.getNumericValue(numberToString.charAt(i)));
		}
		return sumOddPlaces;
	}

	public static int sumOfDoubleEvenPlace(long number) {
		int sumEvenPlaces = 0;
		String numberToString = Long.toString(number);

		for(int i = 0; i < numberToString.length(); i += 2) {
			sumEvenPlaces += (getDigit(Character.getNumericValue(numberToString.charAt(i)) * 2));
		}
		return sumEvenPlaces;
    }

    public static int getDigit(int number) {
    	if(Integer.toString(number).length() == 1)
    		return number;
    	else
    		return((number % 10) + 1);
    }


    public static boolean prefixMatched(long number, int d) {
    	int length = new StringBuilder(Integer.toString(d)).length();
    	String numbertoString = Long.toString(number);
    	String dToString = Integer.toString(d);

    	for(int i = 0; i < length ; i++) {
    		if (numbertoString.charAt(i) != dToString.charAt(i)) {
    			return false;
    		}
        }
        return true;
	}

    public static int getSize(long d) {
        return Long.toString(d).length();
    }
}
