package competitive_programming;

import java.util.Scanner;

public class A_Space_Navigation {

//	The first line contains a single integer t (1≤t≤1000) — the number of test cases.
//
//	Each test case consists of two lines. The first line in each test case contains two integers px and py (−105≤px,py≤105; (px,py)≠(0,0)) — the coordinates of Planetforces (px,py).
//
//	The second line contains the string s (1≤|s|≤105: |s| is the length of string s) — the list of orders.
//
//	It is guaranteed that the sum of |s| over all test cases does not exceed 105.
	
	private static void planetcodeforces(int px, int py, String orders)
	{
		char x,y;
		if(px>=0 && py>=0)
		{
			x='R';
			y='U';
//			++
		}
		else if(px>=0 && py<=0)
		{
			x='R';
			y='D';
			
//			+-
			
		}
		else if(px<=0 && py>=0)
		{
			x='L';
			y='U';
//			-+
		}
		else
		{
//			--
			x='L';
			y='D';
		}
		
		int apx=Math.abs(px);
		int apy=Math.abs(py);
//		System.out.println("apx="+apx+"|apy"+apy);
//		System.out.println("x="+x+"|y"+y);
		int countx=0;
		int county=0;
		for(int i=0;i<orders.length();i++)
		{
			if(orders.charAt(i)==x)
			{
				countx+=1;
				
			}
			
			if(orders.charAt(i)==y)
			{
				county+=1;
				
			}
			
		}
		
		if((countx>=apx) && (county>=apy))
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
			
		}
			
		
	}
	
	public static void main(String[] args)
	{
		
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int px=scan.nextInt();
			int py=scan.nextInt();
			scan.nextLine();
			String orders=scan.nextLine();
			planetcodeforces(px,py,orders);
		}

	}



}
