package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.UtilityScanner;
/**
 * Merge sort:To perform  Merge Sort an array, we divide it into two halves, sort the two halves
 * independently, and then merge the results to sort the full array.
 * By using divide and conquer rule we perform the mergesort.
 * @author LOKESH NAIK
 * */

public class MergeSort {

	public static void main(String[] args) 
	{
		 System.out.println("Enter the number of elements you want to enter in the array to sort using mergesort:");
			  int number=UtilityScanner.integerInput();                        //Taking integer input from the user
			  int []array= new int[number];
			  int i;
			  System.out.println("Enter the value of each element in the array:");
			  for(i=0;i<number;i++)
			  { 
			      array[i]=UtilityScanner.integerInput();                   //Taking each element of integer from the user
			  }
			  Utility.mergeSort(array,number);                               //Calling mergesort method of Utility class
			  display(array,number);                                         //calling display method to display elements
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

