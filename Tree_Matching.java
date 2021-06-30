package competitive_programming;

import java.util.ArrayList;
import java.util.Scanner;

public class Tree_Matching {
	
	static boolean []tvisited;
	public Tree_Matching(int n)
	{
		tvisited=new boolean[n];
	}
	
	

//	The first input line contains an integer n: the number of nodes. The nodes are numbered 1,2,…,n.
//	Then there are n−1 lines describing the edges. Each line contains two integers a and b: there is an edge between nodes a and b.
	static int count=0;
	private static void dfs(ArrayList<Integer>[] trees, int child, int parent)
	{
		int subchild = 0;
//		System.out.println("hi");
		for(int i=0;i<trees[child].size();i++)
		{
			subchild=trees[child].get(i);
			if(subchild==parent)
			{
				
			}
			else
			{
				dfs(trees,subchild,child);
			}
			
		}
		if(tvisited[child]==false && tvisited[subchild]==false && child!=0)
		{
			count+=1;
			tvisited[child]=true;
			tvisited[subchild]=true;
			
		}
		
	}

	
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		ArrayList<Integer>[]trees=new ArrayList[n+1];
		for(int i=0;i<trees.length;i++)
		{
			trees[i]=new ArrayList<>();
		}
		
		
		Tree_Matching obj=new Tree_Matching(n+1);
		for(int i=1;i<trees.length-1;i++)
		{
			int u=scan.nextInt();
			int v=scan.nextInt();
			trees[u].add(v);
//			trees[v].add(u);
		}
		dfs(trees,1,0);
		System.out.println(""+count);
	}






}
