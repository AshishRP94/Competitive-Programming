package competitive_programming;

import java.util.Scanner;

//The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
//The first and only line of each test case contains two space-separated integers A and B.

public class Even_Pair_Sum 
{
	private static int findpairs(int a, int b) 
	{
		  if(b>a)
		    {
		        a = a ^ b;
		        b = a ^ b; 
		        a = a ^ b;  
		    }
		  int ae=a/2;
		  
			  
	
	
		int pairs=0;
		int m=b%2;
		int d=b/2;
		int n=0;
		if(a%2==0)
		{
			n=a/2;
			
			
		}
		else
		{
			n=(a/2)+1;
			
		}
	
				
				if(m==0)
				{
					
					pairs=(pairs+d)*n;

					
				}
				else
				{
					pairs=(pairs+d+1)*n;

					
				}
					
				

			
			
		
		
		
//		10
//		4 5
//		10
//		10 30
//		150
//		20 40
//		400
//		7 11
//		39
//		3 15
//		23


		
		return pairs+(d*ae);
	}

	public static void main(String[] args) throws java.lang.Exception
	{	
		int t;
		int a,b;
		Scanner scan=new Scanner(System.in);
		t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			
			a=scan.nextInt();
			b=scan.nextInt();
			System.out.println(findpairs(a,b));
			
		
		}
	
//		1 1
//		2 3
//		4 6
//		8 9
//	
	
	}



}

