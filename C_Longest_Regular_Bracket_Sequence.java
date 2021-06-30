package competitive_programming;

import java.util.Scanner;
import java.util.Stack;

public class C_Longest_Regular_Bracket_Sequence
{
	static class pair
	{
		char b;
		int ind;
		pair(char b,int ind)
		{
			this.b=b;
			this.ind=ind;
		}
		
		
	}
	
	private static void find_regular(String s)
	{
		Stack<pair>st=new Stack<pair>();
		st.add(new pair('*',0));
		int max=Integer.MIN_VALUE;
		int count=0;
		st.add(new pair(s.charAt(0),1));
		for(int i=0;i<s.length();i++)
		{
//			String s="";
			
				
		
			if(st.peek().b!='*')
			{
				
			if(s.charAt(i)=='(')
			{
				st.add(new pair('(',i));
			}
			else if(s.charAt(i)==')')
			{
				if(st.peek().b=='(')
				{
					st.pop();
				}
				if(max<i-st.peek().ind)
				{
					int t=i-st.peek().ind;
					max=i-st.peek().ind;
					count+=1;
					System.out.println("t="+t);
					System.out.println("max"+max);
				}
				if(max==i-st.peek().ind)
				{
					count+=1;
				}
			}
			else
			{
				st.push(new pair(s.charAt(i),i+1));
			}
			
			}
			else
			{
				if(st.peek().b=='*')
				{
					if(max<(i-st.peek().ind))
					{
						max=i-st.peek().ind;
						count+=1;
					}
				}
			}
			
			
			
		}
		
		System.out.println(""+max);
		System.out.println(""+count);
		
	}
	

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		find_regular(s);

	}



}
