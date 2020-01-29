package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.UtilityScanner;
/**
 * ToBinary:Taking decimal value from the user and converting into binary form and  
 *          and displaying the elements which are power of two in sequence and add
 *          show the output. 
 *          @author LOKESH NAIK
 * */

public class SumOfPowerOfTwo {

	public static void main(String[] args)
	{
		System.out.println("Enter the decimal value to find sum of power of two:");
		int decimalvalue=UtilityScanner.integerInput(); //Taking integer value decimalvalue from the user
		System.out.print(decimalvalue+"= ");
		Utility.sumOfPowerOfTwo(decimalvalue);        //Passing decimalvalue to the sumOfPowerOfTwo method of utility

	}
	
	/**
	 * Displaying the 2 power elements
	 * @param array[] and size of the array
	 * */
	
	public static void display(int array[],int size)
	{
		int i,value;
		for(i=size-1;i>=0;i--)
		{
			if(array[i]==1)
			{
				value=(int)Math.pow(2, i);
				System.out.print(value+" + ");
			}
		}
		System.out.print(0);
	}

}