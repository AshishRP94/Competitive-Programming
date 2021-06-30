package competitive_programming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class D_Prime_Counting
{
	static boolean []sieve;
	
	
	private static void constructsieve()
	{
		sieve =new boolean[1000000];
		for(int i=2;(i*i)<sieve.length;i++)
		{
			if(sieve[i]==false)
			{
				for(int j=i*i;j<sieve.length;j+=i)
				{
					if(sieve[j]==false)
					{
						sieve[j]=true;
					}
				}
			}
			
		}
	}
	
	static class pair
	{
		int x;
		int y;
		pair(int x,int y)
		{
			this.x=x;
			this.y=y;
		}
		
	}
	
	
//	First line: A single integer  denoting the number of test cases
//	Each test case contains the following lines:
//	 line: , the no. of intervals
//	 lines follow giving the intervals in the form of 


	private static void countprimeno(int n, ArrayList<pair> range)
	{
//		int []scanline=new int[n];
//		for(int i=0;i<range.size();i++)
//		{
//			
//			
//			
//		}
//		
		
		
		
		
		
		
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int i=0;i<range.size();i++)
		{
			pair p=range.get(i);
			int x=p.x;
			int y=p.y;
			
			for(int j=x;j<=y;j++)
			{
				if(sieve[j]==false)
				{
					
				if(hm.containsKey(j))
				{
					int c=hm.get(j);
					hm.put(j,c+1);
				}
				else
				{
					hm.put(j, 1);
				}
				}
				
			}
		
		}
		
//		System.out.println("hi");
		int count=0;
		for(int i:hm.keySet())
		{
			
		
			if(hm.get(i)==n)
			{
				count+=1;
			}
		}
			
		
	
		
	System.out.println(count);	
	}

	

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		constructsieve();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			ArrayList<pair> range=new ArrayList<pair>();
			for(int j=0;j<n;j++)
			{
				int x=scan.nextInt();
				int y=scan.nextInt();
				range.add(new pair(x,y));
			}
			countprimeno(n,range);
		}
		
		
		
	}





}
