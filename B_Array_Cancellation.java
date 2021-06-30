package competitive_programming;

import java.util.Scanner;

public class B_Array_Cancellation
{

//	Each test contains multiple test cases. The first line contains the number of test cases t (1≤t≤5000). Description of the test cases follows.
//	The first line of each test case contains an integer n (1≤n≤105)  — the number of elements.
//	The next line contains n integers a1,…,an (−109≤ai≤109). It is given that ∑ni=1ai=0.
//	It is guaranteed that the sum of n over all test cases does not exceed 105.
	
	private static void arraycancel(int n, int[] arr)
	{
		int indj=Integer.MIN_VALUE;
		int indi=Integer.MAX_VALUE;
		int cost=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]<0)
				{
					if(j>indj)
					{
						indj=j;
					}
				}
				else
				{
					if(i<indi)
					{
						indi=i;
					}
					
				}
			}
			int tempj=-(arr[indj]);
			if(indi<indj)
			{
				if(tempj>arr[indi])
				{
					cost+=arr[indi];
					arr[indi]=arr[indi]-cost;
					arr[indj]=arr[indj]-cost;
					
				}
				else
				{
					cost+=arr[indj];
					arr[indj]=arr[indj]-cost;
					arr[indi]=arr[indi]-cost;
				}
			}
			else
			{
				if(tempj>arr[indi])
				{
					int tempcost=arr[indi];
					arr[indi]=arr[indi]-tempcost;
					arr[indj]=arr[indj]-tempcost;
				}
				else
				{
					int tempcost=arr[indj];
					arr[indj]=arr[indj]-tempcost;
					arr[indi]=arr[indi]-tempcost;
				}
				
			}
		}
		
//		7
//		4
//		-3 5 -3 1
//		2
//		1 -1
//		4
//		-3 2 -3 4
//		4
//		-1 1 1 -1
//		7
//		-5 7 -6 -4 17 -13 4
//		6
//		-1000000000 -1000000000 -1000000000 1000000000 1000000000 1000000000
//		1
//		0

		
		System.out.println(""+cost);
		
		
	}
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int []arr=new int[n];
			for(int j=0;j<n;j++)
			{
				arr[j]=scan.nextInt();
			}
			arraycancel(n,arr);
		}
		
	}



}
