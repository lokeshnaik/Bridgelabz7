
package com.bridgelabz.utility;

import java.io.FileNotFoundException;

import java.io.PrintWriter;
import java.util.Arrays;

import com.bridgelabz.algorithmprograms.BubbleSort;
import com.bridgelabz.algorithmprograms.DayOfWeek;
//import com.bridgelabz.algorithmprograms.MergeSort;
import com.bridgelabz.algorithmprograms.PrimeNumbers;
import com.bridgelabz.algorithmprograms.SumOfPowerOfTwo;
import com.bridgelabz.algorithmprograms.SwapNibbles;
import com.bridgelabz.algorithmprograms.SwitchProgram;
import com.bridgelabz.functionalprograms.FlipCoin;
import com.bridgelabz.functionalprograms.Gambler;
import com.bridgelabz.functionalprograms.HarmonicNumber;


public class Utility {
	
	/**
	 * @param Number of times coin to flip and find the tail 
	 *         and head percentage generating random number in between 0 to 1 float value
	 *   Passing tail and head as argument to the display method of FlipCoin class         
	 * */

	public static void filpCoin(int number) {
		float j=0,k=0;
		   for(int i=0;i<number;i++)
		   {
			   
			   float z=(float)(Math.random()*2);
			   if(z<0.5)
			   {
				  j++;
			   }
			   else
			   {
				   k++;
			   }
		   }
		  float tail=(float)((j/number)*100);
		  float head=(float)((k/number)*100);
		  FlipCoin.display(tail, head);
	
	}
	
	/**
	 * @param number as paramter to calculate the Nth harmonic number
	 * Passing number and harmonic number to display method of HarmonicNumber class to show the output
	 * */
	
	public static void harmonicNumber(int number)
	{
		float harmonic=1f;
		 for(int i=2;i<=number;i++)
		  {
			  harmonic+=(float)1/i;
		  }
		 HarmonicNumber.display(number,harmonic); //Passing number and harmonic as parameter to display method of HarmonicNUmber class
	}
	
	/**
	 * @param number as parameter  to checking whether the number is leap year or not
	 * Returning integer value 0 or 1 to main  method to ensure whether it is leap year or not   
	 * @return integer value of 1 or 0
	 * */
	
	public static int leapYear(int number)
	{
		 int k=number,j=0;
		   while(k!=0)
		   {
			   k=k/10;
			   j++;
		   }
		   if(j<4)
		   {
			   
			   j=2;
		   }
		   else
		   {
			   if(number%4==0)
			   {
				   if(number%100==0)
				   {
					   if(number%400==0)
					   {
						   j=1;
					   }
					   else
					   {
						  j=0;
					   }
				   }
				   else
				   {
					  j=1;
				   }
			   }
			   else
			   {
				   j=0; 
			   }
		   
		   }
		   return j;
	}
	
	/**
	 * @param  integer number to calculate the prime factor of the number by brute force 
	 * Printing the value which are prime factor of the integer number 
	 * */
	
	public static void primeFactors(int number)
	{
		 int i;
		  while(number%2==0)
		  {
			  System.out.print("2 "); 
			  number=number/2;
		  }
		  for(i=3;i<=Math.sqrt(number);i++)
		  {
			 while(number%i==0)
			 {
				 System.out.print(i+" ");
				 number=number/i;
			 }
		  }
		  if(number>2)
		  {
			  System.out.println(number);
		  }
	}
	
	/**
	 *  @param String string as a sentence whose <<username>> is replaced by the user String string1 
	 *  Passing resultant string (string2) sentence into the display method of StringReplace class
	 *  And print the resultant string   
	 * */
	
	
	public static  String stringReplace(String string,String string1)
	{
		String string2=string.replace("<<UserName>>", string1);
		return string2;
	}
	
	/**
	 * @param integer stake1 as initial cash present with the user
	 *        integer Goal to achieve that target by playing the game
	 *        integer Numberofgames to play those may number of times game to be played to achieve the target
	 *        
	 *        Passing Win,winpercentage and losspercentage to display method of Gambler class to show the outputs
	 * */
	
