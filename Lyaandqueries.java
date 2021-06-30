package competitive_programming;

import java.util.Scanner;

class codeforces
{
	int ans(int l,int r, String s)
	{
		
		if(l>r-1)//base case
		{
			return 0;
		}
		
		int c=0;
		
		if(s.charAt(l)==s.charAt(r))
		{
			c=ans(l+1,r,s)+1;
		}
		else
		{
			c=ans(l+1,r,s)+0;
		}
		return c;
		
	}
	
}


public class Lyaandqueries {
	
	public static void main(String args[])
	{
//		System.out.println("yo");
		
		String s;
//		int l,r;
		Scanner scan=new Scanner(System.in);
		s=scan.nextLine();
		int m=scan.nextInt();
		int [] arr=new int[(m*2)+1];
		
		
		
		codeforces c=new codeforces();
		for(int i=0;i<m*2;i=i+2)
		{
			
		
		arr[i]=scan.nextInt();
		arr[i+1]=scan.nextInt();
	
		
		
		
		
		}
		

		
		for(int i=0;i<m*2;i++)
		{
			
			System.out.println(c.ans(arr[i]-1,arr[i+1]-1,s));
			i=i+1;
		}
		
			

		
		
	}

}
