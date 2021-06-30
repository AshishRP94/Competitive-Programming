package competitive_programming;

import java.util.Scanner;

public class codeforces697A {

//	The first line contains one integer t (1≤t≤104) — the number of test cases. Then t test cases follow.
//
//	Each test case contains one integer n (2≤n≤1014).
//
	
	private static void odddivisor(long n)
	{
		if((n&1)==1)
		{
			System.out.println("YES");
			return;
		}
		
		boolean flag=false;
		for(int i=1;i*i<=n;i+=2)
		{
//			System.out.println("i="+i);
			if(i>1)
			{
//				System.out.println("in i"+i);
				if(n%i==0)
				{
					flag=true;
//					System.out.println("flg"+flag);
					break;
					
				}
			
			}
		}
		if(flag==true)
		{
			
			System.out.println("YES");
		}
		else
		{
			
			System.out.println("NO");
		}
		
	}

	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			long n=scan.nextLong();
			odddivisor(n);
		}

	}
//	6
//	2
//	3
//	4
//	5
//	
//	1099511627776


}
