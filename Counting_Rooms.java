package competitive_programming;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



public class Counting_Rooms {
	
	static class pair
	{
		int i;
		int j;
		pair(int i,int j)
		{
			this.i=i;
			this.j=j;
		}
		
	}
	
	private static boolean isvalid(char[][] map, int i,int j)
	{
		pair p = null;
		p.i=i;
		p.j=j;
		if((p.i>map.length)||(p.i<0 )||(map[p.i][p.j]=='#')||(p.j<0)||(p.j>map[0].length))
		{
			return false;
			
			
		}
		
		
		return true;
	}
	
	
	static boolean [][]mapv;
	private static void bfs_practice(char[][] map, int i, int j)
	{
		mapv=new boolean[map.length][map[0].length];
		Queue<pair> queue = new LinkedList<>();
		queue.add(new pair(i,j));
		while(queue.isEmpty()==false)
		{
			pair p=queue.poll();
			if(isvalid(map,p.i+1,p.j)==true && mapv[p.i+1][p.j]==false)
			{
				queue.add(new pair(p.i+1,p.j));	
				mapv[p.i+1][p.j]=true;
			}
			else if(isvalid(map,p.i-1,p.j)==true && mapv[p.i-1][p.j]==false)
			{
				queue.add(new pair(p.i-1,p.j));	
				mapv[p.i-1][p.j]=true;
				
			}
			else if(isvalid(map,p.i,p.j+1)==true && mapv[p.i][p.j+1]==false)
			{
				
				queue.add(new pair(p.i,p.j+1));	
				mapv[p.i][p.j+1]=true;
			}
			else
			{
				if(isvalid(map,p.i,p.j-1)==true && mapv[p.i][p.j-1]==false)
				{
					queue.add(new pair(p.i,p.j-1));	
					mapv[p.i][p.j-1]=true;
				}
			}
		}
		
		
	}
	
	





	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int h=scan.nextInt();
		int w=scan.nextInt();
		char [][]map=new char[h][w];
		for(int i=0;i<h;i++)
		{
			for(int j=0;j<w;j++)
			{
				map[i][j]=scan.next().charAt(0); 
			}
		}
		int count=0;
		for(int i=0;i<map.length;i++)
		{
			for(int j=0;j<map[0].length;j++)
			{
			if(map[i][j]=='.' && mapv[i][j]==false)
			{
				count+=1;
				bfs_practice(map,i,j);
			
			}
			}
		
		}
		System.out.print(""+count);

	}



}
