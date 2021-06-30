package competitive_programming;

import java.util.Scanner;
import java.util.Stack;

//The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
//The first line of each test case contains a single integer N.
//The second line contains a string S with length 2⋅N, where for each valid i, the i-th character is '0' if the i-th shot was a miss or '1' if it was a goal.

public class Penalty_shoot_out 
{
	private static int findmin(int n, char[] scores) 
	{
		int asro=(scores.length>>1);
		int bsro=(scores.length>>1);
//		System.out.println("asro="+asro);
//		System.out.println("bsro="+bsro);

		int a=0;
		int b=0;
		int ans=0;
		
	
		for(int i=0;i<scores.length;i++ )
		{
			if((i&1)==0)
			{
				
				asro-=1;
				if(scores[i]=='1')
				{
//					System.out.println("asro="+asro);
					a+=1;
//					System.out.println("a="+a);
					
				}
			
			}
			else
			{
				
				bsro-=1;
				if(scores[i]=='1')
				{
//					System.out.println("bsro="+bsro);
					b+=1;
//					System.out.println("b="+b);
					
				}
				
		}
//			System.out.println();
//			System.out.println("a+b="+(a+b));
//			System.out.println("a="+a);
			if(a>(b+bsro))
			{
				ans=a;
//				System.out.println("ans a="+ans);
				break;
				
				
			}
			else if(b>(a+asro))
			{
//				System.out.println("ans b="+ans);
				ans=b;
				break;
			}
			else
			{
				if(i==scores.length)
				{
//					System.out.println("ans a=b ="+ans);
					ans=i;
				    break;
				}
				
				
			}
		}

		
		return scores.length-ans;
	}

	public static void main(String[] args) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		int n=0;
		String scores=new String();
		for(int i=0;i<t;i++)
		{
		n=scan.nextInt();
		scan.nextLine();
		scores=scan.nextLine();
		
		System.out.println((findmin(n,scores.toCharArray())));
		}
	
	
	
	
	}

	

}
