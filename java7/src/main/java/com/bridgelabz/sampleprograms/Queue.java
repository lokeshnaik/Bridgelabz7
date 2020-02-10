package com.bridgelabz.sampleprograms;

import java.util.Scanner;


class QueueList
{
	Node front=null,rear=null;
	public void enqueue(int x)
	{
		Node node=new Node();
		
		if(node==null)
		{
			System.out.println("Queue is Overflow");
		}
		else
		{
			node.data=x;
			node.next=null;
			if(front==null)
			{
				front=rear=node;
			}
			else
			{
				rear.next=node;
				rear=node;
			}
		}
		
	}
	
	public int dequeue()
	
	{
		int y=-1;
		Node head;
		if(front==null)
		{
			System.out.println("Queue is underflow:");
		}
		else
		{
			head=front;
			front=front.next;
			y=head.data;
		}
		return y;
	}
	
	public void display()
	{
		Node p=front;
		while(p!=null)
		{
			System.out.print(p.data+"->");
			p=p.next;
		}
	}
}

public class Queue {

	public static void main(String[] args) 
	{
		QueueList queue=new QueueList();
		int n;
		Scanner sc=new Scanner(System.in);;
		n=sc.nextInt();
		int [] array=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			queue.enqueue(array[i]);
		}
		queue.display();
		System.out.println();
		int k=queue.dequeue();
		System.out.println();
		System.out.println("value="+k);
		queue.display();
		
	}

}
