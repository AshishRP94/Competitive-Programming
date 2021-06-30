package competitive_programming;

import java.util.HashMap;
import java.util.Scanner;

public class B_Suffix_Operations 
{

//	Each test contains one or more test cases. The first line contains the number of test cases t (1≤t≤1000).
//	Each test case contains two lines. The first line of each test case consists of an integer n (2≤n≤2⋅105) — the number of elements of the array a.
//	The second line of each test case contains n integers. The i-th integer is ai (−5⋅108≤ai≤5⋅108).
//	It is guaranteed that the sum of n in all test cases does not exceed 2⋅105.
	
	private static void suffix(int n, int[] arr)
	{
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int count=Integer.MIN_VALUE;
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			
			if(hm.containsKey(arr[i]))
			{
				int x=hm.get(arr[i]);
				hm.put(arr[i], x+1);
			}
			else
			{
				hm.put(arr[i],0);
			}
			
			
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(hm.get(i)>=count)
			{
				if(hm.get(i)==count)
				{
					
				}
				else
				{
					count=hm.get(i);
					
				}
				
			}
			
		
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
			for(int j=0;j<arr.length;j++)
			{
				arr[i]=scan.nextInt();
			}
			suffix(n,arr);
		
		}
		

	}



}
