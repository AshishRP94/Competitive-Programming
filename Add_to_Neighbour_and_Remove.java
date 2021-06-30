package competitive_programming;

import java.util.Scanner;

public class  Add_to_Neighbour_and_Remove{


	
//	The first line contains a single integer t (1≤t≤3000) — the number of test cases in the test. Then t test cases follow.
//	The first line of each test case contains a single integer n (1≤n≤3000) — the length of the array.
//	The next line contains n integers a1,a2,…,an (1≤ai≤105) — array a.
//	It is guaranteed that the sum of n over all test cases does not exceed 3000.

	private static void findmin(int n, int[] arr)
	{
		
		
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
			findmin(n,arr);
		}
	
	}



}
