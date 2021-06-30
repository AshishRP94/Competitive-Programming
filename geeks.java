package competitive_programming;

import java.util.Scanner;

public class geeks 
{
	
	private static void geeks(int n) 
	{
		
		while(true)
		{
			
		int j=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				n=n/i;
				break;
			}
			
			
		}
break;		
		}
	}
	
	private static void euler(int n) 
	{
		
		
	}


	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		geeks(n);
		euler(n);
		

	}


	


}