	public static void gambler(int Stake1,int Goal,int Numberofgames)
	{
		int cash=Stake1;
		 float i,bets=0,win=0,loss=0;
			float k=0;
	            for(i=0;i<Numberofgames;i++)
	        {
	           
	            bets++;
	          k=(float)(Math.random()*1);
	          if(k>0.5)
	           {
	              cash++;
	              win++;
	           }
	          else
	           {
	              cash--;
	              loss++;
	           }
	          if(cash==0||cash==Goal)
	          {
	       	   break;
	          }
	         }
	       float winpercentage=((float)((win/bets)*100));
	       float losspercentage=((float)((loss/bets)*100));
	      Gambler.display(win,winpercentage,losspercentage);      
	        
	}
	
	/**
	 * @param  Here integer number is passed as argument so that we create distinct coupon till number input
	 *  and generating random value till number and matching with distinct coupon numbers and counting no of random generation
	 *  After matching with all the distinct coupon returning  no counting which is no of times  random number generated
	 *   @return randomcount no of random generation
	 *   
	 * */
	
	
	public static int couponNumber(int number)
	{
		int []array=new int[number];
		int i,l=0;
		for(i=0;i<number;i++)
		{
			array[i]=l;
			l++;
		}
		int count=0,randomcount=0,j,k;
		while(count!=number)
		{
		  k=(int)(Math.random()*number);	
			for(j=0;j<number;j++)
			{
				if(array[j]==k)
				{
					array[j]=-1;
					count++;
				}
			}
			randomcount++;
		}
		return randomcount++;
	}
	
	/**
	 * @param row and column integer as argument to create thus 2D array of such row and column  
	 * Taking each row and column element of the 2D array from the user
	 * Printing the output in output stream Printwriter 
	 * 
	 * */
	
