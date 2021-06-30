package competitive_programming;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Course_Schedule {

	static boolean []visited;
//	static boolean []visited1;
	private static void init(int n)
	{
		visited=new boolean[n];
//		visited1=new boolean[n];
	}
	

	
	

	static Stack<Integer>st=new Stack<Integer>();
	private static boolean dfs(ArrayList<Integer>[] graphs, int nodes, int parent)
	{
//		System.out.println("nodes="+nodes);
		for(int i=0;i<graphs[nodes].size();i++)
		{
			int adjvertices=graphs[nodes].get(i);
//			System.out.println("adj="+adjvertices);
			if(visited[adjvertices]==false)
			{
//				System.out.println("if");
				visited[adjvertices]=true;
				if(dfs(graphs,adjvertices,nodes)==true)
				{
					return true;
				}
				
			}
			else
			{
				if(adjvertices!=parent)
				{
					return true;
				}
				
			}
//			System.out.println("nodes="+nodes);
		}
		st.add(nodes);
		return false;
	}

//The first input line has two integers n and m: the number of courses and requirements. The courses are numbered 1,2,…,n.
//After this, there are m lines describing the requirements. Each line has two integers a and b: course a has to be completed before course b.

	private static void find_req(ArrayList<Integer>[] graphs, boolean[] topo)
	{
		
		boolean flag=false;
		for(int i=1;i<graphs.length;i++)
		{
			if(topo[i]==false)
			{
				flag=true;
			if(visited[i]==false)
			{
//				System.out.println("call for "+i);
				boolean ans=dfs(graphs,i,0);
				if(ans==true)
				{
					
					System.out.println("IMPOSSIBLE");
					return;
				}
				visited[i]=true;
			}
			}
				
		}
		if(flag==false)
		{
			System.out.println("IMPOSSIBLE");
 		}
		else
		{
			
		int len=st.size();
		for(int i=0;i<len;i++)
		{
			int p=st.pop();
			System.out.print(" "+p);
		}
		}
		
	}
	


	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int courses=scan.nextInt();
		init(courses+1);
		int requ=scan.nextInt();
		boolean []topo=new boolean[(courses+1)];
		ArrayList<Integer>[]graphs=new ArrayList[(courses+1)];
		for(int j=0;j<graphs.length;j++)
		{
			graphs[j]=new ArrayList<Integer>();
		}
		for(int i=0;i<requ;i++)
		{
			int u=scan.nextInt();
			int v=scan.nextInt();
			if(topo[v]==false)
			{
				topo[v]=true;
			}
			graphs[u].add(v);
		}
	
			find_req(graphs,topo);
			
		
		
		
		

	}






}
