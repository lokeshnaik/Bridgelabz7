package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.UtilityScanner;

/**
 *DayOfWeek: should take three command­line arguments: m (month), d (day), and y (year). For m use 1 for January,
 *           2 for February, and so forth. For output print 0 for Sunday, 1 for Monday, 2 for
 *            Tuesday, and so forth.
 *            Thus using the formula we can calculate the dayOfweek 
 *            @author LOKESH NAIK
 * */

public class DayOfWeek {

	public static void main(String[] args)
	{
	System.out.println("Find the day,month and year:");
	System.out.println("Enter the value of date in between 1 to 31");
	int day=UtilityScanner.integerInput();                      //Taking integer input as day from the user
	System.out.println("Enter the value of month in between 1 to 12");
	int month=UtilityScanner.integerInput();                     //Taking integer input as month from the user
	System.out.println("Enter the value of year in between -10000 to 10000");
	int year=UtilityScanner.integerInput();                       //Taking integer input as year from the user
	Utility.dayOfWeek(day, month, year);                         //Passing day,week and month as argument in dayOfWeek method of Utility class

	}
	/**
	 * @param String day,string month and int  year and displaying the output 
	 * 
	 * */
	public static void display(String day,String month,int year)
	{
	  System.out.println("Day= "+day+"  month= "+month+"  year="+year);	
	 }

}
