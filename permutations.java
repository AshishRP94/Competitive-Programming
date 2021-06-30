package competitive_programming;

import java.util.Scanner;


public class permutations 
{
	private static void permutate(String p, String ans) 
	{
		if(p.length()==0)
		{
			System.out.println(ans);
		}
		
		for(int i=0;i<p.length();i++)
		{
			char ch=p.charAt(i);
			String l=p.substring(0,i);
			String r=p.substring(i+1);
			String np=l+r;
			permutate(np,ans+ch);
			
		}
	
		
	}

	public static void main(String args[])
	{
		
		Scanner scan=new Scanner(System.in);
		String p=scan.nextLine();
		permutate(p,"");
		
	}

	
}
