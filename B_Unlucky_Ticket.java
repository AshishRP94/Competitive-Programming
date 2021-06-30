package competitive_programming;
import java.util.Scanner;

public class B_Unlucky_Ticket {
 
//	The first line contains an integer n (1 ≤ n ≤ 100). The second line contains a string that consists of 2n digits and defines your ticket.
 
	private static void findunluckyticket(String ticket)
	{
		int i=0;
		int j=ticket.length()-1;
		int countg=0;
		int counts=0;
		while(i<j)
		{
			int a=Integer.parseInt(String.valueOf(ticket.charAt(i)));
			int b=Integer.parseInt(String.valueOf(ticket.charAt(j)));
			if(a>b)
			{
				countg+=1;
			}
		   
			if(b>a)
			{
				counts+=1;
			}
			
			j-=1;
			i+=1;
			
		}
		if(countg>0 && counts>0)
		{
			System.out.println("NO");
		}
		else if(countg==0 && counts==0)
		{
			
			System.out.println("NO");
		}
		else
		{
			System.out.println("YES");
		}
		
	}
 
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		scan.nextLine();
		String ticket=scan.nextLine();
		findunluckyticket(ticket);
		
 
	}
 
 
 
}