
package competitive_programming;

import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class B_Singhal_and_GCD {

//	The first line contains a single integer t(1≤t≤105) — the number of test cases in the input. Then t test cases follow.
	
//	Each query contains two lines. The first line contains one integer n(2≤n≤105): the number of integers in the sequence,
//	and the second line contains n integers a1,…,an(1≤ai≤109).

//	It is guaranteed that the total sum of n is at most 105.
	
	private static long gcd(long a,long b)
	{
		if (b == 0)
		{
			return a;
		}
		return gcd(b, a % b);
	
	}
	
//	static class pair implements Comparable<pair>
//	{
//		long value;
//		int ind;
//		public pair(long value,int ind)
//		{
//			this.value=value;
//			this.ind=ind;
//		}
//		
//		 public int compareTo(pair o)
//		 {
//			    return Long.valueOf(this.value).compareTo(Long.valueOf(o.value));
//
//		 }
//		
//	}
	
	private static void find_max_ans(long[] arr)
	{
       
		long max=Long.MIN_VALUE;
		int len=0;
        for(int i=0;i<arr.length-1;i++)
		{
			long temp=gcd(arr[i],arr[i+1]);
			if(max<=temp)
			{
				
				max=temp;
				len=i+1;
			}
		}
        System.out.println(""+max+" "+(len+1));
	
	}
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			long []arr=new long[n];
			for(int j=0;j<arr.length;j++)
			{
				arr[j]=scan.nextLong();
			}
			find_max_ans(arr);
		
		}
		

	}



}
