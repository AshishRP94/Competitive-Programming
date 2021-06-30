package competitive_programming;

import java.util.Scanner;

public class B_Big_Vova {

//	Each test contains multiple test cases. The first line contains the number of test cases t (1≤t≤103). Description of the test cases follows.
//	The first line of each test case contains a single integer n (1≤n≤103)  — the length of the sequence a.
//	The second line of each test case contains n integers a1,…,an (1≤ai≤103)  — the sequence a.
//	It is guaranteed that the sum of n over all test cases does not exceed 103.
	
	static int gcd(int a, int b)
	{
		if (a == 0)
		{
			return b;
		}
		return gcd(b%a, a);
	 }
	
	
	private static void helpalex(int n, int[] arr)
	{
		int []ans=new int[arr.length];
		int max=Integer.MIN_VALUE;
		int t=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				t=i;
			}
		}
		
		int c=arr[0];
		arr[0]=max;
		arr[t]=c;
				
		ans[0]=arr[0];
		int ind=0;
		int storegcd=arr[0];
		int maxgcd=Integer.MIN_VALUE;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]!=-1)
			{
				
			
			for(int j=i;j<arr.length;j++)
			{
				if(arr[j]!=-1)
				{
					int temp=gcd(storegcd,arr[j]);
					
					if(temp>maxgcd)
					{
						max=maxgcd;
					}
					
				}
				
				
			}
			}
			storegcd=max;
			ans[ind]=ans[c];
			ind+=1;
			arr[c]=-1;
		}
	}

//	7
//	2
//	2 5
//	4
//	1 8 2 3
//	3
//	3 8 9
//	5
//	64 25 75 100 50
//	1
//	42
//	6
//	96 128 88 80 52 7
//	5
//	2 4 8 16 17
	
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
				arr[i]=scan.nextInt();
			}
			helpalex(n,arr);
		}
		

	}



}
