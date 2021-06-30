package competitive_programming;

import java.util.Scanner;

public class Power_of_2 {

//	5
//	1
//	2
//	3
//	4
//	5
	
//	x=4
//	right shit operator x>>1
//	op=2
	
//	x=4
//	right shit operator x<<1
//	op=8
	
	private static void findpowerof2(long[] arr)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]&1)==0)
			{
				boolean flag=false;
				while(true)
				{
					if(arr[i]==0)
					{
						flag=true;
						break;
					}
//					System.out.println("arr[i]="+arr[i]);
					
					arr[i]>>=1;
					
				}
				if(flag==true)
				{
					count+=1;
				}
				
			}
			
		
		}
		System.out.println(""+count);
		
	}
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		long []arr=new long[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextLong();
		}
		findpowerof2(arr);
	}



}
