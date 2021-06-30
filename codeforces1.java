package competitive_programming;

import java.util.Scanner;

public class codeforces1
{
//	The first line of the input contains a single integer t (1≤t≤100) — the number of test cases. Each test case consists of a single line containing a single integer n (1≤n≤2⋅105).
//	It is guaranteed that the sum of n over all test cases does not exceed 2⋅105.
	
	private static void stoppanel(int n)
	{
	 
		int count=9;
		for(int i=0;i<n;i++)
		{
			if(count==-1)
			{
				count=9;
			}
			System.out.print(""+count);
			count-=1;
			
		}
		System.out.println();
		
		
	}
	
	public static void main(String args[])
	{
		
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			stoppanel(n);
			
		}
		
		
		
	}



}
