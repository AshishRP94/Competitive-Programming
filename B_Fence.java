package competitive_programming;

import java.util.Scanner;

public class B_Fence
{
	
//	The first line of the input contains integers n and k (1 ≤ n ≤ 1.5·105, 1 ≤ k ≤ n) — the number of planks in the fence and the width of the hole for the piano. 
//	The second line contains the sequence of integers h1, h2, ..., hn (1 ≤ hi ≤ 100), where hi is the height of the i-th plank of the fence.
	
	private static void fence(int k, int[] planks)
	{
		if(k==1)
		{
			System.out.println("hi");
			int min=Integer.MIN_VALUE;
			for(int i=0;i<planks.length;i++)
			{
				if(min>planks[i])
				{
					min=planks[i];
				}
			}
			return;
			
		}
		int sum=0;
		int ind=0;
		int temp=0;
		for(int i=0;i<k;i++)
		{
			temp+=planks[i];
		}
		sum=temp;
//		System.out.println("sum="+sum);
		int i=1;
//		System.out.println("i="+i);
		int j=k+1;
//		System.out.println("j="+j);
		while(true)
		{
//			System.out.println("in w i="+i);
//			System.out.println("in w j="+j);
			if(j+1==planks.length)
			{
				break;
			}
			temp-=planks[i];
			temp+=planks[j];
//			System.out.println("temp="+temp);
			i+=1;
			j+=1;
			if(temp<sum)
			{
				sum=temp;
//				System.out.println("sum="+sum);
				ind=i;
//				System.out.println("sum="+sum);
			}
			
		}
		System.out.println(ind+1);
		
	
	}
	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int k=scan.nextInt();
		int []planks=new int[n];
		for(int i=0;i<n;i++)
		{
			planks[i]=scan.nextInt();
		}
		fence(k,planks);
		
		
	}



}
