package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.UtilityScanner;

/** Leap Year:Ensuring whether it is four digit and finding whether it is Leap year or not.
 *  @author LOKESH NAIK
 * 
 * */

public class LeapYear
{
	public static void main(String[] args)
	{
		 System.out.println("Enter the 4 digit number to check whether it is Leap year or not:");
		   
		   int number=UtilityScanner.integerInput();  //Taking 4 digit  input from the user as number
		  int flag=Utility.leapYear(number);         //Passing this number to leapYear method in Utility class 
		  if(flag==1)
		  {
			  System.out.println("Year is Leap year:");
		  }
		  else if(flag==0)
		  {
			  System.out.println("Year is not Leap year:");
		  }
		  else
		  {
			  System.out.println("Enter atleast 4 digit number:");
		  }
		
	}

}