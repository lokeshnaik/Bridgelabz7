package com.bridgelabz.sampleprograms;

import java.util.Scanner;

class Linkedlist
{
     Node head;
   public void insert(String last)
   {
	   Node node=new Node();
	   node.data=last;
	   node.next=null;
	   if(head==null)
	   {
		   head=node;
	   }
	   else
	   {
		   Node n=head;
		   while(n.next!=null)
		   {
			   n=n.next;
		   }
		   n.next=node;
	   }
	   
   }
   
   public void show()
   {
	   Node p=head;
	   while(p!=null)
	   {
		   System.out.print(p.data+"->");
		   p=p.next;
	   }
   }
   
}



public class LinkedList
{
	public static void main(String [] args)
	{
		Linkedlist list=new Linkedlist();
	    int n;
	    Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
	    String [] array=new String[n];
	    for(int i=0;i<n;i++)
	    {
	    	array[i]=sc.next();
	    }
	    for(int i=0;i<n;i++)
	    {
	    	list.insert(array[i]);
	    }
	    list.show();
	    
	    
	}
}