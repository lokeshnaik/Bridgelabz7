package com.bridgelabz.functionalprograms;


import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.UtilityScanner;

/**
 *  Flip coin;The number of times to Flip Coin and find the tail and head percentage occurred.
 * @author LOKESH NAIK
 * 
 * */

public class FlipCoin
{
	public static void main(String[] args)
	{
	   System.out.println("Enter the number of times a coin to be flipped");
	  int number=UtilityScanner.integerInput();  //Taking number times to  flip the coin by the user input
      Utility.filpCoin(number);                 //Passing number of times to flip the coin to flipcoin method in Utility 
	   
	   
   }
public static void display(float tail,float head)
{
	 System.out.println("Percentage of tail="+tail);
	 System.out.println("Percentage of head="+head);
	}
}
