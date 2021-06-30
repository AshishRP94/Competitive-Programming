package competitive_programming;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Word_Break_leetcode {
	
	private static boolean word_break(String s, HashSet<String> set, String ans)
	{
		if(s.length()==0)
		{
			return true;
		}
		
		for(int i=0;i<set.size();i++)
		{
			String sub=s.substring(0,(i+1));
			if(set.contains(sub))
			{
				String left=s.substring((i+1));
				boolean flag=word_break(left, set, ans+sub+"");
				if(flag==true)
				{
					return true;
				}
			}
		}
		return false;
	}
	

	

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		scan.nextLine();
		HashSet<String>set=new HashSet<String>();
		for(int i=0;i<t;i++)
		{
			String s=scan.nextLine();
			int n=scan.nextInt();
			for(int j=0;j<n;j++)
			{
				String temp=scan.nextLine();
				set.add(temp);
			}
			boolean flag=word_break(s,set,"");
			if(flag==true)
			{
				System.out.println("True");
			}
			else
			{
				System.out.println("False");
			}
		}

	}



}
