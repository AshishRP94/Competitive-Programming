package competitive_programming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class Generate_Parentheses {
	
	private static boolean checkbalancep(ArrayList<Character> ans)
	{
		Stack<Character>st=new Stack<Character>();
		for(int i=0;i<ans.size();i++)
		{
			
			if(ans.get(i)=='(')
			{
				st.push('(');
				
			}
			else
			{
//				(
				
			    if(st.size()>0)
			    {
			    	
				if(st.peek()=='(' )
				{
					st.pop();
				}
			    }
				else
				{
					
					return false;
				}
			}
		}
		
		if(st.size()>0)
		{
			return false;
			
		}
		else
		{
			return true;
			
		}
		
	
		
		
		
	}
	
	
static	HashMap<String,Integer>hm=new HashMap<String,Integer>();
	private static void genrate(String s, ArrayList<Character> ans, int i, boolean[] bool)
	{
		if(i==s.length())
		{
			if(checkbalancep(ans)==true)
			{
				if(hm.containsKey(ans.toString()))
				{
					
				}
				else
				{
					for(int j=0;j<ans.size();j++)
					{
						System.out.print(""+ans.get(j));
					}
					System.out.println();
					hm.put(ans.toString(), 1);
				}
			}
			return;
		}
		
//		pick the Parentheses
		for(int j=0;j<s.length();j++)
		{
			
		if(bool[j]==false)
		{
			ans.add(s.charAt(j));
			bool[j]=true;
			genrate(s, ans, i+1,bool);
			ans.remove(new Character(s.charAt(j)));
			bool[j]=false;
			
			
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
			String a="";
			String b="";
			for(int j=0;j<n;j++)
			{
				a+='(';
				
			}
			
			for(int j=0;j<n;j++)
			{
				b+=')';
				
			}
			
			String s=a+b;
			boolean []bool=new boolean[n*2];
			ArrayList<Character> ans=new ArrayList<Character>();
			System.out.println(""+s);
			genrate(s,ans,0,bool);
		}
		
		
		
		
	}



}
