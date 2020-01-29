package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.UtilityScanner;

/**StringReplace:Taking username input and replacing <<username>> in the sentence  
 * @author LOKESH NAIK
 * */

public class StringReplace
{
  public static void main(String[] args)
  {
	  System.out.println("Enter the name whom you want to wish");
		String string="Hello <<UserName>>,How are you?";
		String string1=UtilityScanner.stringInput();  //Taking name string from the input user as string1
		String string2=Utility.stringReplace(string, string1); 
		  System.out.println(string2);//Passing whole sentence and string to stringReplace method in Utility class
  }
 
	
  

}