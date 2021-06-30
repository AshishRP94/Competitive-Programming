package competitive_programming;

import java.util.Scanner;

public class Coin_Change_leetcode
{
	
	static int []dp;
	private static void init(int n)
	{
		dp=new int[n];
		for(int i=0;i<dp.length;i++)
		{
			dp[i]=-1;
		}
		
	}
	
		 
	
		
	
	private static int mincoins(int[] coins, int amount, int temp)
	{
		if(amount<0)
		{
			return -1;
		}
		
		
		if(amount==0)
		{
			return temp;
		}
		
		if(dp[amount]!=-1)
		{
			return dp[amount];
		}
		
		
		int min=Integer.MAX_VALUE;
		for(int i=0;i<coins.length;i++)
		{
			if(amount-coins[i]>=0)
			{
			int count=mincoins(coins, amount-coins[i],temp+1);
			if( count>0 && min<count)
			{
				min=count;
			}
			}
			
		}
		if(min==Integer.MAX_VALUE)
		{
			return dp[amount]=-1;
		}
		else
		{
			return dp[amount]=min;
		}
		
	}
	
	
	


	
	

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int []coins=new int[n];
			for(int j=0;j<coins.length;j++)
			{
				coins[j]=scan.nextInt();
			}
			int amount=scan.nextInt();
			init((amount+1));
			System.out.println(mincoins(coins,amount,0));
		
		}

	}




}
