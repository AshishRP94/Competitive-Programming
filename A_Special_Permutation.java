package competitive_programming;

import java.util.Scanner;

public class A_Special_Permutation {

//	The first line of the input contains one integer t (1≤t≤100) — the number of test cases. Then t test cases follow.
//	The only line of the test case contains one integer n (2≤n≤100) — the length of the permutation you have to find.
	private static void permutate(int n)
	{
		for(int i=2;i<=n;i++)
		{
			System.out.print(i+" ");
		}
		int i=1;
		System.out.print(i+" ");
		System.out.println();
	
	}

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			permutate(n);
		}
		
		

	}


}
