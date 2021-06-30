package competitive_programming;

import java.util.Scanner;

public class A_Regular_Bracket_Sequence {
	
//	 The first line contains one integer t (1≤t≤1000) — the number of test cases.
//	 Each test case consists of one line containing s (2≤|s|≤100) — a sequence of
//	 characters (, ), and/or ?.
//	 There is exactly one character ( and exactly one character ) in this sequence.
	
	private static String checkforrs(String rs)
	{
		return "YES";
	}
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		scan.nextLine();
		for(int i=0;i<t;i++)
		{
			String rs=scan.nextLine();
			System.out.println(checkforrs(rs));
			
		}
		
	}



}
