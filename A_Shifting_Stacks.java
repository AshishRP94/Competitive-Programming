package competitive_programming;

import java.util.Scanner;

public class A_Shifting_Stacks {
	
	
	

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			boolean flag0=false;
			boolean flag1=false;
			boolean ok=false;
			boolean temp=false;
			int []heights=new int[n];
			for(int j=0;j<heights.length;j++)
			{
				heights[j]=scan.nextInt();
				if(temp==true)
				{
					
				if(heights[1]==1)
				{
					ok=true;
				}
				}
				
				
				if(heights[0]==0)
				{
					temp=true;
					
				
				}
				
				if(j>1)
				{
					if(heights[j]==0)
				
					{
						flag0=true;
					}
					
					if(heights[j]==1)
					{
						flag1=true;
					}
			
				}
				
				
			}
			
			if(ok==true)
			{
				if(flag0==false && flag1==false)
				{
					System.out.println("YES");
					
				}
				
			}
			
			else if(flag0==false && flag1==false)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
				
			}
			
			
			
		}

	}



}
