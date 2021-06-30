package competitive_programming;

import java.util.HashSet;
import java.util.Scanner;

public class amantest
{
	
	static HashSet<String>set=new HashSet<String>();
	private static void solve(int n, String ss, int[] temp, String string)
	{
		for(int i=0;i<temp.length;i++)
		{
			for(int )
			solve(n, ss, temp, string);
		}
	}
	
	

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			scan.nextLine();
			String z="";
			String ss=scan.nextLine();
			String st=scan.nextLine();
			int []temp=new int[n];
			set.clear();
			int k=0;
			if(ss.equals(st))
			{
				System.out.println("YES");
			}
			else
			{
				
			int countx=0;
			int county=0;
			set.clear();
			for(int j=0;j<ss.length();j++)
			{
				if(ss.charAt(j)=='X')
				{
					countx+=1;
				}
				
				if(ss.charAt(j)=='Y')
				{
					county+=1;
				}
				
				if(countx==county)
				{
					temp[k]=j;
				}
			}
			
			solve(n,ss,temp,z);
			if(set.contains(st))
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



}
