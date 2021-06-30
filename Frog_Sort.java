package competitive_programming;

import java.util.ArrayList;
import java.util.Scanner;

public class Frog_Sort
{
	

//	The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
//	The first line of each test case contains a single integer N.
//	The second line contains N space-separated integers W1,W2,…,WN.
//	The third line contains N space-separated integers  L1,L2,…,LN
	static class pair
	{
		int value=0;
		int index=0;
		pair(int value,int index)
		{
			this.value=value;
			this.index=index;
		}
		
	}
	
	private static void frog_sort(int[] fweight, int[] fjump, int min)
	{
		for(int i=0;i<fweight.length;i++)
		{
			
			
		}
		
		
		
	}
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int []fweight=new int[n];
			for(int j=0;j<fweight.length;j++)
			{
				fweight[j]=scan.nextInt();
			}
			
			int []fjump=new int[n];
			int min=Integer.MIN_VALUE;
			for(int j=0;j<fjump.length;j++)
			{
				fjump[j]=scan.nextInt();
				
				if(min<fjump[j])
				{
					min=fjump[j];
					
				}
			}
			frog_sort(fweight,fjump,min);
			
		}
	}



}
