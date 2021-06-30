package competitive_programming;

import java.util.Scanner;

public class B_Berland_Crossword {

//	The first line contains a single integer t (1≤t≤1000) — the number of testcases.
//	Then the descriptions of t testcases follow.
//	The only line of each testcase contains 5 integers n,U,R,D,L (2≤n≤100; 0≤U,R,D,L≤n).
	
	private static void valid(int n, int up, int ri, int le, int dow)
	{
		int tup=n;
		int tdow=n;
		int tle=n-2;
		int tri=n-2;
		if(tup>=up && tdow>=dow && tle>=le && tri>ri)
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
			int n=scan.nextInt();
			int up=scan.nextInt();
			int u=up;
			int ri=scan.nextInt();
			int r=ri;
			if(up>0 && ri>0)
			{
				ri=ri-1;
			}
			int le=scan.nextInt();
			int l=le;
			if(up>0 && le>0)
			{
				le=le-1;
			}
			int dow=scan.nextInt();
			int d=dow;
			if(dow>0 && ri>0)
			{
				ri=ri-1;
			}
			if(dow>0 && le>0)
			{
				le=le-1;
			}
			if(l>0 && r>0 && dow>0 && u==0)
			{
				System.out.println("NO");
			}
			else if(l>0 && r>0 && d==0 && u>0)
			{
				System.out.println("NO");
				
			}
			else if(l>0 && r==0 && d>0 && u>0)
			{
				System.out.println("NO");
				
			}
			else if(l==0 && r>0 && d>0 && u>0)
			{
				System.out.println("NO");
			}
			else
			{
				valid(n,up,ri,le,dow);
				
			}
		}

	}



}
