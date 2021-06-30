package competitive_programming;

import java.util.HashSet;
import java.util.Scanner;
import java.util.*;

public class Distinct_Pairs 
{
	static class pairs
	{
		int x,y;
		pairs(int x,int y)
		{
			this.x=x;
			this.y=y;
		}
		
	}
	
	
	
	private static void printdistinctpairs(int[] a, int[] b, int k) 
	{
		
	  int count=0;
	  HashSet<pairs> set = new HashSet<>();
	  for(int i=0;i<a.length;i++)
	  {
		  if(count==k)
		  {
			  break;
		  }
		  
		  for(int j=0;j<b.length;j++)
		  {
			  if(count==k)
			  {
				  break;
			  }
				  
			  if(set.contains(new pairs(a[i],b[j])))
			  {
				  
			  }
			  else
			  {
				  count+=1;
				  set.add(new pairs(a[i],b[j]));
				  System.out.println(i+" "+j);
						
					
				  
			  }
			  
		  }
	  
	  }
	  

	  
	  
	  		
	
	
	}

	public static void main(String[] args) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		int a[]=new int[n];
		int b[]=new int[m];
	
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
	
		for(int j=0;j<m;j++)
		{
			b[j]=scan.nextInt();
		}
	
		printdistinctpairs(a,b,(n+m)-1);
		
	
	}

	
}
