package competitive_programming;

import java.util.Scanner;

public class B_Cat_Cycle {
	
	private static void find_cat_b(int napping, int hours)
	{
//		int []places=new int[napping];
		
		int cata=napping-1;
		int catb=0;
		
		for(int i=0;i<hours-1;i++)
		{
			

			
			if((cata-1>=0 ))
			{
				cata=cata-1;
			}
			else
			{
				cata=napping-1;
			}
			
			if(catb<=napping-1)
			{
				catb=catb+1;
				
			}
			else
			{
				catb=0;
			}
			
			
			if(cata==catb)
			{
				catb+=1;
			}
			else
			{
				
				
			}
			
			
		}
		System.out.println(""+(catb+1));
		
		
		
	}
	

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int napping=scan.nextInt();
			int hours=scan.nextInt();
			find_cat_b(napping ,hours);
		
		}

	}



}
