package competitive_programming;

import java.util.Scanner;

public class B_Prime_Square {

//	The first line contains a single integer t (1≤t≤10) — the number of test cases.
//	Each of the next t lines contains a single integer n (2≤n≤100) — the required size of a square.

	static int []sieve=new int[10000];
	private static void constructsieve()
	{
		for(int i=2;i<sieve.length;i++)
		{
			
			if(sieve[i]==0)
			{
				for(int j=i*i;j<sieve.length;j++)
				{
					
					if(sieve[i]==0)
					{
						sieve[i]=1;
					}
				}
			}
		}
		
	}
	
	private static void primesquare(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				
			}
		}
		
	}

	public static void main(String[] args)
	{
		constructsieve();
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			primesquare(n);
		}
		

	}





}
