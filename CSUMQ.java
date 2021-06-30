package competitive_programming;

import java.util.Scanner;

public class CSUMQ 
{

//	he first line contains N, the number of integers in our list (N <= 100,000). The next line holds N numbers that are guaranteed to fit inside an integer. 
//	Following the list is a number Q (Q <= 10,000). The next Q lines each contain two numbers i and j which specify a query you must answer (0 <= i, j <= N-1).
	private static void findans(int l, int r, int[] prefixarr) 
	{
		if(l-1>=0)
		{
			System.out.println(prefixarr[r]-prefixarr[l-1]);
			
		}
		if(r==prefixarr.length-1)
		{
			System.out.println(prefixarr[r]);
			
		}
		
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		int queries=scan.nextInt();
		
		int []prefixarr=new int[arr.length];
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			prefixarr[i]=sum;
		}
		
		for(int i=0;i<queries;i++)
		{
			int l=scan.nextInt();
			int r=scan.nextInt();
			findans(l,r,prefixarr);
		}
//		System.out.println();
	}



}
