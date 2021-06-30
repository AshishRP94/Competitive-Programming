package competitive_programming;

import java.util.Scanner;

public class D_Renting_Bikes {

//	The first line of the input contains three integers n, m and a (1 ≤ n, m ≤ 105; 0 ≤ a ≤ 109). 
//	The second line contains the sequence of integers b1, b2, ..., bn (1 ≤ bi ≤ 104), where bi is the amount of the i-th boy's personal money. 
//	The third line contains the sequence of integers p1, p2, ..., pm (1 ≤ pj ≤ 109), where pj is the price for renting the j-th bike.
	private static void helpschoolboys(int[] pmoney, int[] bikes, int sharedbudget)
	{
//		111 111 111
//		11  11  11 3*3  9+4+4+2
//		111 111 2*2
//      11  11
//      111 1 2*2
//      11  +2
	}

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		int sharedbudget=scan.nextInt();
		int []pmoney=new int[n];
		for(int i=0;i<pmoney.length;i++)
		{
			pmoney[i]=scan.nextInt();
		}
		
		int []bikes=new int[m];
		for(int i=0;i<bikes.length;i++)
		{
			bikes[i]=scan.nextInt();
		}
		helpschoolboys(pmoney,bikes,sharedbudget);
	}

}


