package competitive_programming;

import java.util.Scanner;

public class A_You_Are_Given_Two_Binary_Strings {

//	The first line contains a single integer T (1≤T≤100) — the number of queries.
//
//	Next 2T lines contain a description of queries: two lines per query. 
//	The first line contains one binary string x, consisting of no more than 105 characters. Each character is either 0 or 1.
//
//	The second line contains one binary string y, consisting of no more than 105 characters. Each character is either 0 or 1.
//
//	It's guaranteed, that 1≤f(y)≤f(x) (where f(x) is the integer represented by x, and f(y) is the integer represented by y),
//	both representations don't have any leading zeroes,
//	the total length of x over all queries doesn't exceed 105, and the total length of y over all queries doesn't exceed 105.

	private static void find_k(String x, String y)
	{
		
		
	}
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		scan.nextLine();
		for(int i=0;i<t;i++)
		{
			String x=scan.nextLine();
			String y=scan.nextLine();
			find_k(x,y);
			
		}
		
		
	}



}
