package competitive_programming;

import java.util.Scanner;

public class A_Puzzle_From_the_Future 
{

//	The first line contains a single integer t (1≤t≤1000) — the number of test cases.
//	The first line of each test case contains the integer n (1≤n≤105) — the length of a and b.
//	The second line of each test case contains binary integer b of length n. The integer b consists only of digits 0 and 1.
//	It is guaranteed that the total sum of n over all t test cases doesn't exceed 105.
	
	
	private static void puzzle(int n, String bs)
	{
		int []bsa=new int[bs.length()];
		int temp=Integer.parseInt(String.valueOf(bs.charAt(0)));
		bsa[0]=temp+1;
		
		System.out.print(""+1);
		
		for(int i=1;i<bs.length();i++)
		{
			temp=Integer.parseInt(String.valueOf(bs.charAt(i)));
//			System.out.println("temp 1="+(temp+1));
//			System.out.println("temp 0 ="+(temp+0));
//			System.out.println("bsa"+bsa[i-1]);
			if((temp+1)!=bsa[i-1])
			{
				int a=1;
				System.out.print(""+a);
//				System.out.println("in 1");
				bsa[i]=(temp+1);
//				System.out.println();
				
				continue;
				
			}
			
			if((temp+0) !=bsa[i-1])
			{
				int a=0;
				System.out.print(""+a);
//				System.out.println("in 0");
				bsa[i]=(temp+0);
			}
			
			
//			System.out.println();
		}
		System.out.println();
		
		
		
	}
	
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			scan.nextLine();
			String bs=scan.nextLine();
			puzzle(n,bs);
			
		}
		
	}



}
