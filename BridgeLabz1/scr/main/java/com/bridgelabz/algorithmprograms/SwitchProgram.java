package com.bridgelabz.algorithmprograms;


import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.UtilityScanner;
/**
 *  Switch method :we are creating switch method and allotting case for each method and asking from the user for option
 *  and accordingly we perform the method  and calculate the result
 *  @author LOKESH NAIK
 * */

public class SwitchProgram{

	public static void main(String[] args) 
	{
		System.out.println("Enter the option in between 1 to 6:");
	    System.out.println("1.BinarySearch method for integer:");
	    System.out.println("2.BinarySearch method for String:");
	    System.out.println("3.Insertionsort method for integer:");
	    System.out.println("4.Insertionsort method for String:");
	    System.out.println("5.Bubblesort method for integer:");
	    System.out.println("6.Bubblesort method for String:");
	    int option=UtilityScanner.integerInput();              //Taking option integer input from the user 
	    switch(option)
	    {
	    case 1:
	    {
	    	System.out.println("Enter no of integer you want in n array:");
	   	 int number=UtilityScanner.integerInput();           //Taking integer input from the user 
	   	 int []array=new int[number];
	        int i;
	        System.out.println("Enter the array elements:");
	        for(i=0;i<number;i++)
	        {
	       	 array[i]=UtilityScanner.integerInput();      //Taking each and every integer input from the user in array
	        }
	        System.out.println("Enter the number which you want to search:");
	        int number1=UtilityScanner.integerInput();  //Taking integer input form the user
	        int index;
	        index=Utility.switchProgram(array,number,number1); //Passing  array,number and number1 as argument 
	        if(index==0)
	        {
	       	 System.out.println("Element is not found:");
	        }
	        else
	        {
	       	 System.out.println("Element is  found at index:"+index);
	        }
	        break;
	    }
	    
	    
	    case 2:
	    {
	    	System.out.println("Binaryearch for string");
	    	break;
	    }
	    
	    
	    case 3:
	    {
	    	System.out.println("Enter no of integer you want to sort in an array:");
	   	 int number=UtilityScanner.integerInput();          //Taking integer input from the user
	   	 int []array=new int[number];
	        int i;
	        System.out.println("Enter the array elements:");
	        for(i=0;i<number;i++)
	        {
	       	 array[i]=UtilityScanner.integerInput();      //Taking each and every integer input from the user in array
	        }
	        Utility.insertionSort(array,number);      //Passing array and number as argument insertion method of Utility class
	       
	    	break;
	    }
	    
	    
	    case 4:
	    {
	    	System.out.println("Insertion sort of string");
	    	break;
	    }
	    
	    
	    case 5:
	    {
	    	System.out.println("Enter no of integer you want to sort in an array:");
		   	 int number=UtilityScanner.integerInput();    //Taking integer input from the user
		   	 int []array=new int[number];
		        int i;
		        System.out.println("Enter the array elements:");
		        for(i=0;i<number;i++)
		        {
		       	 array[i]=UtilityScanner.integerInput(); // Taking each and every integer input from the user in array
		        }
		        Utility.bubbleSort(array,number);     //Passing array and number as argument bubblesort method of Utility class
		    	break;
	    	
	    }
	    
	    
	    case 6:
	    {
	    	System.out.println("Bubblesort of string");
	    	break;	
	    }
	      default :
	      {
	    	  System.out.println("Entered invalid option :");
	      }
	    }
	  
	}
	/**
	 * Displaying each element of the array 
	 * */
	 public static void display(int array[],int number)
	 {
		 int i;
		 for(i=0;i<number;i++)
		 {
			 System.out.print(array[i]+" ");
		 }
	 }
	

}
