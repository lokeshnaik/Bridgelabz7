package com.bridgelabz.datastructureprograms;

//import java.awt.List;
import java.util.ArrayList;

import com.bridgelabz.utility.Utility;
/**
 * Prime and Anagaram :Finding the number that are anagram in between 1 to 1000 which are both prime
 * and anagram
 * @author Lokesh naik
 * */

public class BothPrimeAnagram 
{
  public static void main(String[] args)
  {
	  System.out.println("Number of Prime numbers in between 0 to 1000");
	  Utility.primeNumberAnagrams();                  //Calling the primeNumberAnagrams method of utility class
  }
  
  public static void display(ArrayList<String> list,ArrayList<String> values)
  {
	  System.out.println("Prime which are anagram:");
		for(String i:list)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Prime which are not anagram:");
		for(String j:values)
		{
			System.out.print(j+" ");
		}
  }
}
