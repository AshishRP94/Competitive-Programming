package competitive_programming;

import java.util.ArrayList;
import java.util.Scanner;

public class Red_blue_Trees {

//	The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
//	The first line of each test case contains a single integer N.
//	N−1 lines follow. Each of these lines contains two space-separated integers u and v denoting that vertices u and v are connected by an edge.
//	The last line contains a string S with length N. For each valid i, the i-th character of this string is either '0' if the i-th vertex is initially red or '1' if it is initially blue.
	
	private static void convert_tree_into_red_blue_tree(ArrayList<Integer>[] trees, int[] colors) 
	{
		
		
		
	}
	
	
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int edges=scan.nextInt();
			ArrayList<Integer>[]trees=new ArrayList[edges];
			for(int j=0;j<trees.length;j++)
			{
				int u=scan.nextInt();
				int v=scan.nextInt();
				trees[u].add(v);
			}
			int []colors=new int[trees.length];
			int red=0;
			int blue=0;
			for(int j=0;j<colors.length;j++)
			{
				colors[j]=scan.nextInt();
				if(colors[j]==0)
				{
					red+=1;
				}
				else
				{
					blue+=1;
				}
			
			}
			convert_tree_into_red_blue_tree(trees,colors);
			
			
		}
		

	}


}
