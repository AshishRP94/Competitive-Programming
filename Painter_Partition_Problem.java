package competitive_programming;

import java.util.Arrays;
import java.util.Scanner;

public class Painter_Partition_Problem 
{

//	The first argument given is the integer A.
//	The second argument given is the integer B.
//	The third argument given is the integer array C.
	
	private static void findmintime(int painter, int time, int[] boards) 
	{
		int low=1;
		int min=Integer.MAX_VALUE;
		int high=painter;
		int ptime=0;
		int count=0;
		while(low<=high)
		{
			int mid=(low+high)/2;
			int temp=Integer.MIN_VALUE;
			int ans=0;
			for(int i=0;i<boards.length;i++)
			{
				
				
				temp=(int)Math.max( (double)temp,(double)boards[i] );
				count+=1;
				if(count==mid)
				{
					ans+=(((temp*time))%10000003);
					count=0;
					temp=0;
					
				}
				
				
				
			}
			if(count>0)
			{
				ans+=(((temp*time))%10000003);
			}
			
			if(ans<min)
			{
				min=ans;
				low=(mid+1);
			}
			else
			{
				high=mid-1;
				
				
			}
		}
		
	System.out.println(""+min);
	
	}
//	10
//    1
//    4
//    1 8 11 3
	public static void main(String[] args) 
	{
		
		Scanner scan=new Scanner(System.in);
		int painter=scan.nextInt();
		int time=scan.nextInt();
		int size=scan.nextInt();
		int []boards=new int[size];
		for(int i=0;i<boards.length;i++)
		{
			boards[i]=scan.nextInt();
		}
		Arrays.sort(boards);
		findmintime(painter,time,boards);
		
		
	}



}
