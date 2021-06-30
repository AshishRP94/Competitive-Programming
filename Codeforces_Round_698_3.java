package competitive_programming;

import java.util.Scanner;

public class Codeforces_Round_698_3 {

//	The first line contains a single integer t (1≤t≤100) — the number of testcases.
//
//	The first line of each test case contains a single integer n (1≤n≤100).
//
//	The second line of each test case contains n integers a1,a2,…,an (1≤ai≤n). It is guaranteed that a1≤a2≤…≤an.
	
	private static void helpnaerry(int[] ball)
	{
		int count=0;
		int max=Integer.MIN_VALUE;
		boolean flag=false;
		for(int i=0;i<ball.length-1;i++)
		{
//			System.out.println("bal"+ball[i]);
//			System.out.println("bal1"+ball[i+1]);
			if(ball[i]==ball[i+1])
			{
				count+=1;
//				System.out.println("count="+count);
				
			}
			else
			{
//				System.out.println("count="+count);
//				System.out.println("amx="+max);
				flag=true;
				if(count>max)
				{
					max=count;
//					System.out.println("in="+max);
					
				}
				count=0;
			}
			
			
		}
		if(flag==false)
		{
			max=count;
			
		}
		System.out.println(""+(max+1));
		
	}
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int []ball=new int[n];
			for(int ii=0;ii<ball.length;ii++)
			{
				ball[ii]=scan.nextInt();
			}
			helpnaerry(ball);
		}
		
		
	}



}
