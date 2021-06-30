package competitive_programming;

import java.util.Scanner;

public class twosets {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int sum1=1+2;
		int sum2=3;
		int ans=0;
		for(int i=4;i<=n;i++)
		{
			if((i&1)==0)
			{
				sum1+=i;
			}
			else
			{
				sum2+=i;
				
			}
		}
		ans=Math.abs(sum1-sum2);
		System.out.println(""+ans);
		

	}

}
