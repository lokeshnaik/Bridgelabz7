package com.bridgelabz.datastructureprograms;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.UtilityScanner;

/**
 * Simple Balanced Parentheses:Take the arthimetic   expression and then see whether the 
 * paranthesis is balanced or not.
 * @author Lokesh naik
 * */

public class SampleBalancedParanthesis {

	public static void main(String[] args)
	{
		System.out.println("Enter the expression for which you want to find the parathesis matching:");
		String string=UtilityScanner.stringInput();   //Take expression form the user
		int flag=Utility.isBalanced(string);           //calling the isBalanced in utility class 
		if(flag==1)
		{
			System.out.println("Paranthesis are balanced");
		}
		else
		{
			System.out.println("Paranthesis are not balanced");
		}
	}

}
