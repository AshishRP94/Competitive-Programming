package competitive_programming;

import java.util.Scanner;

public class Educational_Codeforces_Round_103_3 {
	
//	The first line containints a single integer t (1≤t≤1000) — the number of test cases.
//	The first and only line of each test case contains two integers n and k (1≤n≤109; 1≤k≤109).
	private static int minele(int n, int d)
	{
		if(n==d)
		{
			return 1;
		}
		
		if(n==1)
		{
			return d;
		}
		
		long ans=1;
		int c=1;
		for(int i=2;;i++)
		{
			c=i;
			ans=i*n;
			if(ans>d)
			{
				break;
			}
		}
		
		return c;
	}
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int d=scan.nextInt();
			System.out.println(minele(n,d));
		}
	
	
	}



}
