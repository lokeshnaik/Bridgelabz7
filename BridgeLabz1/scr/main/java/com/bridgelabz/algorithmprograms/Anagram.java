package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.UtilityScanner;

/**
 * Anagram:One string is an anagram of another if the second is simply a
 *rearrangement of the first.
 * @author LOKESH NAIK
 * 
 * */
public class Anagram {

	public static void main(String[] args) 
	{
		System.out.println("Enter the two string to check whether both the string are anagram or not");
		System.out.println("Enter  First string:");
		String string1=UtilityScanner.stringInput();   //Taking String input form the user
		int i,length1,length2;
		length1=string1.length();                      //Finding the length of the string1
		char[]char1=new char[length1];
		for(i=0;i<length1;i++)
		{
			char1[i]=string1.charAt(i);
		}
		System.out.println("Enter the Second string:");
		String string2=UtilityScanner.stringInput();   //Taking String input form the user  
		length2=string2.length();                       //Finding the length of the string2
		char[] char2=new char[length2];
		 
		for(i=0;i<length2;i++)
		{
			char2[i]=string2.charAt(i);
		}
		/* Passing parameters to anagram function in Utility
		 * Passing array character char1  of string1 and its length length1
		 * Passing array character char2 of string1 and its length length1
		 * */
		int count=Utility.anagram(char1, length1, char2, length2);
		if(count==0)                                              
		{                                                         
			System.out.println("Strings are not Anagram");
		}
		else
		{
			System.out.println("Strings are anagram");
		}
		
        
	}

}