package competitive_programming;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Destroy_The_Asteroids 
{

//	First line will contain N and K, number of groups and number of different groups he can destroy at once.
//	Second line contains N integers (G1, G2, ….,Gn) denoting each group's size.
	
	
	private static long findtime(int destroy, long[] asteriods) 
	{
		
		
		PriorityQueue<Long> pq = new PriorityQueue<>();
		

		for(int i=0;i<destroy;i++)
		{
			pq.add(asteriods[i]);
		}
		
		if(destroy==asteriods.length)
		{
			return pq.poll();
		}
		long min=0;
		long maxtime=0;
		for(int i=destroy;i<asteriods.length;i++)
		{
			min=pq.poll();
			for(int k=0;k<destroy;k++)
			{
				if(k==(destroy-1))
				{
					pq.add(asteriods[i]);
					if(pq.peek()==0)
					{
						while(true)
						{
							if(pq.size()==destroy)
							{
								break;
							}
							i++;
							pq.add(asteriods[i]);
						}
					}
					
				}
				long temp=pq.poll();
				long diff=temp-min;
				if(diff==0)
				{
 
				}
				else
				{
					
					pq.add(diff);
				}
				
				
			
			}
			maxtime+=min;
			
			
		
		}
		
		return maxtime;
	}

	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int noa=scan.nextInt();
		int destroy=scan.nextInt();
		long []asteriods=new long[noa];
		for(int i=0;i<asteriods.length;i++)
		{
			asteriods[i]=scan.nextLong();
		}
		Arrays.sort(asteriods);
		long []asteriod=new long[asteriods.length];
		int t=0;
		for(int i=(asteriod.length-1);i>=0;i--)
		{
			asteriod[t]=asteriods[i];
			t+=1;
		}
		System.out.println(findtime(destroy,asteriod));
		
		
		
		

	}


}
