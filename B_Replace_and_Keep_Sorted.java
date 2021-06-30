package competitive_programming;

import java.util.Scanner;

public class B_Replace_and_Keep_Sorted {

	
//	The first line contains three integers n, q and k (1≤n,q≤105, n≤k≤109) — the length of array a, the number of queries and number k.
//	The second line contains n integers a1,a2,…,an (1≤ai≤k). This array is strictly increasing  — a1<a2<…<an.
//	Each of the following q lines contains two integers li, ri (1≤li≤ri≤n).
	
	
	private static void find_sol(int[] arr, int l, int r, int k)
	{
		int temp=0;
		if(l==0)
		{
			temp=((arr.length)-r);
		}
		
		
		
		System.out.println(temp*2);
		
	}
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int q=scan.nextInt();
		int k=scan.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
			
		}
		
		for(int i=0;i<q;i++)
		{
			int l=scan.nextInt();
			int r=scan.nextInt();
			find_sol(arr,l,r,k);
		}
		
		
	}



}
