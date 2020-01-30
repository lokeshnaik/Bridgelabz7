package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.UtilityScanner;

/**
 * Distance:Program that takes two integer command­line arguments x
 * and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0).
 * And this can be done by calculating  distance = sqrt(x*x + y*y).
 * @author LOKESH NAIK
 * */

public class EuclideanDistance {

	public static void main(String[] args)
	{
	  System.out.println("Enter thex x coordinate of a point");
	  float x=UtilityScanner.floatInput();                     //Taking x coordinate value of float type from the user input
	  System.out.println("Enter thex y coordinate of a point");
      float y=UtilityScanner.floatInput();                     //Taking y coordinate value of float type from the user input
     float distance=Utility.euclideanDistance(x,y);            //Passing x and y coordinate points to the euclideanDistance method in Utility class
     System.out.println("The distance between origin and ("+x+","+y+")is = "+distance);
	}

}
