package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.UtilityScanner;

/**
 *  WindChill:the temperature t (in Fahrenheit) and the wind speed v (in miles per hour),
 *   the National Weather Service defines the effective temperature (the wind chill) to
 *  be calculated using a formula.
 *  And we are calculating using Math.power() the effective temperature 
 * @author LOKESH NAIK
 * 
 * */

public class WindChill {

	public static void main(String[] args) 
	{
	 System.out.println("Enter the temperature less than 50");
	 double temperature=UtilityScanner.doubleInput();         //Taking double value from the user input as temperature
	 System.out.println("Enter the windSpeed greater than 3 and less than 120");
	 double windspeed=UtilityScanner.doubleInput();           //Taking double value from the user input as windspeed
	 double weather=Utility.windChill(temperature,windspeed);//Passing the temperature and windspeed to windChill method of Utility class
	if(weather==0)
	{
		System.out.println("Enter Invaid reading of temperature or windspeed");
	}
	else
	{
		System.out.println("Value of WindChill is= "+weather);
	}

	}

}
