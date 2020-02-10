package com.bridgelabz.utility;


public class Utility 
{
	public static Node head;
	   public static void insert(String data)
	   {
		   Node node=new Node();
		   node.data=data;
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
	   public static  void show()
	   {
		   Node node=head;
		   while(node.next!=null)
		   {
			   System.out.print(node.data+" ");
			   node=node.next;
		   }
		   System.out.println(node.data);
	   }
}
