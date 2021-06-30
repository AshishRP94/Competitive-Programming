package competitive_programming;

import java.util.Scanner;

public class Maximum_AND 
{
	public static int bit_traversal(int num)
	{
		int ones=0;
		int rsb=0;
		while(true)
		{
			if(num==0)
			{
				break;
			}
		    rsb=(num&(-num));
		    num-=rsb;
		    ones+=1;
		}
		
		return ones;
	}
	
	
	private static void find_max_sum(int[] arr, long k, int max)
	{
		for(int x=1;x<=max;x++)
		{
			
		}
		
		for(int i=0;i<arr.length;i++)
		{
			
		}
	
	}

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		int n=scan.nextInt();
		long k=scan.nextLong();
		int []arr=new int[n];
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		find_max_sum(arr,k,max);
	}



}
