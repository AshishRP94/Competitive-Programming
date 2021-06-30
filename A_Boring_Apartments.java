package competitive_programming;

import java.util.Scanner;

public class A_Boring_Apartments
{
//	The first line of the input contains one integer t (1≤t≤36) — the number of test cases.
//	The only line of the test case contains one integer x (1≤x≤9999) — the apartment number of the resident who answered the call. 
//	It is guaranteed that x consists of the same digit
	private static void keypresses(String str)
	{
		int len=str.length();
		char ft=str.charAt(0);
		int f=Integer.parseInt(String.valueOf(ft));;
//		System.out.println(" "+f);
		int x=Integer.parseInt(str);
		int temp=(f-1)*10;
		if(len==4)
		{
			int a4=10;
			System.out.println(""+(temp+a4));
			
		}
		else if(len==3)
		{
			int a3=6;
			System.out.println(""+(temp+a3));
			
		}
		else if(len==2)
		{
			int a2=3;
			System.out.println(""+(temp+a2));
			
		}
		else
		{
			int a1=1;
			System.out.println(""+(temp+a1));
			
		}
		
	
	
	}

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		scan.nextLine();
		for(int i=0;i<t;i++)
		{
			String str=scan.nextLine();
			keypresses(str);
		}
		

	}


}
