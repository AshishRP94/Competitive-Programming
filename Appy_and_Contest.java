package competitive_programming;

import java.util.Scanner;

public class Appy_and_Contest {

	/** The first line of the input contains a single integer T denoting the number
	 * of test cases. The description of T test cases follows. The first and only
	 * line of each test case contains four space-separated integers N, A, B and K.
	 */
	
	private static void predict(int nproblems, int appydt, int chefdt, int pmarks)
	{
		int m=appydt*chefdt;	
		int psolved=0;
		for(int i=1;i<=nproblems;i++)
		{
			if(i%m==0)
			{

				continue;
			}
			
			
			if(i%appydt==0)
			{
				psolved+=1;
			}
			
			else if((i%chefdt)==0)
			{
				psolved+=1;
			}
			else
			{
				
			}
			
		}
		
		if(psolved>=pmarks)
		{
			System.out.println("Win");
		}
		else
		{
			System.out.println("Lose");
		}
		
		
		
		
	}
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int nproblems=scan.nextInt();
			int appydt=scan.nextInt();
			int chefdt=scan.nextInt();
			int pmarks=scan.nextInt();
			predict(nproblems,appydt,chefdt,pmarks);
			
		}
		
	}



}
