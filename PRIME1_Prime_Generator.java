package competitive_programming;

import java.util.Scanner;

public class PRIME1_Prime_Generator
{
	static boolean []sieve=new boolean[1000000000];

//	The input begins with the number t of test cases in a single line (t<=10).
//	In each of the next t lines there are two numbers m and n (1 <= m <= n <= 1000000000, n-m<=100000) separated by a space.
	//true=is prime
	//false=not prime
	private static void cryptosystem()
	{
		for(int i=0;i<sieve.length;i++)
		{
			sieve[i]=true;
		}
	
		for(int i=2;i*i<sieve.length;i++)
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
		
	}
	
	public static void main(String[] args) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
		cryptosystem();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int start=scan.nextInt();
			int end=scan.nextInt();
			for(int p=start;p<=end;p++)
			{
				if((p==1)||(p==0))
				{
					continue;
				}
				if(sieve[p]==true)
				{
					
					System.out.println(""+p);
				}
			}
		}
		

	}



}
