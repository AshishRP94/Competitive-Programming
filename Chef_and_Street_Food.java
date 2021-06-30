package competitive_programming;

import java.util.Scanner;
import java.util.Stack;


//The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
//The first line of each test case contains a single integer N.
//N lines follow. For each i (1≤i≤N), the i-th of these lines contains three space-separated integers Si, Pi and Vi.

public class Chef_and_Street_Food 
{
	
	private static int findmaxprofit(int stores, int people, int price) 
	{
	int ans= people/stores;
	return ans*price;

	}
	
	
public static void main(String args[]) 
{
	
	int t=0;
	int n;
	Scanner scan=new Scanner(System.in);
	Stack<Integer> st=new Stack<Integer>();
	t=scan.nextInt();
	for(int j=0;j<t;j++)
	{
		
	n= scan.nextInt();
	int stores,people,price;
	int ans=Integer.MIN_VALUE;
	st.push(ans);
	for(int i=0;i<n;i++)
	{
		stores=scan.nextInt();
		people=scan.nextInt();
		price=scan.nextInt();
		ans=findmaxprofit(stores+1,people,price);
		if(ans>=st.peek())
		{
		st.push(ans);
		}
		
	}
	System.out.println(st.peek());
	st.clear();
//	System.out.println(st);
	}
	
	
	

//  1
//	3
//	4 6 8
//	2 6 6
//	1 4 3


}


}
