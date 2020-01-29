package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.UtilityScanner;

/**
 * Sum of three Integer adds to ZERO:Reading N integer of and array and adding 3 of them to make resultant sum zero
 *                                   Thus counting such number of triplets and printing those individual elements in triplets
 *                 
 *     @author LOKESH NAIK                               
 * */

public class SumOfThree {

	public static void main(String[] args)
	{
		System.out.println("Enter no of element you want in an array:");
		int number=UtilityScanner.integerInput();                        //Taking integer input(number) from the user for number of elements in array
		System.out.println("Enter the elements you want in an array:");
		int count=Utility.sumOfThree(number);                            //Passing number parameter to sumOfThree method of Utility class
        System.out.println("No of triplets whose sum is zero ="+count);
	}

}