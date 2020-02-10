package com.bridgelabz.datastructureprograms;

import java.io.BufferedReader;
//import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;



import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.UtilityScanner;

/**
 * OrderedList: Reading the Text from a file, split it into array and arrange it as Linked List. 
 * Take a user input to search a integer in the List. If the integer is not found then add it 
 * to the list, and if it found then remove the integer from the List. In the end save the 
 * list into a file.
 * @author Lokesh naik
 * */

public class OrderedList {

	public static void main(String[] args) throws IOException 
	{   
		String path="/home/bridgelabz/eclipse-workspace/BridgeLabz7/java9/src/main/java/com/bridgelabz/datastructureprograms/numbers.txt";
		String string=" ";
		FileReader str=new FileReader(path);         //Using Filereader to read the file
		BufferedReader  br=new BufferedReader(str);
	     string=br.readLine();
	     String []array=string.split(" ");
	     int count=0;
	    for(int i=0;i<array.length;i++)
	     {
	    	count++;
	     }
	    int [] intarray=new int[count];
	    for(int i=0;i<count;i++)
	    {
	    	intarray[i]=Integer.parseInt(array[i]);  //inserting the integer in the array
	    }
	    Arrays.sort(intarray);
	    for(int i=0;i<count;i++)
	    {
	    	Utility.integerinsert(intarray[i]);  //creating the linkedlist
	    }
	    System.out.println("Enter the string which you want to enter or wanted to find:");
	    int number=UtilityScanner.integerInput();
	    Utility.integersearch(number);  //Calling the integersearch method in the Utility class
	   String read=Utility.integershow();  //Calling the integershow method in the Utility class
	write(read,path);
	     br.close();
	}
	


	public static void write(String string,String br)throws IOException
	{
		FileWriter fw=new FileWriter(br);
		fw.write(string);        //Rewriting in the into the file
		fw.close();
	}

}
