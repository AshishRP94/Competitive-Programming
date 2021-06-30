package competitive_programming;

import java.util.Scanner;

public class Best_Time_to_Buy_and_Sell_Stock {

//	Input: prices = [7,1,5,3,6,4]
//			Output: 5
//			Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//			Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
	
	private static void maximizeprofit(int[] stock)
	{
		//O(n2)
		int low=0;
		int high=stock.length-1;
		while(true)
		{
			
			
		}
		
		
	}

	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int []stock=new int[n];
			for(int j=0;j<n;j++)
			{
				stock[j]=scan.nextInt();
			}
			maximizeprofit(stock);
		}
	}


}
