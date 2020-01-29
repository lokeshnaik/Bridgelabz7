package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.UtilityScanner;
/**
 * SquareRoot:compute the square root of a nonnegative number integer
 *  given in the input using Newton's method: 
 *  Using a formula
 *  @author LOKESH NAIK
 * */

public class SquareRoot {

	public static void main(String[] args)
	{
		System.out.println("Enter the value to find the square root:");
		double value=UtilityScanner.doubleInput();                       //Taking double type of input  from the user
		double squarerootvalue=Utility.squareRoot(value);                //Passing value as argument to the squareRoot method of utility class
		System.out.println("Squareroot value of "+value+" is= "+squarerootvalue);

	}

}
