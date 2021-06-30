package competitive_programming;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class A_Twins 
{

//	The first line contains integer n (1 ≤ n ≤ 100) — the number of coins.
//	The second line contains a sequence of n integers a1, a2, ..., an (1 ≤ ai ≤ 100) — the coins' values. All numbers are separated with spaces.
	
	private static void twins(PriorityQueue<Integer> coins)
	{
		int sum=0;
		int ind=0;
		for(int temp:coins )
		{
			sum+=temp;
			
		}
		int temp=0;
//		System.out.println("sum="+sum);
		int countcoins=0;
//		System.out.println("coin size"+coins.size());
		int len=coins.size();
		for(int i=0;i<len;i++)
		{
			temp+=coins.poll();
			countcoins+=1;
			if(temp>(sum/2))
			{
				break;
			}
		}
		System.out.println(""+countcoins);
		
	}
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in); 
		int n=scan.nextInt();
        PriorityQueue<Integer> coins = new PriorityQueue<Integer>(Collections.reverseOrder()); 
		for(int i=0;i<n;i++)
		{
			int temp=scan.nextInt();
			coins.add(temp);
		}
		twins(coins);
		

	}



}
