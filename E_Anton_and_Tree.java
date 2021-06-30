package competitive_programming;

import java.util.ArrayList;
import java.util.Scanner;

public class E_Anton_and_Tree {

//	The first line of the input contains a single integer n (1 ≤ n ≤ 200 000) — the number of vertices in the tree.
//	The second line contains n integers colori (0 ≤ colori ≤ 1) — colors of the vertices. colori = 0 
//	means that the i-th vertex is initially painted white, while colori = 1 means it's initially painted black.
//	Then follow n - 1 line, each of them contains a pair of integers ui and vi (1 ≤ ui, vi ≤ n, ui ≠ vi) —
//	indices of vertices connected by the corresponding edge. It's guaranteed that all pairs (ui, vi) are distinct, i.e. there are no multiple edges.
	
	
	
	private static void paint(ArrayList<Integer>[] trees, int[] colors, int paint, int child, int parent)
	{

//		System.out.println("child="+child);
//		System.out.println("size="+trees[child].size());
		for(int i=0;i<trees[child].size();i++)
		{
			int subchild=trees[child].get(i);
//			System.out.println("subchild="+subchild+"|colors="+colors[subchild]);
	
			if(subchild==parent)
			{
				
			}
			else
			{
				if(colors[subchild]==paint)
				{
					
					paint(trees,colors,paint,subchild,child);
					if(paint==0)
					{
						colors[subchild]=1;
						
					}
					else
					{
						colors[subchild]=0;
						
					}
				}
			}
		
		}
		
		
	}
	
	
	
	
	static int countb=0;
	
	private static void dfsblack(ArrayList<Integer>[] trees, int nodes, int[] colors, int child, int parent)
	{
		
		if(colors[child]==0)
		{
//			System.out.println("child"+child);
			paint(trees,colors,0,child,parent);
			colors[child]=1;
			countb+=1;
		}
		
		
		for(int i=0;i<trees[child].size();i++)
		{
			int subchild=trees[child].get(i);
			if(subchild==parent)
			{
				
				
			}
			else
			{
				dfsblack(trees, nodes, colors, subchild, child);
			}
			
			
		}
	}
	

	static int countw=0;
	private static void dfswhite(ArrayList<Integer>[] trees, int nodes, int[] colors2, int child, int parent)
	{
		
		System.out.println("hi");
		if(colors2[child]==1)
		{
			System.out.println("child="+child);
			System.out.println("colors="+colors2[child]);
			paint(trees,colors2,1,child,parent);
			colors2[child]=0;
			countw+=1;
			System.out.println("countw"+countw);
			
		}
		
		for(int i=0;i<trees[child].size();i++)
		{
			int subchild=trees[child].get(i);
			if(subchild==parent)
			{
				
				
			}
			else
			{
				dfsblack(trees, nodes, colors2, subchild, child);
			}
			
			
		}
		
		
		
		
	}
	

	


	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int nodes=scan.nextInt();
		ArrayList<Integer>[]trees=new ArrayList[nodes+1];
		for(int i=0;i<trees.length;i++)
		{
			trees[i]=new ArrayList<Integer>();
		}
		int []colors1=new int[nodes+1];
		int []colors2=new int[nodes+1];
		for(int i=1;i<nodes+1;i++)
		{
			
//			1=black
//			0=white
			colors1[i]=scan.nextInt();
			colors2[i]=colors1[i];
		}
		

		
		for(int i=0;i<nodes-1;i++)
		{
			int u=scan.nextInt();
			int v=scan.nextInt();
			trees[u].add(v);
		}
		dfsblack(trees,nodes,colors1,1,0);
		dfswhite(trees,nodes,colors2,1,0);
		if(countw>countb)
		{
			
			System.out.println(""+countb);
		}
		else
		{
			System.out.println(""+countw);
			
		}
		System.out.println(""+countb);
	
	}


	




}
