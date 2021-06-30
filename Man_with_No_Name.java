package competitive_programming;

import java.util.Scanner;

public class Man_with_No_Name {

//	The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows.
//	The first line of each test case contains a single integer N.
//	The second line contains N space-separated integers A1,A2,...,
//	AN denoting the number of criminals in each area respectively. An area with unknown number of criminals is denoted by −1.
	private static void findunknown(long[] criminals) 
	{
		long []prefixsum =new long[criminals.length];
		int sum=0;
		int areav=0;

		for(int i=0;i<criminals.length;i++)
		{
			if(criminals[i]==-1)
			{
				long unknown=(prefixsum[i-1]/areav);
				sum+=unknown;
				prefixsum[i]=sum;
				criminals[i]=unknown;
				areav+=1;
			}
			else
			{
				sum+=criminals[i];
				prefixsum[i]=sum;
				areav+=1;
				
			}
			System.out.print(criminals[i]+" ");
			
		}
		
	
		
		
	}

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
		int areas=scan.nextInt();
		long []criminals=new long[areas];
		for(int j=0;j<criminals.length;j++)
		{
			criminals[j]=scan.nextLong();
		}
		findunknown(criminals);
		}

	}


}
