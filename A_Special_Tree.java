package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class A_Special_Tree
{
	
	
	static class FastReader
	{
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
	
	static int []levels;
	static int [][]parents;
	public static void init (int n)
	{
		levels=new int[n];
		parents=new int[n][18];
	}
	
	private static void dfs(ArrayList<Integer>[] trees, int child, int parent,int level)
	{
		if(levels[child]!=0)
		{
			levels[child]=level;
		}
		
		for(int i=0;i<18;i++)
		{
			int prevparent=parents[child][i-1];
			parents[child][i]=parents[prevparent][i-1];
		}
		
		
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
	
	private static int kth_parent_node(int[][] parents, int diff, int node)
	{
		int count=0;
		while(true)
		{
			if(diff<=0)
			{
				break;
			}
			
			if((diff&1)==1)
			{
				node=parents[node][count];
			}
			diff=(diff>>1);	
			count+=1;
		}
		
		return node;		
	}
	
	
	private static int lca_bin_lifting(int[] levels, int[][] parents, int node1, int node2)
	{
		int n1l=levels[node1];
		int n2l=levels[node2];
		
		int node;
		
		int diff=0;
		if(n1l>n2l)
		{
			diff=n1l-n2l;
			node=n1l;
			node1=kth_parent_node(parents,diff,node);
			if(node1==node2)
			{
				return node1;
			}
			
			for(int i=17;i>=0;i++)
			{
				if(parents[node1][i]!=parents[node2][i])
				{
					node1=parents[node1][i];
					node2=parents[node2][i];
				}
				
			}
			return parents[node1][0];
		}
		else
		{
			diff=n2l-n1l;
			node=n2l;
			node2=kth_parent_node(parents,diff,node2);
			if(node2==node1)
			{
				return node2;
				
			}
			
			for(int i=17;i>=0;i++)
			{
				if(parents[node1][i]!=parents[node2][i])
				{
					node1=parents[node1][i];
					node2=parents[node2][i];
				}
				
			}
			return parents[node1][0];
		
		}
		
		
		
	
	
	
	
	
	}
	

	
	public static void main(String args[])
	{
		
	FastReader scan=new FastReader();
	int t=scan.nextInt();
	for(int i=0;i<t;i++)
	{
		int n=scan.nextInt();
		int k=scan.nextInt();
		int a=scan.nextInt();
		int []sp=new int[k];
		
		for(int j=0;j<k;j++)
		{
			sp[j]=scan.nextInt();
		}
		
		
		ArrayList<Integer>[]tree=new ArrayList[n];
		for(int j=0;j<tree.length;j++)
		{
			tree[j]=new ArrayList<Integer>();
		}
		for(int j=0;j<n-1;j++)
		{
			int u=scan.nextInt();
			int v=scan.nextInt();
			tree[u].add(v);
		}
		
		
	}
	}


}
