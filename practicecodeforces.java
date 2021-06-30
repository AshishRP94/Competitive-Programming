package competitive_programming;

import java.util.HashMap;
import java.util.Scanner;

public class practicecodeforces
{
	static class pair
	{
		int x;
		int y;
		pair(int x,int y)
		{
			this.x=x;
			this.y=y;
		}
		
	}
	
//	The first line of the input contains one integer t (1≤t≤1000) — the number of test cases. Then t test cases follow.
//	The first line of the test case contains one integer n (1≤n≤50) — the number of participants. 
//	The second line of the test case contains n integers w1,w2,…,wn (1≤wi≤n), where wi is the weight of the i-th participant.
	
	private static void boatcompete(int n, int[] weight)
	{
		int [][]wsum=new int[n][n];
		pair p=new pair(0,Integer.MIN_VALUE);
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>(); 
		for(int i=0;i<wsum.length;i++)
		{
			for(int j=0;j<weight.length;j++)
			{
				if(j>i)
				{
					wsum[i][j]=weight[i]+weight[j];
					if(hm.containsKey(wsum[i][j]))
					{
						int temp=hm.get(wsum[i][j]);
						if(p.y<temp)
						{
							p.y=temp;
							p.x=wsum[i][j];
						}
						hm.put(wsum[i][j], temp+1);
					}
					else
					{
						hm.put(wsum[i][j],1);
						
					}
				}
			}
		}
		
//		for(int i=0;i<wsum.length;i++)
//		{
//			for(int j=0;j<wsum.length;j++)
//			{
//				System.out.print(" "+wsum[i][j]);
//			}
//			System.out.println();
//		}
		
		
	int sum=p.x;
	int count=p.y;
	int ans=0;
	boolean []track=new boolean[n];
	for(int i=0;i<wsum.length;i++)
	{
		for(int j=0;j<wsum.length;j++)
		{
			if((wsum[i][j]==sum) && (track[j]==false))
			{
				track[j]=true;
				ans+=1;
			}
		}
		
	}
	
	System.out.println(""+ans);
	}
	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int []weight=new int[n];
			for(int j=0;j<weight.length;j++)
			{
				weight[j]=scan.nextInt();				
			}
			boatcompete(n,weight);
			
		}
		
	}


	
	
}