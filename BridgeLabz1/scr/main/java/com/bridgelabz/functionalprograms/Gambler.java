package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.UtilityScanner;

/** Gambler: Simulating a gambler who start with $stake and place fair $1 bets until
 *            he/she goes broke (i.e. has no money) or reach $goal. Keeping track of the number of
 *            times he/she wins and the number of bets he/she makes. Running the experiment for N
 *            times, averages the results, and printing them out.
 *            @author LOKESH NAIK
 *
 * */

public class Gambler
{
	public static void main(String[] args)
	{
		    
		    	System.out.println("Enter the values of  $Stake");
		        int Stake1=UtilityScanner.integerInput();                //Taking integer input Stake1 from the user input
		        
		        System.out.println("Enter the values of  $Goal");        //Taking integer input Goal from the user input to achieve that target
		        int Goal=UtilityScanner.integerInput();
		        
		        System.out.println("Enter  number of times game to be played");
		         int Numberofgames=UtilityScanner.integerInput();        //Taking integer input Number of games from the user input
		                                                                 //to play those may number of times
		        Utility.gambler(Stake1,Goal,Numberofgames);
		    
    }
	/**
	 * Here we taking  no of wins,win percentage and loss percentage as parameters and  
	 * displaying the output in display method
	 * */
	public static void display(float wins ,float winpercentage ,float losspercentage ) 
	{
		    System.out.println("Number of times won are:"+wins);
			System.out.println("Win percentage is:"+winpercentage);
	        System.out.println("Loss percentage is:"+losspercentage);
	}

}