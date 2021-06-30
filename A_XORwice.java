package competitive_programming;

import java.util.Scanner;

public class A_XORwice {
	
	
	private static void solve(long a, long b)
	{
		long ans=0;
		if(a>b)
		{
			ans=((a^a)+(b^a));
			System.out.println(""+ans);
		}
		else if(a<b)
		{
			ans=((a^b)+(b^b));
			System.out.println(""+ans);
			
		}
		else
		{
			System.out.println(""+ans);
			
		}
		
	}
	

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			long a=scan.nextLong();
			long b=scan.nextLong();
			solve(a,b);

	  }

}


}
