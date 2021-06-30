package competitive_programming;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class C_Everyone_is_a_Winner {
	
	
	private static int bs(int low, int high, int temp)
	{
		int mid=0;
		
		while(low<=high)
		{
			mid=((low+high)>>1);
			
			if(mid==temp)
			{
				low=mid+1;
				
			}
			else
			{
				high=mid-1;
			
			}
		
			
		}
		
		return mid;
	}
	
	private static void find_ratings(int n)
	{
		HashSet<Integer> hs=new HashSet<Integer>(); 
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        
		for(int i=1;i<=n+1;i++)
		{
			int temp=n/i;
			if(hs.contains(temp)==true)
			{
				i=bs(i,n+1,temp);
				
			}
			else
			{
//				System.out.print(""+i+" "+temp+"| ");
				hs.add(temp);
				pq.add(temp);
			}
			
		}
		
		System.out.println(pq.size());
		int len=pq.size();
		for(int i=0;i<len;i++)
		{
			System.out.print(" "+pq.poll());
		}
		System.out.println();
		
		
		
	}
	




//	Input
//	The first line contains integer number t (1≤t≤10) — the number of test cases in the input. Then t test cases follow.
//
//	Each line contains an integer n (1≤n≤109) — the total number of the rating units being drawn.
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			find_ratings(n);
			
		}

	}



}
