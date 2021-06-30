package competitive_programming;

import java.util.Scanner;

public class A_Buy_the_String {

//	The first line contains a single integer t (1≤t≤10) — the number of test cases. Next 2t lines contain descriptions of test cases.
//	The first line of the description of each test case contains four integers n, c0, c1, h (1≤n,c0,c1,h≤1000).
//	The second line of the description of each test case contains the binary string s of length n.
	
	
	private static void findmincost(int cost0, int cost1, int exchcost, String bs)
	{
		
		int count0=0;
		int count1=0;
		for(int i=0;i<bs.length();i++)
		{
			if(bs.charAt(i)=='1')
			{
				count1+=1;
			}
			else
			{
				count0+=1;
			}
		}
		

		
		int ans=Integer.MAX_VALUE;
		int finalans=0;
		
		
			ans=((count0*cost0)+(count1*cost1));
			int ans0=((count0*exchcost)+((count1+count0)*cost1));
			int ans1=((count1*exchcost)+((count0+count1)*cost0));
			finalans=Math.min(ans, Math.min(ans0, ans1));
			
		
		
		System.out.println(""+finalans);
		
		
		
	}
	
	
	public static void main(String[] args)
	{
		
		
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int cost0=scan.nextInt();
			int cost1=scan.nextInt();
			int exchcost=scan.nextInt();
			scan.nextLine();
			String bs=scan.nextLine();
			findmincost(cost0,cost1,exchcost,bs);
		}
		
//		7
//		10 3 1 1
//		1000000110
//		1 10 1 1000
//		0
//		1 1 10 2
//		1
//		4 4 4 1
//		1001
//		1 1 1 1
//		1
//		2 1000 500 1000
//		11
//		3 500 500 1
//		101
		
//		17
//		10
//		3
//		16
//		1
//		1000
//		1500

		

	}



}
