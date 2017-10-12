import java.util.Scanner;

public class UserCreation
{
 public static void main(String args[])
 {
  Scanner input = new Scanner(System.in);
  Scanner Number = new Scanner(System.in);

  System.out.println("Enter First Name");
  String Fname = input.next();

  System.out.println("Enter Last Name");
  String Lname = input.next();

  System.out.println("Enter your credit card number");
  int Num = Number.nextInt();

  if(isValid(Num.nextLong()))
  {
     System.out.println("Credit Card Number is Valid");
  }
  else
  {
    system.out.println("Credit Card Number is Invalid");
  }
  Number.close();
}

  public static boolen isValid(long Number)
  {
    int sumEvenPlaces = 0;
    int sumOddPlaces = 0;
    boolean result = false;

    if(getSize(number) >= 13 && getSize(number) <= 16)
      if (prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 6) || prefixMatched(number, 37))
      {
        sumEvenPlaces = sumOfDoublePlace(number);
        sumOddPlaces = sumOfOddPlace(number);
        result = ((sumEvenPlaces + sumOddPlaces) % 10 == 0);
      }

    return result;
  }

  public static int sumOfOddPlace(long number)
  {
    int sumOddPlaces = 0;
    String numberToString = long.toString(number);

    for (int i =1; i < numberToString.length(); i += 2)
      sumOddPlaces += getDigit(Character.getNumericValue(numberToString.charAt(i)));

    return sumOddPlaces;
  }

  public static int sumOfDoubleEvenPlace(long number)
  {
    int sumEvenPlaces = 0;
    String numberToString = long.toString(number);

    for(int i = 0; i < numberToString.length(); i += 2)
    {
      sumEvenPlaces += (getDigit(Character.getNumericValue(numberToString.charAt(i)) * 2));
    }

    return SumEvenPlaces;
  }

  public static int getDigit(int number)
  {
    if(integer.toString(number).length() == 1)
      return number;
    else
      return((number % 10) + 1);
  }

  public static boolean prefixMatched(long number, int d)
  {
    int length = new StringBuilder(Integer.toString(d)).length();
    string numbertoString = long.toString(number);
    string dToString = Integer.toString(d);

    for(int i = 0; i < length ; i++)
      if (numberToString.charAt(i) != dToString.charAt(i))
      {
        return false;
      }

    return true;
  }

  public static int getSize(long d)
  {
    return Long.toString(d).length();
  }


}
