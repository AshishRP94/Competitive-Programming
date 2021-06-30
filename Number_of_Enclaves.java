package competitive_programming;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Number_of_Enclaves {

//	You are given an m x n binary matrix grid, where 0 represents a sea cell and 1 represents a land cell.
//	A move consists of walking from one land cell to another adjacent (4-directionally) land cell or walking off the boundary of the grid.
//	Return the number of land cells in grid for which we cannot walk off the boundary of the grid in any number of moves.
	
	static class trio
	{
		int x;
		int y;
		public trio(int x,int y)
		{
			this.x=x;
			this.y=y;
		}
		
	}
	
	private static int isvalid(int[][] grid, int i, int j)
	{
        //zero		
		if(grid[i][j]==0)
		{
			return 2;
		}
		
        //exit		
		if(i>grid.length || i<0 ||j<0||j>grid[0].length)
		{
			return 1;
			
		}
		//one
		return 0;
		
	}

	
	
	static int count=0;
	static boolean[][] visited;
	public Number_of_Enclaves(int h, int w)
	{
		visited=new boolean[h][w];
	}
	
	
	private static void bfs(int[][] grid, int i, int j)
	{
		int depth=1;
		Queue<trio> queue=new LinkedList<>();
		queue.add(new trio(i,j));
		while(true)
		{
			if(queue.isEmpty()==false)
			{
				break;
			}
			trio t=queue.poll();
			int []di= {0,1,0,-1};
			int []dj= {1,0,-1,0};
			for(int k=0;k<di.length;k++)
			{
				int ans=isvalid(grid,t.x+di[k],t.y+dj[k]);
				if(ans==0 && visited[t.x+di[k]][t.y+dj[k]]==false)
				{
					queue.add(new trio(t.x+di[k],t.y+dj[k]));
					depth+=1;
					visited[t.x+di[k]][t.y+dj[k]]=true;
				}
				else if(ans==1 &&visited[t.x+di[k]][t.y+dj[k]]==false)
				{
					visited[t.x+di[k]][t.y+dj[k]]=true;
					
				}
				else
				{
					visited[t.x+di[k]][t.y+dj[k]]=true;
					count+=depth;
					break;
				}
			}
			
			
		}
		
	}
		
	



	private static void exit_path(int[][] grid)
	{
		for(int i=0;i<grid.length;i++)
		{
			for(int j=0;j<grid[0].length;j++)
			{
				if(grid[i][j]==1)
				{
					bfs(grid,i,j);
				}
			}
		}
		
	}
	
	


	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int h=scan.nextInt();
			int w=scan.nextInt();
			Number_of_Enclaves obj=new Number_of_Enclaves(h,w);
			int [][]grid=new int[h][w];
			for(int j=0;j<h;j++)
			{
				for(int k=0;k<w;k++)
				{
					grid[j][k]=scan.nextInt();
				}
			}
			exit_path(grid);
			System.out.println(" "+count);
			
		}
	}



}
