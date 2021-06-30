package competitive_programming;

import java.util.Scanner;

public class Moony_and_ICPC_team {

//	First line will contain T, number of testcases.
//	First line of each test case contains a single integer N.
//	Second line of each test case takes N integers, denoting rating of ith coder.
	
	
	
	private static void find_team(long[] ratings, long[] prefixsum)
	{
		
		
		long max=Integer.MIN_VALUE;
		long temp=0;
		for(int i=0;i<prefixsum.length;i++)
		{
//			System.out.println("i="+i);
			if(i+2>=prefixsum.length)
			{
//				System.out.println("in i+2");
				if(i==prefixsum.length-2)
				{
					temp=(prefixsum[i]-prefixsum[i+1])+ratings[0];
//					System.out.println("temp"+temp);
					if(temp>max)
					{
						max=temp;
					}
					
				}
				
				else if(i==prefixsum.length-1)
				{
					temp=ratings[ratings.length-1]+ratings[0]+ratings[1];
					if(temp>max)
					{
						max=temp;
					}

					
				}
				continue;
				
				
				
			}
			
			if(i==0)
			{
//				System.out.println("in ");
				if(max<prefixsum[2])
				{
					max=prefixsum[2];
				}
				
			}
			else
			{
//				System.out.println("in else ");
				temp=prefixsum[i+2]-prefixsum[i-1];
				if(temp>max)
				{
					max=temp;
				}
				
			}
			
			
		}
		
		
		
		
//		System.out.println(""+max);
		
	}

	
	
	public static void main(String[] args) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			long []ratings=new long[n];
			long []prefixsum=new long[ratings.length];
			long sum=0;
			for(int j=0;j<ratings.length;j++)
			{
				ratings[j]=scan.nextLong();
				sum+=ratings[j];
				prefixsum[j]=sum;
			}
			
			find_team(ratings,prefixsum);			
		}
	}






}
