package competitive_programming;

import java.util.Scanner;

public class Codeforces_Round_700_1 {


//Each test contains multiple test cases. The first line contains t (1≤t≤1000)  — the number of test cases. Description of the test cases follows.
//The only line of each test case contains a single string s (1≤|s|≤50) consisting of lowercase English letters.
	
	
	private static void final_string(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			if((i&1)==0)
			{
				if(s.charAt(i)=='a')
				{
					System.out.print("b");
				}
				else
				{
					System.out.print("a");
				}
			
			}
			else
			{
				
				if(s.charAt(i)=='z')
				{
					System.out.print("y");
				}
				else
				{
					System.out.print("z");
				}
			}
		}
		System.out.println();
		
	}
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		scan.nextLine();
		for(int i=0;i<t;i++)
		{
			String s=scan.nextLine();
			final_string(s);
		}
		
	}



}
