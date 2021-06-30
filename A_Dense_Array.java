package competitive_programming;

import java.util.Scanner;

public class A_Dense_Array {

	
//	The first line contains one integer t (1≤t≤1000). Then t test cases follow.
//	The first line of each test case contains one integer n (2≤n≤50) — the length of the array a.
//	The next line contains n integers a1,a2,…,an (1≤ai≤50)
	
	
	private static int cond(int l, int s)
	{
		return ((2*s)-1);
		
	
	}
	

	private static int cond1(int l, int s)
	{
		int ans=0;
		for(int i=1;i<l;i++)
		{
			if((2*i)>=l)
			{
				ans=i;
				break;
			}
			
			
		}
		
		return ans;
	}

	

	
	
	private static void make_arr_dense(int[] arr)
	{
		int count=0;
		int temp=0;
		int s=0;
		int l=0;
		
		for(int i=0;i<arr.length-1;i++)
		{
			boolean flag=false;
			int x=arr[i];
			int y=arr[i+1];
			if(x>y)
			{
				l=x;
				s=y;
			}
			else
			{
				flag=true;
				l=y;
				s=x;
			}
			
			if((2*s)>=l)
			{
				
				
			}
			else
			{
				if(flag==true)
				{
					
				while(true)
				{
					if(2*s>=l)
					{
						break;
					}
					int t=cond(l,s);
					
					s=t;
					System.out.println("s"+s);
					count+=1;
				}
				}
				else
				{
					while(true)
					{
						if(2*s>=l)
						{
							break;
						}
						int t=cond1(l,s);
						l=t;
						System.out.println("l"+l);
						count+=1;
					}
					
					
					
					
				}
				
			}
			
			
		}
		System.out.println(""+count);
		
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
				arr[j]=scan.nextInt();
			}
			make_arr_dense(arr);
		}
		
		
		
	}


}
