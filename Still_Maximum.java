package competitive_programming;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Still_Maximum {

//	First line constains an integer -number of nodes.
//	Next  lines contains two integers   denoting that there is a bidirectional edge between node  and 
//	Next line contains  integers ith of which is the value of node i.
//	Next  lines contains an integer  where the ith line denotes the index of the edge to be deleted at ith step.
	
	static int []parents;
	private static void init(int n)
	{
		parents=new int[n];
		
	}

	
	
	private static int findparent(int nodes)
	{
		if(parents[nodes]==nodes)
		{
			return nodes;
		}
		return parents[nodes]=findparent(nodes);
	}
	
	
	private static void union(int u, int v)
	{
		int pu=findparent(u);
		int pv=findparent(v);
		parents[pu]=pv;
	}
	
	

	private static void findmaxvalue(PriorityQueue<Integer> pq, int[] parents)
	{
		int 
		
		
		
	}


	
	
	



	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		init((n+1));
		for(int i=1;i<n;i++)
		{
			int u=scan.nextInt();
			int v=scan.nextInt();
			union(u,v);
		}
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		for(int i=1;i<(n+1);i++)
		{
			int temp=scan.nextInt();
			pq.add(temp);
		}
		
		
		findmaxvalue(pq,parents);

	}






}
