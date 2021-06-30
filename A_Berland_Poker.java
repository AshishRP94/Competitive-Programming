package competitive_programming;

import java.util.Scanner;

public class A_Berland_Poker {

//	The first line of the input contains one integer t (1≤t≤500) — the number of test cases.
//	Then the test cases follow. Each test case contains three integers n, m and k (2≤n≤50, 0≤m≤n, 2≤k≤n, k is a divisors of n).
	
	private static int maxpoints(int totalcards, int jokers, int players)
	{
		if(jokers==0)
		{
			return 0;
		}
		
		int points=0;
		
		int distribution=totalcards/players;
		
		
		
		return players;
		
		
		
	}
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int totalcards=scan.nextInt();
			int jokers=scan.nextInt();
			int players=scan.nextInt();
			maxpoints(totalcards,jokers,players);
		}
		
		
		
		
	}



}
