package competitive_programming;

import java.util.Scanner;
import java.util.Stack;

public class The_Saviours {
	
	private static String feed_houses(int n, String s)
	{
		if(s.charAt(0)=='0')
		{
			return "NO";
			
		}
		Stack<Integer>st=new Stack<Integer>();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='*')
			{
				st.add(0);
			}
			
			
			
		
			count+=1;
			
			if(count==2)
			{
				count=0;
				if(st.isEmpty()==true)
				{
					return "NO";
				}
				else
				{
					st.pop();
					
				}
			}
			
			
		}
		return "YES";
		
	}
	

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		scan.nextLine();
		for(int i=0;i<t;i++)
		{
//			int n=scan.nextInt();
			String s=scan.nextLine();
			System.out.println(feed_houses(0,s));
		}

	}



}
