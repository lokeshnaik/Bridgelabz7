package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;
/**
 * Prime numbers:Finding prime numbers in between 1 to 1000
 * @author LOKESH NAIK
 * */

public class PrimeNumbers 
{

	public static void main(String[] args)
	{
	  System.out.println("Number of Prime numbers in between 0 to 1000");
	  Utility.primeNumbers();                                            //Calling primeNumbers method of Utility class	  
	}
	/**
	 * @param Passing primearray[] and count 
	 * Displaying each and every element in the array
	 * */
	
	public static void display(int primearray[],int count)
	{
		int i;
		for(i=0;i<count;i++)
		{
			System.out.println(primearray[i]+" ");
		}
	}

}