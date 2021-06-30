package competitive_programming;

import java.util.Scanner;

public class Target_Sum_leetcode
{
	

	static int [][]dp;
	private static void init(int length, int target)
	{
		dp=new int[length][target];
		for(int i=0;i<dp.length;i++)
		{
			for(int j=0;j<dp[0].length;j++)
			{
				dp[i][j]=-1;
			}
		}
		
	}

	

	
	private static int sum(int[] arr, int target, int sum, int i)
	{
	
		
		if(i==arr.length)
		{	
			if(sum==target)
			{
//				System.out.println("Yes");
				return 1;
			}
			else
			{
				return 0;			
			}
		}
		if(dp[i][sum]!=-1)
		{
			return dp[i][sum];
		}

		
		int counts=0;
		if(sum<=target)
		{
		counts+=sum(arr, target,sum+arr[i],i+1);
		}
		counts+=sum(arr, target, sum,i+1);
		
		return dp[i][sum]=counts;
	}
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int []arr=new int[n];
			int sum=0;
			for(int j=0;j<arr.length;j++)
			{
				arr[j]=scan.nextInt();
				sum+=arr[j];
			}
			int target=scan.nextInt();
			int ntarget=((sum+target)/2);//this step changes the whole question
//			System.out.println("new target="+ntarget);
			init(arr.length,target);
			int count=sum(arr,ntarget,0,0);
			System.out.println(count);
		}
		

	}



}
