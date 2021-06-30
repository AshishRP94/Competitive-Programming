package competitive_programming;

import java.util.Scanner;
import java.util.Stack;

//First line will contain Q, number of queries
//Following Q lines will contain queries of one of the types mentioned
//Type 1: 1 N This query specifies that Sudhanva places a book with number N on it, 
//at the top of the shelf.
//Type 2: −1 This query specifies that Sudhanva takes out the topmost books from the shelf.

public class SUDBOOKS 
{
	public static void main(String args[]) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
		int q=scan.nextInt();
		int qu=0;
		int n=0;
		Stack<Integer> st=new Stack<Integer>();
		for(int i=0;i<q;i++)
		{
			qu=scan.nextInt();
			if(qu==1)
			{
				st.push(scan.nextInt());
				
			}
			else
			{
				if(st.empty())
				{
					System.out.println("kuchbhi?");
				}
				else
				{
					
					System.out.println(st.pop());
				}
			}
			
		
		
		}
		st.clear();
		
		
		
	}

}
