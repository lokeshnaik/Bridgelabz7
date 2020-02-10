package com.bridgelabz.datastructureprograms;
import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.UtilityScanner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 * UnorderedList: Reading the Text from a file, split it into words and arrange it as Linked List. 
 * Take a user input to search a Word in the List. If the Word is not found then add it 
 * to the list, and if it found then remove the word from the List. In the end save the 
 * list into a file.
 * @author Lokesh naik
 * */
public class UnOrderedList {

	public static void main(String[] args) throws IOException
	{
		String path="/home/bridgelabz/eclipse-workspace/BridgeLabz7/java9/src/main/java/com/bridgelabz/datastructureprograms/sample.txt";
		String string=" ";
		FileReader str=new FileReader(path); //Using Filereader to read the file
		BufferedReader  buffer=new BufferedReader(str); 
	     string=buffer.readLine();
	     String []array=string.split(" ");
	    for(int i=0;i<array.length;i++)
	     {
	    	  Utility.insert(array[i]);       //inserting the words in the array
	     }
	    System.out.println("Enter the string which you want to enter or wanted to find:");
	    String word=UtilityScanner.stringInput();
	    Utility.search(word);       //Calling the search method in the Utility class
	   String read=Utility.show();    //Calling the show method in the Utility class
	    write(read,path);
	     buffer.close();

	}
	public static void write(String read,String path)throws IOException
	{
		FileWriter fw=new FileWriter(path);
		fw.write(read);           //Rewriting in the into the file
		fw.close();
	}

}
