package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.UtilityScanner;

/**Factors:Computing the prime factorization of given Number by using brute force.
 * @author LOKESH NAIK
 * 
 * */



public class PrimeFactors
{
  public static void main(String[] args)
  {
	  System.out.println("Enter the number to find the prime factors:");
	 
	  int number=UtilityScanner.integerInput();    //Taking integer input from the user
	 Utility.primeFactors(number);                  //Passing integer number to the primeFactors method of Utility class
  }
}