	public static void twoDArray(int row,int column)
	{
		int [][]array=new int[row][column];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				array[i][j]=UtilityScanner.integerInput();
			}
		}
		String fileName="2DArray.txt";
		PrintWriter writer=null;
		try
		{
			 writer=new PrintWriter(fileName);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				writer.print(array[i][j]+" ");
			}
			writer.println();
		}
		writer.close();
	}
	
	/**
	 * @param integer number parameter where we take number of array elements input from user
	 *        to find whose triplet sum is equal to zero and counting such no of triplets and 
	 *         printing each element of triplet
	 *      Returning no of triplets count whose sum is equal to zero
	 * @return count no of triplets whose sum is equal to zero    
	 * */
	
	public static int sumOfThree(int number)
	{
		int[]array=new int[number];
		int i;
		for(i=0;i<number;i++)
		{
			array[i]=UtilityScanner.integerInput();
		}
		Arrays.sort(array);
		  int count=0;

		    for ( i=0; i<number-1; i++) 
		    { 
		        
		        int l = i + 1; 
		        int r = number - 1; 
		        int x = array[i]; 
		        while (l < r) 
		        { 
		            if (x + array[l] + array[r] == 0) 
		            { 
		               System.out.println(x+" "+ array[l]+" "+array[r]); 
		                l++; 
		                r--; 
		               count++;
		            } 
		  
		            else if (x + array[l] + array[r] < 0)
		            {
		                l++; 
		            }
		            // if sum is greater than zero than 
		            // decrement in right side 
		            else
		                r--; 
		        } 
		  
		 }
		return count;
		 
	}
	
	/**
	 * @param x and y coordinate points of foat type are passed as parameter to the method  
	 *       and we are calculating the distance between origin to that coordinate  
	 *       and returning the distance value of type float.
	 * @return distance from origin to point coordinate (x,y)
	 * */
	
 public static float euclideanDistance(float x,float y)
 {
	 float distance=(float)Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
	 return distance;
 }
 
 /**
  * @param String string as parameter and taking length of the string and using StringBuilder method we are 
   *        changing the position of each char of the string and printing the string thus such distinct 
   *        string we generate
  * */
 
 public static void permutationOfStringIterative(String string)
 {
	 int k=string.length();
	 int[]p=new int[k];
	 int i;
	 for(i=0;i<k;i++)
	 {
		 p[i]=0;
	 }
	 System.out.print(string);
	 i=1;
	 int j=0;
	 while(i<k)
	 {
		 if(p[i]<i)
		 {
			 j=(i%2)*p[i];
			StringBuilder strB = new StringBuilder(string);
		      char l = strB.charAt(i) , r = strB.charAt(j);
		      strB.setCharAt(i,r);
		      strB.setCharAt(j,l);
			 System.out.print(" "+strB);
			 p[i]++;
			 i=1;
		 }
		 else
		 {
			 p[i]=0;
			 i++;
		 }
	 }
 }
 
 /**
  * @param  String,0 and length-1 values as parameter and  using StringBuilder method we are 
   *        changing the position of each char of the string and call recursively till  lower value  become
   *        equal to higher value and then print the  string and thus keep on swapping the character position 
   *        of string we generate new string and print that
  * */
 
 public static void permutationOfStringRecursive(String string,int lower,int higher)
 {
	 StringBuilder strB = new StringBuilder(string);
	 int j;
	 if(lower==higher)
	 {
		System.out.print(strB+" ");
	 }
	 else
	 {
		 for(j=lower;j<=higher;j++)
		 {
		      char l = strB.charAt(lower) , r = strB.charAt(j);
		      strB.setCharAt(lower,r);
		      strB.setCharAt(j,l);
		      String newval=strB.toString();
		      permutationOfStringRecursive(newval,lower+1,higher);
		      l = strB.charAt(lower) ; r = strB.charAt(j);
		      strB.setCharAt(lower,r);
		      strB.setCharAt(j,l);	 
		 }
	 }
 }
 
 /**
  * @param temperature and windspeed 
  * @return weather value
  * calculating using a formula. 
  * */
 
 
 public static double windChill(double temperature ,double windspeed)
 {
	 double weather=0;
	 if(temperature>50 ||windspeed>120||windspeed<3)
	 {
		 return weather;
	 }
	 else
	 {
		  weather = (double) (35.74 + (0.6215*temperature) + (0.4275*temperature - 35.75) * ((double)Math.pow(windspeed, 0.16)));
	 }
	 return weather;
 }
 /**
  * @param  char1[] array,length1 as size of char1[] array,char2[] array,length2 as size of char2[]array
  *    sorting both the arrays and matching with every representative index array and find whether it is 
  *    anagram or not  
  * */
  public static int anagram(char char1[],int length1,char char2[],int length2)
  {
	  int count;
	  if(length1!=length2)
	  {
		  count=0;
	  }
	  else
	  {
		  int flag=0;
		  Arrays.sort(char1);
		  Arrays.sort(char2);
		  int i;
		  for(i=0;i<length1;i++)
		  {
			  if(char1[i]==char2[i])
			  {
				  flag++;
			  }
		  }
		  if(flag==length1)
		  {
			  count=length1;
		  }
		  else
		  {
			  count=0;
		  }
	  }
	  return count;
  }
  
  /**
   * Finding prime number in between 1 to 1000
   * 
   * 
   * */
  
  public static void primeNumbers()
  {
	  int count=0,flag;
	  int i=1,j,number=1000;
	  while(i<=number)
	  {
		  j=1;
		  flag=0;
		  while(j<=i)
		  {
			  if(i%j==0)
			  {
				  flag++;
			  }
			  j++;
		  }
		  if(flag==2)
		  {
			  count++;
		  }
		  i++;
	  }
	  int[] primearray=new int[count];
	  int k=0;
	  i=1;
	  while(i<=number)
	  {
		  j=1;
		  flag=0;
		  while(j<=i)
		  {
			  if(i%j==0)
			  {
				  flag++;
			  }
			  j++;
		  }
		  if(flag==2)
		  {
			  primearray[k]=i;
			  k++;
		  }
		  i++;
	  }
	  PrimeNumbers.display(primearray,count);           //Returning primearray  array and length of the array to display in PrimeNumbers class
  }
  
  /**
   * @param array[],number and number1 as integer inputs and then sorting the array 
   *   and using low and high variable we find the whether the element is present or not and return the index
   * @return index
   * */
 
  public static int switchProgram(int array[],int number,int number1)
  {
	 Arrays.sort(array);
	  int low=0,high=number-1,index=0;
	  int mid;
	  while(low<=high)
	  {
		  mid=(low+high)/2;
		  if(array[mid]==number1)
		  {
			  index=mid;
			  break;
		  }
		  else if(array[mid]<number1)
		  {
			  low=mid+1;
		  }
		  else
		  {
			  high=mid-1;
		  }
	  }
	return index;
    }
  
  /**
   * @param array[] and number which is size of array and then we sort 
   * using display method we pass array and number(size) and display the elements in main method 
   * 
   * */
  
  public static void insertionSort(int array[],int number)
  {
	  int i,j,k;
      for(i=1;i<number;i++)
      {
          k=array[i];
          j=i-1;
          while(j>-1&&k<array[j])
          {
              array[j+1]=array[j];
              j--;
          }
          array[j+1]=k;
          
      }
      SwitchProgram.display(array, number);
  }
  
  /**
   * @param array[] and number which is size of array and then we sort 
   * using display method we pass array and number(size) and display the elements in main method 
   * 
   * */
  
  
  public static void bubbleSort(int array[],int number)
  {
	  int i,j;
      for(i=0;i<number-1;i++)
      {
       for(j=i+1;j<number;j++)
       {
    	   if(array[i]>array[j])
    	   {
    		   int temp=array[i];
    		   array[i]=array[j];
    		   array[j]=temp;
    	   }
       }
      }
      SwitchProgram.display(array, number);
  }
  
  /**
   * @param array[] and number which is size of array and then we sort 
   * using display method we pass array and number(size) and display the elements in main method 
   * of Bubblesort class and display.
   * 
   * */
  
  public static void bubbleSorting(int array[],int number)
  {
	  int i,j;
      for(i=0;i<number-1;i++)
      {
       for(j=i+1;j<number;j++)
       {
    	   if(array[i]>array[j])
    	   {
    		   int temp=array[i];
    		   array[i]=array[j];
    		   array[j]=temp;
    	   }
       }
      }
      BubbleSort.display(array, number);
  }
  
  /**
   * @param option
   * choosing the option and accordingly we perform the temperature conversion
   * 1.Celsius to Fahrenhiet 
   * 2.Fahrenhiet to Celsius
   * else printing the invalid option
   * */
  
  public static void temperatureConversion(int option)
  {
	  float Celsius,fahrenheit;
	  float initialvalue=32;
	  switch (option)
      {
          case 1:
          {
              System.out.println("Enter the value of Celsius:");
              Celsius=UtilityScanner.floatInput();
              fahrenheit= (float) ((float)(Celsius*9.0)/5.0+initialvalue);
              System.out.println("Fahrenheit= "+fahrenheit);
              break;
          }
          case 2:
          {
        	  System.out.println("Enter the value of Fahrenheit:");
              fahrenheit=UtilityScanner.floatInput();
              Celsius= (float) (((float)(fahrenheit-initialvalue)*(5.0))/9.0);
             
              System.out.println("Celsius= "+Celsius);
              break;
          }
        default:
        {
           System.out.println("Enter option in bewteen 1 to 2 for the conversion:");
            break;
        }
      }
	  
  }
  
  /**
   * @param double value of personalloan,percent and integer value of year
   * @return Payment
   * 
   * */
  
  
  public static double monthlyPayment(double personalloan ,int years ,double percent) 
  {
	  int number;
	  double rate;
	  number=(12*years);
	  rate=percent/(12*100);
    double Payment=(personalloan*rate)/(1-((double)Math.pow(1+rate,-number)));
    return Payment;
  }
  
  /**
   * @param a as x^2 coefficient,b as x^1  coefficient and c as constant we are passing 
   * argument in the method.
   *  And using formula we are calculating the roots of the quadratic expression. 
   * 
   * */
  
  
  public static void quadraticRoots(int a,int b,int c)
  {
	  int d=b*b- 4*a*c;
	  double root1,root2;
	  double sqrtval=Math.sqrt(Math.abs(d));
	     if(d>0)
	     {
	         System.out.println("Roots are real and different:");
	         root1=(double)(-b+Math.sqrt(d))/(2*a);
	         root2=(double)(-b-Math.sqrt(d))/(2*a);
	         System.out.println("Root1="+root1);
	         System.out.println("Root2="+root2);
	     }
	     else if(d==0)
	     {
	         System.out.println("Roots are real and equal:");
	         root1=-(double)(b/2*a);
	         root2=-(double)(b/2*a);
	         System.out.println("Root1="+root1);
	         System.out.println("Root2="+root2);
	     }
	     else if(d<0)
	     {
	         System.out.println("root1="+(double)(-b/2*a)+"+i"+sqrtval/(2*a));
	         System.out.println("root1="+(double)(-b/2*a)+"-i"+sqrtval/(2*a));
	     }
	     
  }
  
  /**
   * @param double value as argument
   *   using Math.abs() and formula we calculate the square root of value 
   * @return t which is the square root of value
   * */
  
  public static double squareRoot(double value)
  {
	  double epsilon = 1e-15; 
      double t = value;            

      
      while (Math.abs(t - value/t) > epsilon*t) 
      {
          t = (value/t + t) / 2.0;
      }
      return t; 
  }
  
  
  /**
   * @param integer day,integer month and int year
   *  Using the formula we generate the date formate and find the day 
   * 
   * 
   * */
  
  public static void dayOfWeek(int day,int month,int year)
  {
	  int y0=0,x,m0=0,d0=0;
	  String[] stringday=new String[7];
	  String[] stringmonth=new String[13];
	  stringday[0]="Sunday";stringday[1]="Monday";stringday[2]="Tuseday";stringday[3]="Wednesday";stringday[4]="Thursday";stringday[5]="Friday";stringday[6]="Saturday";
	  stringmonth[1]="January";stringmonth[2]="Febrary";stringmonth[3]="March";stringmonth[4]="April";stringmonth[5]="May";stringmonth[6]="June";
	  stringmonth[7]="July";stringmonth[8]="August";stringmonth[9]="Sepetember";stringmonth[10]="October";stringmonth[11]="November";stringmonth[12]="December";
      if((day<1||day>31)||(month<1||month>12)||(year<-10000)||(year>10000))
      {
          d0=0;
      }
      else
      {
           y0 = year - (14 - month) / 12;
         x = y0 + y0/4 - y0/100 +y0/400;
         m0 = month + 12 * ((14 - month) / 12) - 2;
         d0 = (day + x + 31 * m0 / 12) % 7;
    
      }
     if(d0==0)
     {
    	 System.out.println("Enter the valid date,month and year:");
     }
     else
     {
    	 DayOfWeek.display(stringday[d0],stringmonth[month],y0+1); //Passing day,month and year in DayOfWeek  
    	                                                           //to display using display method
     }
  }
  
  /**
   * @param decimalvalue as integer
   * using 2 array of size 4 we after entering each bit in the arrays according we just
   * interchange the array calculating method using Math.pow() and find the resultant sum
   *  
   * 
   * */
  
  
  public static void swapNibbles(int decimalvalue)
  {
	  int []array1=new int[4];
	  int []array2=new int[4];
	  int i;
      for(i=0;i<4;i++)
      {
          array1[i]=0;
          array2[i]=0;
      }
      int reminder;
      for(i=3;i>=0&&decimalvalue!=0;i--)
      {
    	  reminder=decimalvalue%2;
          array1[i]=reminder;
          decimalvalue=decimalvalue/2;
      }
      for(i=3;i>=0&&decimalvalue!=0;i--)
      {
    	  reminder=decimalvalue%2;
          array2[i]=reminder;
          decimalvalue=decimalvalue/2;
      }
      int sum=0,j=0;
      for(i=3;i>=0;i--)
      {
          sum=sum+((int)Math.pow(2,j)*array2[i]);
          j++;
      }
      for(i=3;i>=0;i--)
      {
          sum=sum+((int)Math.pow(2,j)*array1[i]);
          j++;
      }
      int flag=0;
      int poweroftwo;
      int n=sum;
      while(n!=1)
      {
    	  reminder=n%2;
    	  if(reminder==1)
    	  {
    		  flag++;
    	  }
    	  n=n/2;
      }
      if(flag==0)
      {
    	  poweroftwo=1;
      }
      else
      {
    	  poweroftwo=0; 
      }
      SwapNibbles.display(sum,poweroftwo);   //Passing the sum and poweroftwo value to the display method of SwapNibbles class
      
  }
  /**
   * @param decimalvalue
   * where we convert the decimal value into binary form and 
   * using display method of  SumOfPowerOfTwo we display the result 
   * by passing array[] and size of the array
   * */
  
  
  public static void sumOfPowerOfTwo(int decimalvalue)
  {
	  int size=0;
	  int n=decimalvalue;
	  while(n!=0)
	  {
		  n=n/2;
		  size++;
	  }
	  int[] array=new int[size];
	  int reminder=0,i=0;
	  while(decimalvalue!=0)
	  {
		  reminder=decimalvalue%2;
		  array[i]=reminder;
		  decimalvalue=decimalvalue/2;
		  i++;
	  }
	  SumOfPowerOfTwo.display(array,size);
  }
  
  /**
   * @param value
   * using array and storing all the given value in the array and performing division operation we 
   * find the no of notes
   * 
   * */  
  public static void vendingMachine(int value)
  {
	  int []array=new int[8];
	  array[0]=1;array[1]=2;array[2]=5;array[3]=10;array[4]=50;array[5]=100;array[6]=500;array[7]=1000;
	  int notes=0,i=7,quotient=0;
	  while(i>=0&&value>0)
      {
          quotient=value/array[i];
          
          if(quotient>0)
          {
            System.out.println(array[i]+"="+quotient);;  
            value=value%array[i];
            i--;
            notes=notes+quotient;
          }
          else
          {
              i--;
          }
      }
		 System.out.println("Number of notes="+notes);
		 
  }
  
  /**
   * @return  StartTime
   * @param  Taking startstopwatch double as parameter to find the start time in millis
   * */
  public static double start(double startstopwatch)
  {
	  double StartTime=0;
	  StartTime=System.currentTimeMillis();
	  return StartTime;
  }
  
  /**
   * @return  StopTime
   * @param  Taking stopstopwatch double as parameter to find the stop time in millis
   * */
  
  public static double stop(double stopstopwatch)
  {
	  double StopTime=0;
	  StopTime=System.currentTimeMillis();
	  return StopTime;
  }
  /**
   * @return Elapsedtime
   * @param Taking starttime and stoptime and finding the difference and returning the value to the methos
   * 
   * */
  
  public static double elapsedtime(double starttime,double stoptime)
  {
	  double Elapsedtime=stoptime-starttime;
	  return Elapsedtime;
  }
  
  /**
   * @param 1.array 2.p where we will be dividing the array by calling 
   * recursively to its function and which we peform divide rule 
   * */
  
  public static void merge1(int array[],int subarray1[],int sp,int subarray2[],int sq)
	{
	    int i=0,j=0,k=0;
	    while(i<sp&&j<sq)
	    {
	        if(subarray1[i]<subarray2[j])
	        {
	            array[k]=subarray1[i];
	            k++;i++;
	        }
	        else
	        {
	            array[k]=subarray2[j];
	            k++;j++;
	        }
	    }
	    while(i<sp)
	    {
	        array[k]=subarray1[i];
	        k++;i++;
	    }
	    while(j<sq)
	    {
	        array[k]=subarray2[j];
	        k++;j++;
	    }
	   
	}
  
  /**
   * @param 1.array 2.number where we will be dividing the array by calling 
   * recursively to its function and which we peform divide rule 
   * */
  
  
  public static void mergeSort(int array[],int number)
  {
	  if(number==1)
	    {
	       return ;
	    }
	    int start=0;
	    int end=number-1;
	    int middle=(start+end)/2;
	    int sp=middle-start+1;
	    int sq=end-middle;
	    int []subarray1=new int[sp];
	    int []subarray2=new int[sq];
	    int i;                                                                                       
	    for(i=0;i<=middle;i++)
	    {
	    	subarray1[i]=array[i];
	    }
	    for(i=middle+1;i<=end;i++)
	    {
	    	subarray2[i-middle-1]=array[i];
	    }
	    mergeSort(subarray1,sp);              //Calling recursively to its method
	    mergeSort(subarray2,sq);              //Calling recursively to its method
	    merge1(array,subarray1,sp,subarray2,sq);      //Calling to the merge1 
  }
  
  /**
   * Finding prime numbers in between 1 to 1000 and 
   * checking whether the no is palindrome or not
   * if it is palindrome then printing  
   * */
  
  
  public static void primeNumbersPalindrome()
  {
	  int count=0,flag;
	  int i=1,j,number=1000;
	  while(i<=number)
	  {
		  j=1;
		  flag=0;
		  while(j<=i)
		  {
			  if(i%j==0)
			  {
				  flag++;
			  }
			  j++;
		  }
		  if(flag==2)
		  {
			  count++;
		  }
		  i++;
	  }
	  int[] primearray=new int[count];
	  int k=0;
	  i=1;
	  while(i<=number)
	  {
		  j=1;
		  flag=0;
		  while(j<=i)
		  {
			  if(i%j==0)
			  {
				  flag++;
			  }
			  j++;
		  }
		  if(flag==2)
		  {
			  primearray[k]=i;
			  k++;
		  }
		  i++;
	  }
	  
	  int reminder,binary,referenceno;
	  for(i=0;i<k;i++)
	  {
	      binary=0;
	      referenceno=primearray[i];
	      while(referenceno!=0)
	      {
	    	  reminder=referenceno%10;
	        binary=binary*10+reminder;
	        referenceno=referenceno/10;
	      }
	      if(binary==primearray[i])
	      {
	         System.out.print(primearray[i]+" ");
	      }
	  }
  }
  
  

}
