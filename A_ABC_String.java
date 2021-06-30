package competitive_programming;

import java.util.Scanner;
import java.util.Stack;

public class A_ABC_String
{

//	The first line contains a single integer t (1≤t≤1000) — the number of testcases.
//	Then the descriptions of t testcases follow.
//	The only line of each testcase contains a string a. a consists only of uppercase letters 'A', 'B' and 'C'.
//	Let n be the length of a. It is guaranteed that n is even and  2≤n≤50
	
	
    static char cc;
	private static boolean find_b(String str)
	{
		Stack<Character>st=new Stack<Character>();
		char c=str.charAt(0);
		boolean empty=false;
//		boolean flag=false;
		for(int i=0;i<str.length();i++)
		{
//			System.out.println("str at i"+s);
			if(str.charAt(i)==c)
			{
				st.push(str.charAt(i));
			}
			else
			{
				if(st.size()==0)
				{
					empty=true;
					break;
				}
				st.pop();
			}
			
		}
		if(empty==true||st.size()>0)
		{
			return false;
		}
		else
		{
			return true;
		}
		
	}


	
	private static boolean find_b1(String str)
	{

		
		
		Stack<Character>sta=new Stack<Character>();
		char c=str.charAt(0);
		boolean empty=false;
//		boolean flag=false;
		for(int i=0;i<str.length();i++)
		{
//			System.out.println("str at i"+s);
			if(str.charAt(i)==c||str.charAt(i)!=cc)
			{
				sta.push(str.charAt(i));
			}
			else
			{
				if(sta.size()==0)
				{
					empty=true;
					break;
				}
				sta.pop();
			}
			
		}
		if(empty==true||sta.size()>0)
		{
			return false;
		}
		else
		{
			return true;
		}


	}
//	2
//	BB
//	BBAC
//	ABCA

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		scan.nextLine();
		for(int i=0;i<t;i++)
		{
			boolean flag=false;
			String str=scan.nextLine();
			flag=(flag|find_b(str));
//			System.out.println("flag"+flag);
			flag=(flag|find_b1(str));
//			System.out.println("flag"+flag);
			if(flag==true)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
		
	}



}
