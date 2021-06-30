package competitive_programming;

import java.util.Scanner;

public class codeforces697B {

//	The first line contains one integer t (1≤t≤104) — the number of test cases. Then t test cases follow.
//	Each test case contains one integer n (1≤n≤106) — the number that Polycarp wants to represent as the sum of the numbers 2020 and 2021.
	
	private static void year(long n)
	{
		if(n<2021)
		{
			System.out.println("NO");
			return;
		}
		
		int py=2020;
		int cy=2021;
		long sum=0;
		long sum1=0;
		long sum2=0;
		boolean sumf=false;
		boolean sum1f=false;
		boolean sum2f=false;
	
			
		while(true)
		{
			if(sumf==true && sum1f==true && sum2f==true)
			{
				break;
			}
			
			
			if(sum==n)
			{
				System.out.println("YES");
				return;
			}
			
			if(sum1==n)
			{
				System.out.println("YES");
				return;
			}
			
			
			if(sum2==n)
			{
				System.out.println("YES");
				return;
			}
			
			
			
			if(sum>n)
			{
				sumf=true;
			}
			
			if(sum1>n)
			{
				sum1f=true;
			}
			
			if(sum2>n)
			{
				sum2f=true;
			}
			
			
			sum+=py;
			sum1+=cy;
			sum2+=py+cy;
		}
		long num=2020;
		long tsum=0;
		for(int i=0;;i++)
		{
			if(num==sum)
			{
				System.out.println("YES");
				return;
			}
			
			if(num>sum)
			{
				break;
			}

			tsum=num;
			for(int j=0;;j++)
			{
				if(tsum==n)
				{
					System.out.println("YES");
					return;
				}
				
				if(tsum>n)
				{
					break;
				}
				tsum+=2021;
			}
			num+=2020;
		
		}
		System.out.println("NO");
	
	}
		
		
		
		
//	5
//	1
//	4041
//	4042
//	8081
//	8079

	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			long n=scan.nextLong();
			year(n);
		}
	}



}
