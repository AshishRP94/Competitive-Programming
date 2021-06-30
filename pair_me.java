package competitive_programming;

import java.util.Scanner;

public class pair_me {

//	First line will contain the number 5, which is the number of testcases. Then the testcases follow.
//	Each testcase contains a single line of input, with three space-separated positive integers x, y, and z.
	
	private static void pair(int a, int b, int c)
	{
		if((b+c)==a)
		{
			System.out.println("YES");
		}
		else if((a+c)==b)
		{
			System.out.println("YES");
		}
		else if((a+b)==c)
		{
			System.out.println("YES");
			
		}
		else
		{
			System.out.println("NO");
			
		}
	}
	
	public static void main(String[] args) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			int a=scan.nextInt();
			int b=scan.nextInt();
			int c=scan.nextInt();
			pair(a,b,c);
			
		}

	}



}
