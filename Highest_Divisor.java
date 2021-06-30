package competitive_programming;

import java.util.Scanner;

public class Highest_Divisor 
{

	public static void main(String[] args)throws java.lang.Exception 
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int max=Integer.MIN_VALUE;
		for(int i=1;i<=10;i++)
		{
			if(n%i==0)
			{
				if(max<i)
				{
					max=i;
				}
			}
		}
		System.out.println(""+max);
		
		
	}

}
