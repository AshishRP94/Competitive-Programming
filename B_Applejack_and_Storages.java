package competitive_programming;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class B_Applejack_and_Storages {

//	The first line contains a single integer n (1≤n≤105):
//	the initial amount of planks at the company's storehouse, the second line contains n integers a1,a2,…,an (1≤ai≤105): the lengths of the planks.
//	The third line contains a single integer q (1≤q≤105): the number of events in the company.
//	Each of the next q lines contains a description of the events in a given format: the type of the event (a symbol + or −) is given first,
//	then goes the integer x (1≤x≤105).
	

	private static void helpapplejack( HashMap<Integer, Integer> planks, int[] events)
	{
		for(int i=0;i<events.length;i++)
		{
			int e=events[i];
			if(planks.containsKey(e))
			{
				if(e>0)
				{
				int c=planks.get(e);
				planks.put(e,c+1);
				}
				else
				{
				int c=planks.get(e);
				if(c-1==0)
				{
					planks.put(e, 0);
				}
				else
				{
					planks.put(e, c-1);
				}
				
				}
			}
			else
			{
				planks.put(e, 1);	
			}
			
			int ans=0;
			for(int temp  : planks.keySet()) 
			{
				ans+=((planks.get(temp))/2);
			}
			if(ans>=4)
			{
				
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
				
			}
			
			
			
		}
		
	}
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		HashMap<Integer,Integer>planks=new HashMap<Integer,Integer>(); 
		for(int i=0;i<planks.size();i++)
		{
			 int temp=scan.nextInt();
			 if(planks.containsKey(temp))
			 {
				 int q=planks.get(temp);
				 planks.put(temp,q+1);
			 }
			 else
			 {
				 planks.put(temp, 1);
			 }
		}
		int q=scan.nextInt();
		int []events=new int[q];
		for(int j=0;j<events.length;j++)
		{
			events[j]=scan.nextInt();
		}
		helpapplejack(planks,events);
		

	}



}
