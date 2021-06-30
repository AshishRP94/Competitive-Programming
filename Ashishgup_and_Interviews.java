package competitive_programming;

import java.util.Scanner;

public class Ashishgup_and_Interviews
{
	
	
//	The verdict can be one of the following:
//
//		Rejected: If the number of problems that the candidate solved is strictly less than ceil(N/2).
//		Too Slow: If candidate is not Rejected and candidate took more than K seconds to solve at least one problem among the problems solved by the candidate.
//		Bot: If candidate is neither Rejected nor Too Slow, but has solved all of the N problems in at most one second each.
//		Accepted: If the candidate is neither Rejected, Too Slow, nor Bot, she is Accepted.

	
//		Input
//		The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
//		The first line of each test case contains two space separated integers - N and K respectively.
//		The second line of each test case contains N space separated integers - A1,A2,…,AN.

	private static void sendresponse(int time, int[] pstime, int count, boolean tooslow, boolean bot)
	{
		
		double temp=(double)((double)pstime.length/(double)2);
		if(count<Math.ceil(temp))
		{
			System.out.println("Rejected");
		}
		else if(tooslow==true)
		{
			System.out.println("Too Slow");
		}
		else if(bot==true)
		{
			System.out.println("Bot");
			
		}
		else
		{
			System.out.println("Accepted");
			
		}
		
	}
	
	public static void main(String[] args) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int time=scan.nextInt();
			int []ptime=new int[n];
			int count=0;
			boolean tooslow=false;
			boolean bot=false;
			int cbot=0;
			for(int j=0;j<ptime.length;j++)
			{
				ptime[j]=scan.nextInt();
				 if(ptime[j]!=-1)
				 {
					 count+=1;
				 }
				 
				 if(ptime[j]>time)
				 {
					 tooslow=true;
				 }
				 
				 if(ptime[j]>=0 && ptime[j]<=1)
				 {
					 cbot+=1;
				 }
			}
			if(cbot==ptime.length)
			{
				bot=true;
			}
			sendresponse(time,ptime,count,tooslow,bot);
		}
	}



}
