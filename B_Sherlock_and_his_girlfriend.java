//package competitive_programming;

import java.util.Scanner;

public class B_Sherlock_and_his_girlfriend {

//	The only line contains single integer n (1 ≤ n ≤ 100000) — the number of jewelry pieces.
	
	
	static int []sieve;
	 B_Sherlock_and_his_girlfriend(int n)
	 {
		 sieve=new int[n+2];  
		 
	 }
	
	private static void constructsieve()
	{

		sieve[1]=1;
		int countcolors=1;
		for(int i=2;i<sieve.length;i++)
		{
			if(sieve[i]==0)
			{
//				System.out.println("seive[i]="+sieve[i]+"|sieve[i-1]="+sieve[i-1]+"|i="+i);
				sieve[i]=sieve[i-1];
				int count=sieve[i-1];
//				System.out.println("count="+count);
				for(int p=(i*i);p<sieve.length;p+=i)
				{
					if(sieve[p]==0)
					{
//						System.out.println("p="+p);
						count+=1;
						countcolors+=1;
//						System.out.println("count="+count+"countcolors="+countcolors);
						sieve[p]=count;
					}
				
				 }
			}
			
		}
		
		
		System.out.println(countcolors+"");
		for(int i=2;i<sieve.length;i++)
		{
			System.out.print(sieve[i]+" ");
		}
		
		
	}
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		B_Sherlock_and_his_girlfriend obj=new  B_Sherlock_and_his_girlfriend(n);
		constructsieve();
	}



}
