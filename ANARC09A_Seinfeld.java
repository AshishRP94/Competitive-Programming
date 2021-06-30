package competitive_programming;

import java.util.Scanner;
import java.util.Stack;

public class ANARC09A_Seinfeld {
	
	
	private static void con_str_to_balanced_string(String s, int t)
	{
		Stack<Character>st=new Stack<Character>();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='{')
			{
//				System.out.println("s="+s.charAt(i));
				st.push('{');
			}
			else
			{
				
//				System.out.println("else");
//				System.out.println(""+st.isEmpty());
				if(st.isEmpty()==false)
				{
					
				if(st.peek()=='{')
				{
//					System.out.println("hi");
					st.pop();
				}
				else
				{
					st.push(s.charAt(i));
					
				}
				}
				else
				{
					st.push(s.charAt(i));
					
				}
			}
			
		}
		while(true)
		{
			
			if(st.isEmpty()==false)
			{
				char temp=st.pop();
				if(st.isEmpty()==false)
				{
					
				if(temp=='{' && st.peek()=='{')
				{
					count+=1;
					st.pop();
				}
				else if(temp=='}' && st.peek()=='}')
				{
					count+=1;
					st.pop();
				}
				else
				{
					count+=2;
					st.pop();
				}
				}
			}
			else
			{
				break;
			}
		}
		System.out.println(""+t+". "+count);
		
	}
	

	public static void main(String[] args)
	{
		
		Scanner scan=new Scanner(System.in);
		int t=0;
		while(true)
		{
		t+=1;	
		String s=scan.nextLine();
		if(s.charAt(0)=='-')
		{
			break;
		}
		else
		{
			con_str_to_balanced_string(s,t);
		}
		}
		

	}



}
