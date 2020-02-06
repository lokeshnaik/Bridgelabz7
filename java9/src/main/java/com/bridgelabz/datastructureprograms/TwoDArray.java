package com.bridgelabz.datastructureprograms;

import com.bridgelabz.utility.Utility;

public class TwoDArray {

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
			int i,j=100;
			for(i=0;i<count;i++)
			{
				if(primearray[i]<j) 
				{
					System.out.print(primearray[i]+" ");
				}
				else
				{
					System.out.println();
					j=j+100;
				}
			}
		}

	}