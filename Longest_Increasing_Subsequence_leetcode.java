package competitive_programming;

import java.util.Scanner;
public class Longest_Increasing_Subsequence_leetcode
{
	static int [][]dp;
	
	private static void init(int l1, int l2)
	{
		dp=new int[(l1+20)][(l2+20)];
		for(int i=0;i<dp.length;i++)
		{
			for(int j=0;j<dp[0].length;j++)
			{
				dp[i][j]=-1;
			}
		}
		
	}
	
	
	
	private static int lis(int[] arr, int prev, int curr)
	{
		if(curr>=arr.length)
		{
			return 0;
		}
		
		if(prev!=-1 && dp[curr][prev]!=-1)
		{
			return dp[curr][prev];
		}
		
		int ans1=0,ans2=0;
		if(prev==-1||arr[prev]<arr[curr])
		{
			ans1+=1+lis(arr, curr, curr+1);			
		}		
		ans2+=lis(arr, prev, curr+1);
		
		if(prev!=-1)
		{
			dp[curr][prev]=Math.max(ans1, ans2); 
		}
		
		return Math.max(ans1, ans2);
		
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

			int len =lis(arr,-1,0);
			init(arr.length,arr.length);
			System.out.println(""+(len+1));
		}

	}




}
