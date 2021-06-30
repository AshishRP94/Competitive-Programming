package competitive_programming;

import java.util.Scanner;

public class Shivigawdz 
{
	
	
	
//	The first line of the input contains T, the number of testcases.
//	The first line of the each test case contains 3 integers, N, B and A (A≤B).
//	The next line contains N numbers, the number of names that can be written in the i-th page of the Death Note, for all 1≤i≤N.
	
	private static void maximumkills(int[] pages, int min, int max)
	{
		
		long []prefix=new long[pages.length];
		int start=min-1;
		int end=max-1;
		long sum=0;
		float avg=0.0f;
		float maxavg=0.0f;
		int count=0;
		
		for(int i=0;i<end;i++)
		{
		sum+=pages[i];	
		 prefix[i]=sum;
			
		}
		
		for(int j=start;j<pages.length;j++)
		{
			for(int i=start;i<end;i++)
		    {
			count+=1;
			
			
			
			if(avg>maxavg)
			{
				maxavg=avg;
			}
		    }
			
			if(end>pages.length-1)
			{
				break;
			}
			else
			{
				
			end+=1;
			}
			
			sum=0;
			if(start+1>pages.length)
			{
				break;
			}
		
			
			System.out.println();
			
		}
		System.out.println(""+maxavg);
		
	}
	
	public static void main(String[] args) 
	{
		
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int j=0;j<t;j++)
		{
			
		int noopages=scan.nextInt();
		int max=scan.nextInt();
		int min=scan.nextInt();
		int []pages=new int[noopages];
		for(int i=0;i<noopages;i++)
		{
			pages[i]=scan.nextInt();
		}
		

		maximumkills(pages,min,max);
		}
	
	}

//	1
//	5 3 2
//	1 2 3 4 5
	
//	System.out.println("t="+t);
//	sum+=pages[t];
//	prefix[t]=sum;
//	System.out.println("-->"+prefix[t]);

}
