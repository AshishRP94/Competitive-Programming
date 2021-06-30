package competitive_programming;
import java.util.Scanner;

public class A_Floor_Number {
	
	
	
//	The first line of the input contains one integer t (1≤t≤1000) — the number of test cases. Then t test cases follow.
//	The only line of the test case contains two integers n and x (1≤n,x≤1000) — 
//	the number of Petya's apartment and the number of apartments on each floor of the house except the first one (there are two apartments on the first floor).

	private static void findpetyafloor(int n, int x) 
	{
		int floor=2;
		int apart=2;
		int temp=0;
		if(1==n||2==n)
		{
			System.out.println(floor-1);
			return;
			
		}
		for(int i=0;i<n;i++)
		{
			if(apart==n)
			{
				System.out.println(floor);
				break;
			}
			if(temp==x)
			{
				floor+=1;
				temp=0;
				
			}
			temp+=1;
			apart+=1;

			
			
		}
			
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int x=scan.nextInt();
			findpetyafloor(n,x);
		}

	}



}
