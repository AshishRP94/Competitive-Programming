package competitive_programming;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Owl_Fight
{


	static  int []parents;
	static int []size;
	
	private static void init(int n)
	{
		parents=new int[n];
		size=new int[n];
		for(int i=1;i<n;i++)
		{
			parents[i]=i;
			size[i]=1;
			
		}
	}
	
	static class pair implements Comparable<pair>
	{
		int x;
		int y;
		public pair(int x,int y)
		{
			this.x=x;
			this.y=y;
		}
		public int compareTo(pair o)
		{
			return x-o.x;
		}
	}

	
	
//	First line contains the number of owls participating N and the number of connections M.
//	M lines follow.
//	Each line contains two integers u and v denoting that they are friends.
//	Next line contains Q, the number of queries.
//	Q lines follow.
//	Each line contains two integers u and v. You need to tell who wins.
	
	
	private static int findparent(int node)
	{
		if(parents[node]==node)
		{
			return node;
		}
		
		return parents[node]=findparent(parents[node]);
	}
	
	
	
	private static void link(PriorityQueue<pair> pq, int n)
	{
		int len=pq.size();
		for(int i=0;i<len;i++)
		{
			pair temp=pq.poll();
//			System.out.println("x="+temp.x+"y="+temp.y);
			int px=findparent(temp.x);
//			System.out.println("px="+px);
			int py=findparent(temp.y);
//			System.out.println("py="+py);
			if(px==temp.x && py==temp.y)
			{
				parents[py]=px;
				
			}
			else
			{
				if(px>py)
				{
					parents[py]=px;
				}
				else
				{
					parents[px]=py;
					
				}
			}
//			System.out.println();
		}
		
	}
	
	



	public static void main(String[] args) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		init((n+1));
		 PriorityQueue<pair> pq  = new PriorityQueue<pair>(Collections.reverseOrder()); 
		int edges=scan.nextInt();
		for(int i=0;i<edges;i++)
		{
			int u=scan.nextInt();
			int v=scan.nextInt();
			if(u>v)
			{
				pq.add(new pair(u,v));
			}
			else
			{
				pq.add(new pair(v,u));
			}
		}
		link(pq,n);
		int queries=scan.nextInt();
//		for(int i=0;i<parents.length;i++)
//		{
//			System.out.print(" "+parents[i]);
//		}
		
		for(int i=0;i<queries;i++)
		{
			int u=scan.nextInt();
			int v=scan.nextInt();
			int pu=findparent(u);
			int pv=findparent(v);
			if(findparent(pu)==findparent(pv))
			{
				System.out.println("TIE");
			}
			else
			{
				if(pu>pv)
				{
					System.out.println(""+u);
				}
				else
				{
					System.out.println(""+v);
				}
			}
		}
//		7 3
//		1 2
//		3 4
//		1 7
//		4
//		1 2
//		5 6
//		3 7
//		1 5
		
		
		
	}






}
