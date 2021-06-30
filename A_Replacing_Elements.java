package competitive_programming;

import java.util.Arrays;
import java.util.Scanner;

//The first line contains a single integer t (1≤t≤2000) — the number of test cases.
//The first line of each test case contains two integers n and d (3≤n≤100; 1≤d≤100) — the number of elements in the array a and the value d.
//The second line contains n integers a1,a2,…,an (1≤ai≤100) — the array a.

public class A_Replacing_Elements 
{
	
	private static void findans(int[] arr, int d)
	{
		boolean bool=true;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			int x=arr[i];
			if(count==0)
			{
				
			if(x>d)
			{
				bool=false;
			}
			if(x>d)
			{
				continue;
			}
			}
			for(int j=i;j<arr.length;j++)
			{
				int y=arr[j];
				if((x+y)<d)
				{
					System.out.println("YES");
					return;
				}
				
				if(count==0)
				{
					
				if(y>d)
				{
					bool=false;
				}
				}
			}
			count+=1;
		
		}
		if(bool==true)
		{
			System.out.println("YES");
			
		}
		else
		{
			System.out.println("NO");
			
		}

		
	}

	
	public static void main(String args[]) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int d=scan.nextInt();
			int []arr=new int[n];
			for(int j=0;j<n;j++)
			{
				arr[j]=scan.nextInt();
			}
			
			findans(arr,d);
			
		}
		
	}


}
