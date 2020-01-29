package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.UtilityScanner;

/**
 * MonthlyPayment:Calculating the monthly payments you
 * would have to make over Y years to pay off a P principal loan amount at R per cent
 * interest compounded monthly.
 * @author LOKESH NAIK
 * */

public class MonthlyPayment {

	public static void main(String[] args)
	{
	System.out.println("To calculate monthly payment we need Personal loan,Years and Percent:");	
	System.out.println("Enter the value of Personal loan:"); 
	double personalloan=UtilityScanner.doubleInput();       //Taking double type of input from the user as personalloan
	System.out.println("Enter the value of Years:"); 
	int years=UtilityScanner.integerInput();                //Taking integer type of input from the user as years
	System.out.println("Enter the value of Percent:"); 
	double percent=UtilityScanner.doubleInput();            //Taking double type of input from the user as percent
	 double Payment=Utility.monthlyPayment(personalloan,years,percent); //Passing personalloan,years and percent into the 
	                                                                    //monthlyPayment method of utility class
	 System.out.println("Payment="+Payment);
	 }

}
