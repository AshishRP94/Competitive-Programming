package competitive_programming;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class C_Powers_Of_Two {
	
	private static void solve(long n, int k)
	{
		
		long temp=n;
		long count=0;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int i=0; ;i++)
		{
			if(temp==0)
			{
				break;
			}
			
			if((temp&1)==1)
			{
				pq.add((1<<i));
				k=k-1;
			}
			temp>>=1;
		}
		
		
		if(k<0)
		{
			System.out.println("NO");
			return;
		}
		else
		{
			while(true)
			{
				if(k==0)
				{
					break;
				}
				int x=pq.poll();
				x>>=1;
		        if(x>=1)
		        {
		        	pq.add(x);
		        	pq.add(x);
		        	k-=1;
		        }
		        else
		        {
		        	break;
		        }
				
			}
		}
		
		if(k<0)
		{
			System.out.println("NO");
			return;
		}
		else
		{
			System.out.println("YES");
			while(true)
			{
				if(pq.size()==0)
				{
					break;
				}
				int tempx=pq.poll();
				System.out.println(" "+tempx);
				
		   }
		}

		
		
		
	
	}
	

//	The only line of the input contains two integers n and k (1≤n≤109, 1≤k≤2⋅105)
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		long n=scan.nextLong();
		int k=scan.nextInt();
		solve(n,k);

	}



}
