package competitive_programming;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class longchallenge
{

	public int findmincount(int n, Integer[] dishes) 
	{
		int diff=0,count=0;
		int j=0;
		for(int i=1;i<n;i++)
		{
			if(j<n)
			{
//				System.out.println("hi");
				
				
				if(dishes[j]==0)
				{
					diff=dishes[i];
				}
				else if(dishes[i]>dishes[j])
				{
					diff=dishes[i]-dishes[j];
				}
				else
				{
					
					diff=dishes[j]-dishes[i];
				}
				
	
			
//				System.out.println("in diff= "+diff+" i= "+i+" j= "+j);
				if(dishes[j]==0)
				{
					count=count+dishes[j];

				}
				else if(dishes[j]<dishes[i])
				{
					count=count+dishes[j];
				}
				else
				{
					
					count=count+dishes[i];
				}
			
				
//				System.out.println("in count="+count);
//				System.out.println("in i= "+dishes[i]+" j= "+dishes[j]);

				
			
			
			j=j+1;
			dishes[j]=diff;
			
		
			}
		}
		if(dishes[n-1]==0)
		{
			
			return count;
		}
		else
		{
			return count+dishes[n-1];
		}
	}
	
	
}

public class adaandchef 
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			
		int n=scan.nextInt();
		Integer[] dishes = new Integer[n];
		for(int j=0;j<n;j++)
		{
			dishes[j]=scan.nextInt();
			
		}
		longchallenge g=new longchallenge();
		Arrays.sort(dishes,Collections.reverseOrder());
		int ans=g.findmincount(n,dishes);
		System.out.println(ans);
		
		}
		
//		1
//		4
//		2 3 4 5
//		
		
//		3
//		3
//		2 2 2
//		3
//		1 2 3
//		4
//		2 3 4 5
//		
	}

}
