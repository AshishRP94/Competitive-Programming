package competitive_programming;

import java.util.PriorityQueue;
import java.util.Scanner;

public class B_Different_Divisors
{

//	The first line contains a single integer t (1≤t≤3000) — the number of test cases.
//	The first line of each test case contains a single integer d (1≤d≤10000).
	

	
	
	
	private static void differentdivisors(int d)
	{
		int temp=d+1;
		
		
		
		for(int i=temp; ;i+=temp)
		{
	        
			PriorityQueue<Integer> pq = new PriorityQueue<Integer>(); 
			pq.add(1);
			int count=0;
			int ind=0;
			for(int j=2;j<i;j++)
			{
				if(count==2)
				{
					pq.add(temp);
					break;
				}
				
				if(i%j==0)
				{
					count+=1;
					pq.add(j);
					ind+=1;
				}
				
			}
		
			if(pq.size()>=4)
			{
				
			int a=pq.poll();
			int b=pq.poll();
			if(b-a==d)
			{
				System.out.println(""+i);
				break;
			}
			}
		
				
				
			}
		
		
		
	}

	
	public static void main(String[] args)
	{
//		constructsieve();
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int d=scan.nextInt();
			differentdivisors(d);
		}
		

	}


	

}
