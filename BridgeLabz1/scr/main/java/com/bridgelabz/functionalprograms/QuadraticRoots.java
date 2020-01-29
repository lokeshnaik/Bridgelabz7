package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.UtilityScanner;

/**
 * Quadratic:To find the roots of the equation a*x*x + b*x + c.
 *   Since the equation is x*x, hence there are 2 roots.
 *   We take three input from the user as x^2,x and constant coefficient
 *   And using formula we get the roots of the equation.
 *   @author LOKESH NAIK
 * 
 * */

public class QuadraticRoots {

	public static void main(String[] args)
	{
		System.out.println("Finding the roots of a quadratic expresion:");
		System.out.println("Enter the value of x^2 coefficient:"); 
		int a=UtilityScanner.integerInput();                       //Taking the value of x^2 coefficient: as integer input from the user
		System.out.println("Enter the value of x coefficient:");
		int b=UtilityScanner.integerInput();                       //Taking the value of x^1 coefficient: as integer input from the user
		System.out.println("Enter the value of constant:");
		int c=UtilityScanner.integerInput();                      //Taking the value of constant coefficient: as integer input from the user
		Utility.quadraticRoots(a,b,c);                            //Passing the three coefficient to the quadraticRoots of Utility class
	}
	

}
