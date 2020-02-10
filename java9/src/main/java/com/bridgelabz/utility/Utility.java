package com.bridgelabz.utility;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

import com.bridgelabz.datastructureprograms.BothPrimeAnagram;
//import com.bridgelabz.datastructureprograms.PrimeNumbers;
import com.bridgelabz.datastructureprograms.Node;
import com.bridgelabz.datastructureprograms.NumberNode;
import com.bridgelabz.datastructureprograms.StringNode;
import com.bridgelabz.datastructureprograms.TwoDArray;
import com.bridgelabz.datastructurestackqueue.QueueNode;
import com.bridgelabz.datastructurestackqueue.StackNode;

public class Utility
{
	
	static QueueNode front=null;
	static QueueNode rear=null;
	static QueueNode front1=null;
	static QueueNode rear1=null;
	static StackNode top1=null;
	static StackNode top2=null;
	 static Node top=null;
	 static StringNode head;
	 static NumberNode root;
	 
	 /**
	  * @return void 
	  * Displays whether the stack is empty or not
	  * */

	public void isEmptyStack()
	{
		Node node=new Node();
		if(node==null)
		{
			System.out.println("Stack is empty:"); 
		}
		else
		{
			System.out.println("Stack is not empty:");
		}
	}
	/**
	 * @param char data 
	 * @return void 
	 * Used for inserting the elements in the stack
	 * */
	public static void push(char data)
	{
		 Node temporary;
		 temporary =new Node();

		 if(temporary==null)
		 {
		 System.out.println("Stack is full");
		 }
		 else
		 {
			 temporary.data=data;
			temporary.next=top;
		      top=temporary;
		 }
		
	}
	/** 
	 * @return void 
	 * Used for deleting  the elements in the stack
	 * */
	public static char pop()
	{
		  Node temporary;
		 char x=(char) -1;

		 if(top==null)
		 System.out.println("Stack is Empty\n");
		 else
		 {
		 temporary=top;
		 top=top.next;
		 x=(char) temporary.data;
		 }
		 return x;
	}
	/**
	 * @param String string
	 * @return int integer 0 or 1
	 * Checking whether the paranthesis is balanced or not
	 * */
	
	public static int isBalanced(String string)
	{
		int i;
	// Node top=null;
		int length;
		length=string.length();
		char[] array=new char[length];
		for( i=0;i<length;i++)
		{
			array[i]=string.charAt(i);
		}

	 for(i=0;i<length;i++)
	 {
	 if(array[i]=='(')
	 push(array[i]);
	 else if(array[i]==')')
	 {
	 if(top==null)
	 return 0;
	 pop();
	 }
	 }
	 if(top==null)
	 {
	 return 1;
	 }
	 else
	 {
	 return 0;
	 }
	}
	/**
	 * @param String str
	 * @return String
	 * Sorting all the charater in the string
	 * */
	
	 public static String sortString(String str) { 
	        char []arr = str.toCharArray(); 
	        Arrays.sort(arr); 
	         return new String(arr);
	       // System.out.print(String.valueOf(arr)); 
	    }
	
	 /**
	  * @param primearray[] ,count 
	  * @return void
	  * Finding the numbers which are anagram in the prime numbers 1 to 1000
	  * */
	
	public static void Anagram(int primearray[],int count)
	{
		ArrayList<String> list=new ArrayList<>();
		ArrayList<String> values=new ArrayList<>();
		String []sarray=new String[count];
		for(int i=0;i<count;i++)
		{
			sarray[i]=String.valueOf(primearray[i]);
		}
		int flag;
		String first=null;
		String second;
		for(int i=0;i<count-1;i++)
		{
			flag=0;
			for(int j=i+1;j<count;j++)
			{
				 first=sortString(sarray[i]);
				 second=sortString(sarray[j]);
				if(first.compareTo(second)==0)
				{
					list.add(sarray[i]);
					list.add(sarray[j]);
					flag++;
				}
				
			}
			if(flag==0)
			{
				values.add(sarray[i]);
			}
		}
		BothPrimeAnagram.display(list,values);
		/*System.out.println("Prime which are not anagram:");
		for(String i:list)
		{
			System.out.print(i+" ");
		}
		System.out.println("Prime which are not anagram:");
		for(String j:values)
		{
			System.out.print(j+" ");
		}*/
	}
	
