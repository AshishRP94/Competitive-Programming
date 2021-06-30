package competitive_programming;

import java.util.Scanner;

public class codeforces2 {

//	The first line of the input contains a single integer t (1≤t≤10000) — the number of test cases. The description of the test cases follows.
//	The first line of each test case contains a single integer n (1≤n≤3⋅105).
//	The second line of each test case contains n space-separated integers a1, a2, ..., an (1≤ai≤109).
//	It is guaranteed that the sum of n over all test cases does not exceed 3⋅105.
	
	private static void hillandvalleys(int n, int[] arr)
	{
		int count=0;
		for(int i=1;i<arr.length;i+=2)
		{
			if((arr[i]>arr[i+1] && arr[i]>arr[i-1]))
			{
				count+=1;
			}
			else
			{
				
			}
			
		}
		
		
	
	
	}

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int []arr=new int[n];
			for(int j=0;j<arr.length;j++)
			{
				arr[j]=scan.nextInt();
			}
		
			hillandvalleys(n,arr);
		}
		

	}


}
