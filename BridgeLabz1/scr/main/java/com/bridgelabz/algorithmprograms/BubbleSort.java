package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.UtilityScanner;

/**Bubble sort:Reads in integers prints them in sorted order using Bubble Sort
 * @author LOKESH NAIK
 * 
 * */

public class BubbleSort {

	public static void main(String[] args) 
	{
		System.out.println("Enter no of integer you want to sort in an array:");
	   	 int number=UtilityScanner.integerInput();   //Taking integer input for number of elements in an array
	   	 int []array=new int[number];
	        int i;
	        System.out.println("Enter the array elements:");
	        for(i=0;i<number;i++)
	        {
	       	 array[i]=UtilityScanner.integerInput();   //Taking each element from user input in an array
	        }
	        Utility.bubbleSorting(array,number);       //Passing array and length of array to bubblesorting method in Utility
	        
   		

	}
	public static void display(int array[],int number)
	{
		int i;
		 for(i=0;i<number;i++)
		 {
			 System.out.print(array[i]+" ");
		 }
	}

}