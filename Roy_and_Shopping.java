package competitive_programming;

import java.util.Scanner;

public class Roy_and_Shopping {
	
	static int []sieve=new int[1000000]; 
	private static void sievepf()
	{
		for(int i=2;i<sieve.length;i++)
		{
			sieve[i]=i;
			
		}
		
		for(int i=2;i*i<sieve.length;i++)
		{
			if(sieve[i]==i)
			{
				for(int j=i*i;j<sieve.length;j+=i)
				{
					if(sieve[j]==j)
					{
						sieve[j]=i;
					}
				
				}
			}
			
		}
		
	}

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		sievepf();
		long products=scan.nextLong();
		for(long i=0;i<products;i++)
		{
			int n=scan.nextInt();
			if(sieve[n]==n)
			{
				System.out.println("0");
			}
			else
			{
				System.out.println(""+(n-sieve[n]));
			}
		}
		
		
		
		
		
	}



}
