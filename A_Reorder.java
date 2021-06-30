package competitive_programming;

import java.util.Scanner;

public class A_Reorder
{
	
//	The first line contains a single integer t — the number of test cases (1≤t≤100). The test cases follow, each in two lines.
//	The first line of a test case contains two integers n and m (1≤n≤100, 0≤m≤106). The second line contains integers a1,a2,…,an (0≤ai≤106) — the elements of the array.
	
	
	
	private static void reorder(int m, int[] arr)
	{
		float []prefixsum=new float[m];
		float sum=0.0f;
		for(int j=0;j<arr.length;j++)
		{
			helper[];
			
		}
		
		
	}
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int m=scan.nextInt();
			int []arr=new int[n];
			for(int j=0;j<n;j++)
			{
				arr[i]=scan.nextInt();
			}
			reorder(m,arr);
		}
		

	}



}
