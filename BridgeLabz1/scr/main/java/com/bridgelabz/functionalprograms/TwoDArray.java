package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.UtilityScanner;

/**
 * 2D Array:A library for reading in 2D arrays of integers, doubles, or booleans from
 *          standard input and printing them out to standard output.
 *@author LOKESH NAIK      
 *      
 * */

public class TwoDArray {

	public static void main(String[] args) 
	{
	  System.out.println("Enter number of rows you want");	
     int row=UtilityScanner.integerInput();                 //Taking integer input as no of rows  needed in 2D Array
     System.out.println("Enter number of column you want");	
     int column=UtilityScanner.integerInput();              //Taking integer input as no of column  needed in 2D Array
     Utility.twoDArray(row,column);                        //Passing row and column parameter to twoDArray method of Utility class
     }

}