package competitive_programming;

import java.util.Scanner;

public class Coin_Change_Problem 
{
	static int count=0;
static int []dpm;
	Coin_Change_Problem(int length)
	{
		dpm=new int[length+1];
		
	for(int i=0;i<length+1;i++)
	{
		dpm[i]=-1;
	}
	
	}
	private static int dp(int[] coins, int target, int sum) 
	{
		if(sum==target)
		{
			count+=1;
			return 0;
		}
		
		
		
		for(int i=0;i<coins.length;i++)
		{
		
			if(sum<target)
			{
			
			dp(coins,target,sum+coins[i]);
			}
			else
			{
				break;
			}
			
		}
		return count;
	}

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		int coinsno=scan.nextInt();
		int []coins=new int[coinsno];
		for(int i=0;i<coinsno;i++)
		{
			coins[i]=scan.nextInt();
		}
		int target=scan.nextInt();
		 Coin_Change_Problem obj=new Coin_Change_Problem(coins.length);  
		System.out.println(obj.dp(coins,target,0));
	
		
	
	
	
	
	
	
	
	
	}



}
