package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;



public class GODFATHER
{
	
	 static class FastReader {
	        BufferedReader br;
	        StringTokenizer st;
	 
	        public FastReader()
	        {
	            br = new BufferedReader(
	                new InputStreamReader(System.in));
	        }
	 
	        String next()
	        {
	            while (st == null || !st.hasMoreElements()) {
	                try {
	                    st = new StringTokenizer(br.readLine());
	                }
	                catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	            return st.nextToken();
	        }
	 
	        int nextInt() { return Integer.parseInt(next()); }
	 
	        long nextLong() { return Long.parseLong(next()); }
	 
	        double nextDouble()
	        {
	            return Double.parseDouble(next());
	        }
	 
	        String nextLine()
	        {
	            String str = "";
	            try {
	                str = br.readLine();
	            }
	            catch (IOException e) {
	                e.printStackTrace();
	            }
	            return str;
	        }
	    }

//	First-line will contain 2 integers n and Q.
//	Next, n−1 lines contain two integers u and v describing an edge of the tree.
//	Next Q lines describe queries.
//	i-th query starts with an integer k - number of integers in the current query. Then k integers from which you have to find the godfather.v
	
	static int[]parents;
	static int[]levels;
	private static void init(int nodes)
	{
		parents=new int[(nodes+1)];
		levels=new int[(nodes+1)];
		
	}
	
	
	private static void dfs(ArrayList<Integer>[] trees, int child, int parent, int level)
	{
		parents[child]=parent;
		levels[child]=level;
		for(int i=0;i<trees[child].size();i++)
		{
			int subchild=trees[child].get(i);
			if(subchild==parent)
			{
				
			}
			else
			{
				dfs(trees, subchild, child,level+1);
				
			}
		}
	}
	
	
	
	private static void solve(ArrayList<Integer>[] trees, int[] node, int child, int parent)
	{
		HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
		HashSet<Integer>set=new HashSet<Integer>();
		Stack<Integer>path=new Stack<Integer>();
		int nodehl=0;
		int noden=0;
		for(int i=0;i<node.length;i++)
		{
			if(levels[node[i]]>nodehl)
			{
				nodehl=levels[node[i]];
				noden=node[i];
			}
			hm.put(node[i], 1);
			set.add(node[i]);
			
		}
		
		
		
		for(int i=0;i<node.length;i++)
		{
			if(noden==node[i])
			{
				path.add(noden);
			}
			int nodes=node[i];
			
//			for(int jj:hm.keySet())
//			{
////				System.out.print(" "+hm.get(jj));
//			}
//			System.out.println(" ");

			
			while(true)
			{
//				System.out.println("nodes="+nodes);
				if(nodes==1)
				{
					
					
					break;
				}
				else
				{
					
				nodes=parents[nodes];
				if(noden==node[i])
				{
					path.add(nodes);
				}
//				System.out.println(" parent of nodes="+nodes);
				if(hm.containsKey(nodes)==true)
				{
				
					hm.put(nodes, hm.get(nodes)+1);
				}
				}
			}
//			System.out.println();
			
		}
//		System.out.println("hm="+hm.size());
		int tempn=0;
		while(true)
		{
			if(path.size()==0)
			{
				break;
			}
			int n=path.pop();
//			System.out.println("n="+n);
			if(set.contains(n))
			{
//				System.out.println("in="+n);
//				System.out.println("hm="+hm.get(n));
				
			if(hm.get(n)==node.length)
			{
				tempn=n;
			}
			else
			{
				if(tempn==0)
				{
					
				}
				else
				{
					System.out.println(""+tempn);
					return;
					
				}
			}
			}
			
		}

		
		
	
		

		System.out.println("-1");
		
		

	
		
		
	}
	

	
	public static void main(String[] args)
	{
//		Scanner scan=new Scanner(System.in);
        FastReader scan = new FastReader();

		int nodes=scan.nextInt();
		init(nodes);
		int queries=scan.nextInt();
		ArrayList<Integer>[]trees=new ArrayList[(nodes+1)];
		for(int j=0;j<trees.length;j++)
		{
			trees[j]=new ArrayList<Integer>();
		}
		
		for(int i=1;i<trees.length-1;i++)
		{
			int u=scan.nextInt();
			int v=scan.nextInt();
			trees[u].add(v);
		}
		dfs(trees,1,0,0);
//		for(int i=0;i<parents.length;i++)
//		{
//			System.out.print(" "+parents[i]);
//		}
//		System.out.println();
		
		
		for(int i=0;i<queries;i++)
		{
			int n=scan.nextInt();
			int []node=new int[n];
			for(int j=0;j<node.length;j++)
			{
				node[j]=scan.nextInt();
//				System.out.println("+node="+node.length);
//				System.out.print(" "+node[j]);
			}
			
				
			solve(trees,node,1,0);
			
		}
	}
	
	

	


	


	








}
