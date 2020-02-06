package com.bridgelabz.datastructureprograms;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.UtilityScanner;



public class SampleBalancedParanthesis {

	public static void main(String[] args)
	{
		System.out.println("Enter the expression for which you want to find the parathesis matching:");
		String string=UtilityScanner.stringInput();
		int flag=Utility.isBalanced(string);
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
