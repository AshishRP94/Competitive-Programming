package competitive_programming;

import java.util.Scanner;

public class Partition_Equal_Subset_Sum
{
	static int []dp;
	private static void init(int half)
	{
		dp=new int[half];
		for(int i=0;i<dp.length;i++)
		{
			dp[i]=-1;
		}
	}
	
	
	private static boolean subset(int[] arr, int sum, int i)
	{
		if(i>=arr.length)
		{
			return false;
		}
		
		if(sum==0)
		{
			return true;
		}
		
		if(dp[sum]!=-1)
		{
			if(dp[sum]==1)
			{
				dp[sum]=1;
				return true;
			}
			else
			{
				dp[sum]=0;
				return false;
			}
		}
		
		if(sum-arr[i]>=0)
		{
			boolean flag=subset(arr, sum-arr[i], i+1);
			if(flag==true)
			{
				dp[sum]=1;
				return true;
			}
		}
		boolean bool=subset(arr, sum,(i+1));
		if(bool==true)
		{
			dp[sum]=1;
			return true;
		}
		else
		{
			dp[sum]=0;
			return false;
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
			int sum=0;
			for(int j=0;j<arr.length;j++)
			{
				arr[j]=scan.nextInt();
				sum+=arr[j];
			}
			
			if((sum&1)==1)
			{
				System.out.println("False");
			}
			else
			{
				int half=(sum>>1);
//				System.out.println("half="+half);
				init(half);
				boolean flag=subset(arr,half,0);
				if(flag==true)
				{
					System.out.println("True");
					
				}
				else
				{
					System.out.println("False");
				}
				
			}
	
			
		}
	}






}
