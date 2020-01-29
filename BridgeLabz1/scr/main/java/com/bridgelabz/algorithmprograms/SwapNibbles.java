package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.UtilityScanner;

/**
 * SwapNibbles:To take an integer as an Input, convert to Binary using toBinary
 *             function and performing the following functions.
 *             i. Swapping nibbles and finding the new number.
 *             ii. Finding the resultant number is the number is a power of 2.
 *             @author LOKESH NAIK
 * 
 * */


public class SwapNibbles {

	public static void main(String[] args) 
	{
		System.out.println("Enter the decimal value to swap the nibbles:");
		int decimalvalue=UtilityScanner.integerInput();       //Taking the decimalvalue as integer value from the input
		Utility.swapNibbles(decimalvalue);                    //Passing the decimalvalue to the swapNibbles method of the utility class

	}
	
	/**
	 * @param decimal and poweroftwo in display method 
	 *  displaying the output of the program
	 * */
	
	public static void display(int decimal,int poweroftwo)
	{
		System.out.println("Decimal value after swapping nibbles is="+decimal);
		if(poweroftwo==1)
		{
			System.out.println("Resultant number is power of two:");
		}
		else
		{
			System.out.println("Resultant number is not power of two:");
		}
	}

}
