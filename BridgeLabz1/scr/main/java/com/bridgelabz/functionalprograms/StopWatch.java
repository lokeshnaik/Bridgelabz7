package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.UtilityScanner;

/**
 * Stop watch Program:We are measuring the time that elapses between
 *                   the start and end clicks
 *    Here we are asking the user to click any number in between 1-9 and then stop watch start                 
 *    when we ask  user to click any number once again in between 1-9 then the stop watch stops 
 *   and we calculate the difference between the start and stop which gives the elapse time.
 * */

public class StopWatch {

	public static void main(String[] args)
	{
	  System.out.println("Enter any value from 1 to 9 to start the stopwatch:");
	  int startstopwatch=UtilityScanner.integerInput();                           //Taking integer input from the user
	  double starttime=Utility.start(startstopwatch);                             //Passing startstopwatch value as parameter 
	  System.out.println("Start Time= "+starttime);                               // to the start method of utility class
	  System.out.println("Enter any value from 1 to 9 to stop the stopwatch:");
	  int stopstopwatch=UtilityScanner.integerInput();                               //Taking integer input from the user
	  double stoptime=Utility.stop(stopstopwatch);                                  //Passing stopstopwatch value as parameter 
	  System.out.println("Stop Time= "+stoptime);                                  // to the start method of utility class
	  double ElapsedTime=Utility.elapsedtime(starttime,stoptime);                  //Passing starttime and  stoptime to elapsedtime method
	                                                                                 //of Utility class
	  System.out.println("Elapsed time="+ElapsedTime);                            
    }

}
