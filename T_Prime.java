package competitive_programming;

import java.util.Scanner;

public class T_Prime {

//	3
//	4 5 6
//	Sample Output 0
//
//	YES
//	NO
//	NO
//	Explanation 0
//
//	The given test has three numbers. 
//	First number 4 has exactly three divisors — 1, 2 and 4, thus the answer for this number is "YES". 
//	Second number 5 has two divisors (1 and 5), hence the answer is "NO".
//	Third number 6 has four divisors (1, 2, 3, 6), hence the answer is "NO".
	
	static int[] sieve=new int[100000];
	
	
	
	private static void constructseive_primef()
	{// sieve[i]=we are storing the smallest prime factor that is dividing the number
	 // no of factors<log2n
		for(int i=2;i<sieve.length;i++)
		{
			sieve[i]=i; 
		}
		
		
		
		for(int i=2;(i*i)<sieve.length;i++)
		{
			if(sieve[i]==i)
			{
				for(int f=(i*i);f<sieve.length;f=f+i)
				{
					if(sieve[f]==f)
					{
						sieve[f]=i;
					}
					
				
				}
			}
			
		}
		
	}

	
	
	
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		constructseive_primef();

		int n=scan.nextInt();
		for(int i=0;i<n;i++)
		{
			int p=scan.nextInt();
			int count=0;
			while(true)
			{
				if(p<=1)
				{
					count+=1;
//					System.out.println("1");
					break;
				}
				
				int d=sieve[p];
				System.out.println(""+d);
				
//				System.out.println(" "+d);
				p/=d;
				count+=1;
			
			}
			
			System.out.println("count="+count);
			if(count==3)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
				
			}
			
		}
		
		
		

	}

}
