package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.UtilityScanner;

/**
 * Coupon Numbers:Given N distinct Coupon Numbers, how many random numbers do we
 *                need to generate distinct coupon number so that all the distinct coupon 
 *               are matched by generating the random number.
 * @author LOKESH NAIK
 * 
 * */

public class CouponNumber {

	public static void main(String[] args)
	{
		System.out.println("Enter number of distinct coupon you want");
	  int number=UtilityScanner.integerInput();              //Taking integer input (number) from the user input
	  int counting= Utility.couponNumber(number);            //Passing number integer as parameter to the couponNumber ,method of Utility class 
     System.out.println("Number of time we generated coupon code:"+counting);
     }

}