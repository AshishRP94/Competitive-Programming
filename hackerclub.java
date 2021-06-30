package competitive_programming;

//import java.util.Scanner;

import java.util.Scanner;

public class hackerclub
{

//	INPUT:First line of input contains an Integer T denoting the number of test cases.
//	Next each of the T lines contain one integer N.
	static boolean []sieve=new boolean[10000];
	static int []primes=new int[10000];
	private static int constructsieve()
	{
		sieve[2]=true;
		for(int i=3;i<sieve.length;i=i+2)
		{
			sieve[i]=true;
		}
//		System.out.println(" -->"+sieve[4]);
		
		
		int c=0;
		for(int i=3;(i*i)<sieve.length;i++)
		{
			if(sieve[i]==true)
			{
			for(int p=i*i;p<sieve.length;p+=i)
			{
				if(sieve[p]==true)
				{
					sieve[p]=false;
				}
			}
			}
		}
		
	
		primes[c]=2;
		c+=1;
		for(int i=3;i<sieve.length;i+=2)
		{
			if(sieve[i]==false)
			{
				
				primes[c]=i;
				c+=1;
			}
		}
		
		
		
		
		
		
		for(int i=2;i<=c;i++)
		{
			System.out.print(" "+primes[i]);
		}
		
		return c;
		
		
	}
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int c=constructsieve();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			
			int n=scan.nextInt();
			if(sieve[n]==true)
			{
				System.out.println(""+n);
			}
			else
			{
				int low=0;
				int high=c;
				int mid=0;
				while(low<=high)//this returns upper bound
				{
					mid=(low+((high-low)/2));
//					System.out.println("mid="+mid);
					if(primes[mid]<n)
					{
						low=mid+1;
//						System.out.println("low="+low+"|primes="+primes[mid]);
					}
					else
					{
						high=mid-1;
//						System.out.println("high="+high+"|primes="+primes[mid]);
					}
//					System.out.println();
				}
//				System.out.println("primes 1 "+primes[mid-1]);
//				System.out.println("primes 2 "+primes[mid]);
				int l=(n-primes[mid-1]);
				
//				System.out.println("l="+l);
				int r=(primes[mid]-n);
//				System.out.println("l="+r);
				if(l>r)
				{
					System.out.println(" "+primes[mid]);
				}
				else
				{
					System.out.println(" "+primes[mid-1]);
				}
			}
			}
			
			
			
//		}

	}



}
