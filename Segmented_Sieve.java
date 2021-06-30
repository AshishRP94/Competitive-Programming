package competitive_programming;

import java.util.Scanner;
import java.util.Vector;

public class Segmented_Sieve 
{
	// This methid finds all primes smaller than 'limit'
    // using simple sieve of eratosthenes. It also stores
    // found primes in vector prime[]
	private static void sieve(int limit,Vector<Integer> prime)
	{
		boolean mark[] =new boolean[limit+1];
		for(int i=0;i<mark.length;i++)
		{
			//init treat all numbers as prime numbers
			mark[i]=true;
		}
		
		for(int i=2;i*i<mark.length;i++)
		{
			
		if(mark[i]==true)
		{
		for(int j=i*i;j<mark.length;j+=i)
		{
		mark[i]=false;	
		
		
		}
		
		}
		}
		
		
		// prints all prime numbers 2 to n and them in vector
		for(int i=2;i<mark.length;i++)
		{
			if(mark[i]==true)
			{
				prime.add(i);
				System.out.print(i+",");
				
				
			
			}
		}
		
	
	
	}
	
	

	private static void segmentedsieve(int n) 
	{
		int limit =(int)Math.floor((double)(Math.sqrt((double)n))+1);
		Vector<Integer> prime =new Vector<>();
		sieve(limit,prime);
		
		int low=limit;
		int high=2*limit;
		
		while(low<n)
		{
		//rem
			// icomplete
			
		
		
		
		
		}
		
		
		
		
		
	
	
	
	
	
	}


	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		segmentedsieve(n);
	
	
	}

}
