package competitive_programming;

import java.util.Scanner;

public class ANDOR {

//	The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
//	The first and only line of each test case contains a single integer x.


	private static void satisfy_equ(long x)
	{
		long rsb=(x&(-x));
//	    x=x&rsb;
		x=x|rsb;
		System.out.println(""+x);
		System.out.println(""+1);
	}
	
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			long x=scan.nextLong();
			satisfy_equ(x);
		}
	}



}
