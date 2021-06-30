package competitive_programming;

import java.util.HashSet;
import java.util.Scanner;

public class Special_numbers {

//	First line: P
//	Second line: T (number of test cases)
//	Next T lines: N
	
	static int []sieve;
	private static void constructsieve()
	{
		sieve=new int[1000000];
		for(int i=2;i<sieve.length;i++)
		{
			sieve[i]=i;
		}
		
		for(int i=2;(i*i)<sieve.length;i++)
		{
			if(sieve[i]==i)
			{
				for(int j=(i*i);j<sieve.length;j+=i)
				{
					if(sieve[j]==j)
					{
						sieve[j]=i;
					}
				}
			}
		}
		
	}
	
	private static void primecounting(int n, int p)
	{
		int count=0;
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(0);
	
		int t=n;
		while(true)
		{
		
			if(n==1)
			{
				break;
			}
			n/=sieve[n];
			if(n!=0 || n!=1 || n!=t)
			{
				hs.add(sieve[n]);
			}
		}
		
		

		if((hs.size()-1)>=p)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
		/*
		2
		6
		1
		6
		7
		8
		9
		10*/
		
		/*NO
		YES
		NO
		NO
		NO
		YES
		*/
	}

	
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		constructsieve();
		int p=scan.nextInt();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			primecounting(n,p);
		}
		
		
		
		
	}

	


}
