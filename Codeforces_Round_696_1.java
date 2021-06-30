package competitive_programming;

import java.util.Scanner;

public class Codeforces_Round_696_1 
{
	
//	The first line contains a single integer t (1≤t≤1000) — the number of test cases.
//	The first line of each test case contains the integer n (1≤n≤105) — the length of a and b.
//	The second line of each test case contains binary integer b of length n. The integer b consists only of digits 0 and 1.
//	It is guaranteed that the total sum of n over all t test cases doesn't exceed 105.

	private static void helpmike(int n, String b)
	{
		char []a= new char[n];
		for(int i=0;i<n-1;i++)
		{
			if((n&1)==0)
			{
				
			if(b.charAt(i)=='1' && b.charAt(i+1)=='1')
			{
				a[i]=1;
				a[i+1]=0;
			}
			else if (b.charAt(i)=='1' && b.charAt(i+1)=='0')
			{
				a[i]=1;
				a[i+1]=1;
			}
			else if (b.charAt(i)=='1' && b.charAt(i+1)=='1')
			{
				a[i]=1;
				a[i+1]=1;
				
			}
			else
			{
				a[i]=0;
				a[i+1]=1;
			}
			}
			else
			{
				if(i==b.length()-1)
				{
					if(b.charAt(i)==1)
					{
						if(a[i-1]==1)
						{
							a[i]=0;
						}
						else
						{
							a[i]=1;
						}
					}
					else
					{
						if(a[i-1]==1)
						{
							a[i]=0;
						}
						else
						{
							a[i]=1;
						}
						
					}
				}
				
				if(b.charAt(i)=='1' && b.charAt(i+1)=='1')
				{
					a[i]=1;
					a[i+1]=0;
				}
				else if (b.charAt(i)=='1' && b.charAt(i+1)=='0')
				{
					a[i]=1;
					a[i+1]=1;
				}
				else if (b.charAt(i)=='1' && b.charAt(i+1)=='1')
				{
					a[i]=1;
					a[i+1]=1;
					
				}
				else
				{
					a[i]=0;
					a[i+1]=1;
				}
				
				
			}
			
		}
		
		
		int []ans =new int[b.length()];
		for(int i=0;i<b.length();i++)
		{
			
			if((a[i]=='1') &&(b.charAt(i)=='1') )
			{
				ans[i]=2;
				
	
			}
			else if((a[i]=='0') &&(b.charAt(i)=='1') )
			{
				
				if(i-1>0)
				{
					if(ans[i-1]==1)
					{
					
					
					
					}
				}
				else
				{
					ans[i]=1;
					
				}

				
			}
			else if((a[i]=='1') &&(b.charAt(i)=='0') )
			{
				if(i-1>0)
				{
					if(ans[i-1]==1)
					{
					
					
					
					}
				}
				else
				{
					ans[i]=1;
					
				}
				
			}
			else
			{
				ans[i]=0;
			}
			
			
		
		}
		
		for(int i=0;i<ans.length;i++)
		{
			System.out.print(""+ans[i]);
		}
		System.out.println();
		
		
		
	}
	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			scan.nextLine();
			String b=scan.nextLine();
			helpmike(n,b);
		}
	}



}
