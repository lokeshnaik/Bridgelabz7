package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.UtilityScanner;
/**
 *  VendingMachine:Write a Program to calculate the minimum number
 *  of Notes as well as the Notes to be returned by the Vending Machine as a
 *  Change
 *  @author LOKESH NAIK
 * */

public class VendingMachine {

	public static void main(String[] args) 
	{
		System.out.println("Enter the value that you want to have change:");
		int value=UtilityScanner.integerInput();  //Taking value integer input from the user
		Utility.vendingMachine(value);            //Passing the value argument in the vendingMachine method of utility class
		
	}
	
}
