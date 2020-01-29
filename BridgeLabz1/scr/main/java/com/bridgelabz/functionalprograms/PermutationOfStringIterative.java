package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.UtilityScanner;

/**
 *Permutation :Permutation of a String using iterative method 
 * That we are taking string input from the user and performing iterative method for 
 * generating permutation of string 
 * @author LOKESH NAIK
 * 
 * */

public class PermutationOfStringIterative {

	public static void main(String[] args)
	{
	 System.out.println("Enter the string which you find the permutation:");
	 String string=UtilityScanner.stringInput();         //Taking string input from the user
	 Utility.permutationOfStringIterative(string);      //Passing  string as a parameter to the permutationOfStringIterative method 
                                                         // of Utility class
	}

}
