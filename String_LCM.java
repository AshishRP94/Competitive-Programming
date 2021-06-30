package competitive_programming;

import java.util.Scanner;

public class String_LCM {
	
	
//	The first line contains one integer q (1≤q≤2000) — the number of test cases.
//	Each test case consists of two lines, containing strings s and t (1≤|s|,|t|≤20). Each character in each of these strings is either 'a' or 'b'.

	private static void lcm(String one, String two)
	{
		int lenone=one.length();
		int lentwo=two.length();
		int aa=0;
		int ab=0;
		int bb=0;
		int ba=0;
		
		String common="";
		if(lenone>lentwo)
		{
			 common=two;
//			 count();
			 for(int i=0;i<(one.length()-1);i++)
			 {
				 if((one.charAt(i)=='a')&&(two.charAt(i)=='a'))
				 {
					 aa+=1;
					 
				 }
				 else if((one.charAt(i)=='a')&&(two.charAt(i)=='b'))
				 {
					 ab+=1;
					 
				 }
				 else if((one.charAt(i)=='b')&&(two.charAt(i)=='a'))
				 {
					 ba+=1;
					 
				 }
				 else
				 {
					 bb+=1;
					 
				 }
				 
			 }
		}
		else
		{
			 common=one;
			 
		}
		
		int c=((lenone*lentwo)/2);
		for(int i=0;i<c;i++)
		{
			System.out.print(""+common);
		}
		
		
		
	}
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		scan.nextLine();
		for(int i=0;i<t;i++)
		{
			String one=scan.nextLine();
			String two=scan.nextLine();
			lcm(one ,two);
					
		}

	}





}
