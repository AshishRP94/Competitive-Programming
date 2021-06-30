package competitive_programming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Chef_and_Semi_Primes
{
	static int[] sieve=new int[200];
	private static void sievefact()
	{
		
		for(int i=2;i<sieve.length;i++)
		{
			sieve[i]=i;
		}
		
		for(int i=2;i<sieve.length;i++)
		{
			if(sieve[i]==i)
			{
				for(int j=i*i;j<sieve.length;j++)
				{
					if(sieve[j]==j)
					{
						sieve[j]=i;
					}
					}
				}
		
		}
		
		
		
	}
	
	private static void semiprimes(int n)
	{
		int nums=n;
		HashMap<Integer,Integer>factors=new HashMap<Integer,Integer>();
		while(true)
		{
			if(n==1)
			{
				factors.put(1,1);
				break;
			}
			if(factors.containsKey(sieve[n]))
			{
				factors.put(sieve[n], (factors.get(sieve[n])+1));
			}
			else
			{
				factors.put(sieve[n], 1);				
			}
		
		}
		int sum1=0;
		int sum2=0;
		
		
			
			
			
		
		
		
	}
	
	
	
	
//	The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
//	The first and only line of each test case contains a single integer N
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		sievefact();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			semiprimes(n);
		}
		
		
		
	}





}