	/**
	 * @return void 
	 * Finding the prime numbers and anagrams in between 1 to 1000
	 * 
	 * */
	  public static void primeNumberAnagrams()
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
				  System.out.print(i+" ");
				  primearray[k]=i;
				  k++;
			  }
			  i++;
		  }
		  System.out.println();
		       Anagram(primearray,k);     
	  }
	  
	  /**
	   * @param String sdata
	   * @return void
	   * Inserting the  nodes containing string data in the linkedlist 
	   * */
	  
	  public static void insert(String sdata)
	  {
	   StringNode node=new StringNode();
	   node.sdata=sdata;
	   node.next=null;
	   if(head==null)
	   {
		   head=node;
	   }
	   else
	   {
		   StringNode n=head;
		   while(n.next!=null)
		   {
			   n=n.next;
		   }
		   n.next=node;
	   }
		  
	  }
	  
	  /**
	   * @return String 
	   * Displaying each and every node and returning the string.
	   * */
	  
	  public static String show()
	   {
		   StringNode p=head;
		   String string=" ";
		   while(p!=null)
		   {
			   System.out.print(p.sdata+" ");
			   string=string+p.sdata;
			   p=p.next;
		   }
		   return string;
	   }
	  /**
	   * @param String word
	   * Used for searching the word which is present in the file 
	   * and adding at the end if not present else remove the word form the file.
	   * @return void
	   * */
	  
	  public static void search(String word)
	  {
		     StringNode node=head;
		     StringNode temp=new StringNode();
			 temp.sdata=word;
			 temp.next=null;
			 int flag=0;
			StringNode temp1=head,previous=null;
			 if(node==null) 
			 {
				return ; 
			 }
			 if(temp1!=null&&(temp1.sdata).compareTo(word)==0)
			 {
				 head=head.next;
				 flag++;
				 return ;
			 }
			 else
			 {
				 while(temp1!=null&&(temp1.sdata).compareTo(word)!=0)
				 {
					 previous=temp1;
					 temp1=temp1.next;
				 }
				 if(temp1!=null)
				 {
					 previous.next=temp1.next;
					 flag++;
				 }
			 }
			 if(flag==0)
			 {
				 previous.next=temp;
			 }
	  }  
	  /**
	   * @param integer intdata
	   * @return void
	   * Inserting the  nodes containing integer values data in the linkedlist 
	   * */
	  
		  public static void integerinsert(int intdata)
		  {
		   NumberNode node=new NumberNode();
		   node.intdata=intdata;
		   node.link=null;
		   if(root==null)
		   {
			   root=node;
		   }
		   else
		   {
			   NumberNode n=root;
			   while(n.link!=null)
			   {
				   n=n.link;
			   }
			   n.link=node;
		   }
			  
		  }
		  /**
		   * @return String 
		   * Displaying each and every node containing integer
		   *  and returning the string.
		   * */
		  public static String integershow()
		   {
			   NumberNode p=root;
			   String string="";
			   while(p!=null)
			   {
				   System.out.print(p.intdata+" ");
				   string=string+p.intdata;
				   p=p.link;
			   }
			   return string;
		   }
		  /**
		   * @param integer number
		   * Used for searching the number which is present in the file 
		   * and adding at the end if not present else remove the number form the file.
		   * @return void
		   * */
		  
		  public static void integersearch(int number)
		  {
			 NumberNode node=root;
			 NumberNode temp=new NumberNode();
			 temp.intdata=number;
			 temp.link=null;
			 int flag=0;
			 NumberNode temp1=root,previous=null;
			 if(node==null) 
			 {
				return ; 
			 }
			 if(temp1!=null&&temp1.intdata==number)
			 {
				 root=root.link;
				 flag++;
				 return ;
			 }
			 else
			 {
				 while(temp1!=null&&temp1.intdata!=number)
				 {
					 previous=temp1;
					 temp1=temp1.link;
				 }
				 if(temp1!=null)
				 {
					 previous.link=temp1.link;
					 flag++;
				 }
			 }
			 if(flag==0)
			 {
				 previous.link=temp;
				 /*while(node!=null&&node.intdata<temp.intdata)
				 {
					 node=node.link;
				 }*/
			 }
		  } 
		  
		  /**
		   * @param void 
		   * Printing the which are prime in between  1 to 1000.
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
			  TwoDArray.display(primearray,count);           //Returning primearray  array and length of the array to display in PrimeNumbers class
		  }
		  /**
		   * @param String sdata
		   * @return void 
		   * Inserting the node which is containing string data into the stack
		   * which are anagram into the stack 
		   * */
		  
		  public static void stringPushAnagram(String sdata)
			{
				 StackNode temporary;
				 temporary =new  StackNode();

				 if(temporary==null)
				 {
				 System.out.println("Stack is full");
				 }
				 else
				 {
					 temporary.sdata=sdata;
					 temporary.snext=top1;
				      top1=temporary;
				 }
				
			}
		  /**
		   * @param String sdata
		   * @return void 
		   * Inserting the node which is containing string data into the stack
		   * which are Nonanagram into the stack 
		   * */
		  public static void stringPushNonAnagram(String sdata)
			{
				 StackNode temporary;
				 temporary =new  StackNode();

				 if(temporary==null)
				 {
				 System.out.println("Stack is full");
				 }
				 else
				 {
					 temporary.sdata=sdata;
					 temporary.snext=top2;
				      top2=temporary;
				 }
				
			}
		  /**
		   * @param void 
		   * Displaying each and every element which are Anagram in side the stack
		   * */
		  public static void stackAnagramDisplay()
		  {
			  StackNode node=top1;
			  while(node!=null)
			  {
				  System.out.print(node.sdata+" ");
				  node=node.snext;
			  }
		  }
		  /**
		   * @param void 
		   * Displaying each and every element which are NonAnagram in side the stack
		   * */
		  public static void stackNonAnagramDisplay()
		  {
			  StackNode node=top2;
			  while(node!=null)
			  {
				  System.out.print(node.sdata+" ");
				  node=node.snext;
			  }
		  }
		  /**
		   * finding the numbers which are prime and displaying
		   * 
		   * */
		  
		  public static void primeNumberAnagramStack()
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
					  System.out.print(i+" ");
					  primearray[k]=i;
					  k++;
				  }
				  i++;
			  }
			  System.out.println();
			       arrayAnagramstack(primearray,k);           //Calling arrayAnagramstack method
		  }
		  /**
		   * finding the numbers that are anagram and prime in between 1 to 1000
		   * pushing into the array
		   * And creating the linkedlist and displaying the numbers in the stack
		   * which are anagarm and Nonanagram seperately by calling display function
		   * */
		  
		  public static void arrayAnagramstack(int primearray[],int count)
		  {
			         int x=0;
			         int y=0;
				
					String []sarray=new String[count];
					for(int i=0;i<count;i++)
					{
						sarray[i]=String.valueOf(primearray[i]);
					}
					int flag;
					String first=null;
					String second;
					//String str="a";
					for(int i=0;i<count-1;i++)
					{
						flag=0;
						for(int j=i+1;j<count;j++)
						{
							 first=sortString(sarray[i]);
							 second=sortString(sarray[j]);
							 if(first.equals(second)==true)    // (&& first.equals(str)==false)
							{ 
								//sarray[j]=null;
								//sarray[j]=str;
								x=x+2;
								flag++;
							}
							
						}
						if(flag==0)       //(&&sarray[i].equals(str)==false)
						{
							y=y+1;
						}
					}
					String []anagramarray=new String[x] ;
					String  []nonanagramarray=new String[y];
					
						
						for(int i=0;i<count;i++)
						{
							sarray[i]=String.valueOf(primearray[i]);
						}
						
						 first=null;
						 int a=0,b=0;
					
						for(int i=0;i<count-1;i++)
						{
							flag=0;
							for(int j=i+1;j<count;j++)
							{
								 first=sortString(sarray[i]);
								 second=sortString(sarray[j]);
								 if(first.equals(second)==true)//(&&first.equals(str)==false)
								{
									anagramarray[a]=sarray[i];
									stringPushAnagram(sarray[i]);
									a++;
									anagramarray[a]=sarray[j];
									stringPushAnagram(sarray[j]);
									a++;
									flag++;
								}
								
							}
							if(flag==0)//(&&sarray[i].equals(str)==false)
							{
								
								stringPushNonAnagram(sarray[i]);
								
								nonanagramarray[b]=sarray[i];
								b++;
							}
						}
						 System.out.println("Numbers which are anagram:");
						stackAnagramDisplay();                            //Calling stackAnagramDisplay method
						System.out.println();
						System.out.println("Numbers which are not anagram:");
						stackNonAnagramDisplay();                          //Calling stackNonAnagramDisplay method
						//StackAnagram.display(anagramarray,x,nonanagramarray,y);
			
				}
		  
		  /**
		   * @param String x
		   * @return void 
		   * Inserting the node which is containing string data into the queue
		   * which are anagram into the queue 
		   * */
		  public static void queueEnqueueAnagram(String x)
			{
			  QueueNode node=new QueueNode();
				
				if(node==null)
				{
					System.out.println("Queue is Overflow");
				}
				else
				{
					node.qdata=x;
					node.qnext=null;
					if(front==null)
					{
						front=rear=node;
					}
					else
					{
						rear.qnext=node;
						rear=node;
					}
				}
				
			}
		  /**
		   * @param String x
		   * @return void 
		   * Inserting the node which is containing string data into the queue
		   * which are Nonanagram into the queue 
		   * */
		  
		  public static void queueEnqueueNonAnagram(String x)
			{
			  QueueNode second=new QueueNode();
				
				if(second==null)
				{
					System.out.println("Queue is Overflow");
				}
				else
				{
					second.qdata=x;
					second.qnext=null;
					if(front1==null)
					{
						front1=rear1=second;
					}
					else
					{
						rear1.qnext=second;
						rear1=second;
					}
				}
				
			}
		  /**
		   * @return String 
		   * Removing the element from the queue
		   * 
		   * */
		  public static String dequeue()
			
			{
				String y=(String)"";
				QueueNode head;
				if(front==null)
				{
					System.out.println("Queue is underflow:");
				}
				else
				{
					head=front;
					front=front.qnext;
					y=head.qdata;
				}
				return y;
			}
		  /**
		   * @param void 
		   * Displaying each and every element which are Anagram in side the queue
		   * */
			public static void queueAnagramDisplay()
			{
				QueueNode p=front;
				while(p!=null)
				{
					System.out.print(p.qdata+" ");
					p=p.qnext;
				}
			}
			
			/**
			   * @param void 
			   * Displaying each and every element which are NonAnagram in side the queue
			   * */
			public static void queueNonAnagramDisplay()
			{
				QueueNode p=front1;
				while(p!=null)
				{
					System.out.print(p.qdata+" ");
					p=p.qnext;
				}
			}
			/**
			 * @param void 
			 * Finding the numbers which are prime in between 1 - 1000
			 * 
			 * */
			 public static void primeNumberAnagramQueue()
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
						  System.out.print(i+" ");
						  primearray[k]=i;
						  k++;
					  }
					  i++;
				  }
				  System.out.println();
				       arrayAnagramqueue(primearray,k);     //Calling arrayAnagaramqueue method 
			  }
			  
			 /**
				 * @param void 
				 * Finding the numbers which are prime  and anagram and also
				 *  prime and Non anagram in between 1 - 1000
				 * 
				 * */
			  public static void arrayAnagramqueue(int primearray[],int count)
			  {
				         int x=0;
				         int y=0;
					
						String []sarray=new String[count];
						for(int i=0;i<count;i++)
						{
							sarray[i]=String.valueOf(primearray[i]);
						}
						int flag;
						String first=null;
						String second;
						String str="a";
						for(int i=0;i<count-1;i++)
						{
							flag=0;
							for(int j=i+1;j<count;j++)
							{
								 first=sortString(sarray[i]);
								 second=sortString(sarray[j]);
								if(first.equals(second)==true&&first.equals(str)==false)
								{ 
									sarray[j]="a";
									x=x+2;
									flag++;
								}
								
							}
							if(flag==0)
							{
								y=y+1;
							}
						}
						String []anagramarray=new String[x] ;
						String  []nonanagramarray=new String[y];
						
							
							for(int i=0;i<count;i++)
							{
								sarray[i]=String.valueOf(primearray[i]);
							}
							
							 first=null;
							 int a=0,b=0;
						
							for(int i=0;i<count-1;i++)
							{
								flag=0;
								for(int j=i+1;j<count;j++)
								{
									 first=sortString(sarray[i]);
									 second=sortString(sarray[j]);
									 if(first.equals(second)==true&&first.equals(str)==false)
									{
										anagramarray[a]=sarray[i];
										queueEnqueueAnagram(sarray[i]);
										a++;
										anagramarray[a]=sarray[j];
										queueEnqueueAnagram(sarray[j]);
										a++;
										flag++;
									}
									
								}
								if(flag==0)
								{
									
									queueEnqueueNonAnagram(sarray[i]);
									
									nonanagramarray[b]=sarray[i];
									b++;
								}
							}
							 System.out.println("Numbers which are anagram:");
							queueAnagramDisplay();                            //Calling the queueAnagramDisplay method
							System.out.println();
							System.out.println("Numbers which are not anagram:");
							queueNonAnagramDisplay();                          //Calling the queueNonAnagramDisplay method
							//StackAnagram.display(anagramarray,x,nonanagramarray,y);
				
					}
			 
	   
	

}
