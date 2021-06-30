package competitive_programming;

import java.util.Scanner;

public class A_Three_swimmers {

//	The first line of the input contains a single integer t (1≤t≤1000) — the number of test cases. Next t lines contains test case descriptions, one per line.
//	Each line contains four integers p, a, b and c (1≤p,a,b,c≤1018), time in minutes after the start, when you came to the pool and times in minutes it take the swimmers to cross the entire pool and come back.
	
	private static void meet(long first, long second, long third, long arrival)
	{
	long i=arrival/first;
	if(arrival%first==0)
	{
		
	}
	else
	{
		i+=1;
	}
	long j=arrival/second;
	if(arrival%first==0)
	{
		
	}
	else
	{
		j+=1;
	}
	long k=arrival/third;
	if(arrival%first==0)
	{
		
	}
	else
	{
		k+=1;
	}
	
	long ans1=((i*first)-arrival);
	long ans2=((j*second)-arrival);
	long ans3=((k*third)-arrival);
	
	Math.min(ans1, Math.min(ans1,ans2 ));
	long ans=Math.min(ans1, Math.min(ans2, ans3));
		

		System.out.println(" "+ans);
		
	}

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			long arrival=scan.nextLong();
		    long first=scan.nextLong();
			long second=scan.nextLong();
			long third=scan.nextLong();
			meet(first,second,third,arrival);
			
		}
		
	}


}
