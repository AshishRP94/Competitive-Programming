package competitive_programming;

import java.util.ArrayList;
import java.util.Scanner;

public class Letter_Case_Permutation {
	
	private static void permutate(String s, String c, ArrayList<Character> ans, int i)
	{
		if(i==s.length())
		{
			for(int j=0;j<ans.size();j++)
			{
				System.out.print(""+ans.get(j));
			}
			System.out.println();
			return;
		}
		
		if((s.charAt(i)>='0') && (s.charAt(i)<='9'))
		{
			ans.add(s.charAt(i));
			permutate(s, c, ans, i+1);
			ans.remove(new Character(s.charAt(i)));


			
		}
		else
		{
//			pick the small letter
			ans.add(s.charAt(i));
			permutate(s, c, ans, i+1);
			ans.remove(new Character(s.charAt(i)));
			
//			pick the capital letter
			ans.add(c.charAt(i));
			permutate(s, c, ans, i+1);
			ans.remove(new Character(c.charAt(i)));
			
		}
		
		
		
		
		
	}


	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		scan.nextLine();
		for(int i=0;i<t;i++)
		{
			String s=scan.nextLine();
			String c=s.toUpperCase();
			ArrayList<Character>ans=new ArrayList<Character>();
			permutate(s,c,ans,0);
		}

	



}
}
