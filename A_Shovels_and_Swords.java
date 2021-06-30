package competitive_programming;

import java.util.Scanner;

public class A_Shovels_and_Swords
{
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			long a=scan.nextLong();
			long b=scan.nextLong();
			long ans=(a+b)/3;
			System.out.println(""+ans);
			
			
		}
		
		
	}

}
