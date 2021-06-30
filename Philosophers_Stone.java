package competitive_programming;

import java.util.Scanner;

public class Philosophers_Stone 
{
	private static String find(int[] step, int i) 
	{
		String ans="no";
		for(int j=0;j<step.length;j++)
		{
			if(i!=j)
			{
				
			
			if(step[i]==step[j])
			{
				return "yes";
			}
			}
		if(i+1<step.length)
		{
			
			ans= find(step,i+1);
		}
		
		}
		
	return ans;
	}
	
	
	public static void main(String args[]) throws java.lang.Exception
	{
	
	Scanner scan=new Scanner(System.in);
	int t=scan.nextInt();
	for(int x=0;x<t;x++)
	{
		
	int n=scan.nextInt();
	int [] step=new int[n];
	
	for(int i=0;i<n;i++)
	{
		step[i]=scan.nextInt();
	}
	
	int i=0;
	System.out.print(find(step,i+1));
	
	}
	
	
	
	
	}

	
}
