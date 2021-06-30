package competitive_programming;

import java.util.Scanner;

public class Sieve_of_Eratosthenes 
{
	static void Sieve(int n)
	{
		Boolean[] primes=new Boolean[n+1];
		for(int i=0;i<n;i++)
		{
		//initally all numbers are treated as prime numbers
		primes[i]=true;	
		}
		
		for(int p=2;p*p<=n;p++)
		{
			if(primes[p]==true)
			{
				for(int i=p*p;i<=n;i+=p)
				{
					primes[i]=false;
				}
				
			}
		}
		
		for(int i=2;i<=n;i++)
		{
			if(primes[i]==true)
			{
				System.out.print(i+",");
			}
		}
		
		
	}

	public static void main(String[] args) 
	{
	
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	Sieve(n);
	
	
	
	
	
	}

}
