package competitive_programming;

import java.util.Scanner;

public class Even_Sum {

//	First line will contain T, number of testcases. Then the testcases follow.
//	Each testcase contains 2 lines of input.
//	First line contains a single integer N, size of the array.
//	Second line contains N space separated integers - A1,A2,…,AN, denoting the array elements.
	
	private static void findwinner(int[] nums)
	{
		int sum=0;
		for(int i=0;i<nums.length;i++)
		{
			if((i&1)==1)
			{
				int temp=-(nums[i]);
				sum+=temp;
			}
			else
			{
				sum+=nums[i];
				
			}
			
		}
		if((sum&1)==1)
		{
			System.out.println("2");
		}
		else
		{
			System.out.println("1");
			
		}
			
	}
	
	public static void main(String[] args) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int []nums=new int[n];
			for(int j=0;j<n;j++)
			{
				nums[j]=scan.nextInt();
				
			}
			findwinner(nums);
		}
		

	}



}
