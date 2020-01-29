package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.UtilityScanner;

/**
 *Permutation :Permutation of a String using recursive method 
 * That we are taking string input from the user and performing iterative method for 
 * generating permutation of string 
 * @author LOKESH NAIK
 * 
 * */

public class PermutationOfStringRecursive {

	public static void main(String[] args)
	{
		System.out.println("Enter the string which you want to find permutation");
		String string=UtilityScanner.stringInput();                   //Taking string from the input user
		int number;
		number=string.length();                                       //finding the length of the string
		Utility.permutationOfStringRecursive(string,0,number-1);     //Passing string and 0 and length-1 value to the
		                                                             //permutationOfStringRecursive method of Utility class

     }

}
