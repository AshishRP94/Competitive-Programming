package competitive_programming;

import java.util.HashMap;
import java.util.Scanner;

public class C_Sequence_Transformation {

//	Each test contains one or more test cases. The first line contains the number of test cases t (1≤t≤1000).

//	The first line of each test case contains one integer n (1≤n≤2000) — the number of rows and columns of the board.

//	The next n lines of each test case each contain a string of n digits without spaces. 
//	The j-th digit of the i-th line is the digit of the cell at (i,j). Each digit is one of the characters from 0 to 9.

//	It is guaranteed that the sum of n2 in all test cases doesn't exceed 4⋅106.
	
	static class pair
	{
		int x=0;
		int y=0;
		pair(int x,int y)
		{
			this.x=x;
			this.y=y;
		}
		
	}
	
	private static void sequence(int n, int[] seq)
	{
		for(int i=0;i<seq.length;i++)
		{
			for(int j=0;j<seq)
			{
				
			}
		}
		
	}
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int count=0;
			int []seq=new int[n];
			int []distance=new int[seq.length];
			HashMap<Integer,pair> hm=new HashMap<Integer,pair>();
			for(int j=0;j<seq.length;j++)
			{
				seq[j]=scan.nextInt();
				if(hm.containsKey(seq[j]))
				{
					hm.put(seq[i],hm.get((seq[i])+1));
				}
				else
				{
					hm.put(seq[i],1);
				}
				sequence(n,seq);
			}
		}
		
		
		
		
		
	}



}
