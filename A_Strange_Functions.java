package competitive_programming;

import java.util.HashSet;
import java.util.Scanner;

public class A_Strange_Functions
{
	
	private static int f(int i)
	{
		String s=String.valueOf(i);
		int track=s.length();
		String ans="";
		for(int j=(s.length()-1);j>=0;j--)
		{
			if(s.charAt(s.length()-1)!='0')
			{
				ans=s;
				break;
			}
			
			
			if(s.charAt(j)=='0')
			{
				track=track-1;
		
			}
			else if(track!=s.length())
			{
				ans=s.substring(0,track);
				break;
			}
			else
			{
				ans=s;
				
			}
		
		
			
		}
				
		return Integer.parseInt(ans);
	}
	
	private static int g(int i) 
	{
		int ans=(i/(f(f(i))));
		return ans;
		
		
		
	}
	
	private static void strangefuct(int n)
	{
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=1;i<=n;i++)
		{
			hs.add(g(i));
			
		}
		System.out.println(""+hs.size());
	}
	




	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			strangefuct(n);
		}
		
		
		
	}



}
