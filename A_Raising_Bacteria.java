package competitive_programming;

import java.util.Scanner;

public class A_Raising_Bacteria {
	
	private static void find_min_bact(int n)
	{
		long tot=0;
		long count=1;
		for(int i=1;i<n;i++)
		{
			if(((1<<i))<=n)
			{
				tot=(1<<i);
//				System.out.println(""+tot);
			}
			else
			{
				if((1>>i)==n)
				{
					System.out.println(""+count);
					break;
				}
				else
				{
//					System.out.println("tottt"+tot);
					count+=(n-tot);
					
					System.out.println(""+count);
					break;
				
				}
			}
			
		}
		
	}
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		find_min_bact(n);

	}



}
