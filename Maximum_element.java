package competitive_programming;

import java.util.Scanner;
import java.util.Stack;

//You have an empty sequence, and you will be given  queries. Each query is one of these three types:
//1 x  -Push the element x into the stack.
//2    -Delete the element present at the top of the stack.
//3    -Print the maximum element in the stack


public class Maximum_element 
{
	private static void stackqueries(int n, int[] temp, int query,Stack<Integer> st) 
	{		
		Scanner scan=new Scanner(System.in);

		
		for(int i=0;i<n;i++)
		{
			query=scan.nextInt();
			if(query==1)
			{
			st.push(scan.nextInt());
			}
			else if(query==2)
			{
			 st.pop();
			
			}
			else
			{
				int len=st.size();
				if(st.size()>1)
				{
					
					
					temp[0]=st.pop();
					int max=temp[0];
				
				for(int x=1;x<=st.size()+1;x++)
				{
					int x1=st.pop();


					if(max<x1)
					{
						max=x1;
						
					}
					temp[x]=x1;
					
					
				}
				System.out.println(max);
				}
				else
				{
					System.out.println(st.peek());
				}
				
				
				
				for(int z=len-1; z>=0; z--)
				{
					
					st.push(temp[z]);
					
				}
			
			}


		}

		
		
	}
	
	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int query=0;
		Stack<Integer> st=new Stack<Integer>();	
		int []temp= new int[n];
		stackqueries(n,temp,query,st);

	}
//
//	10
//	1 97
//	2
//	1 20
//	2
//	1 26
//	1 20
//	2
//	3
//	1 91
//	3

}
