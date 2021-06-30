package competitive_programming;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Snakes_and_transition_from_Capitalism_to_Socialism
{
	
	static boolean [][]equals;
	private static void initalize(int n, int m)
	{
		equals=new boolean[n][m];
	}
	
	static class trio
	{
		int x;
		int y;
		int maxwealth;
		public trio(int x,int y,int maxwealth)
		{
			this.x=x;
			this.y=y;
			this.maxwealth=maxwealth;
		}
	}
	

	private static void bfs(int[][] houses)
	{
		Queue<trio>queue=new LinkedList<>();
		
		queue.add(0,0,1);
		
	}
	
	
	
	private static void find_min_hours(int n, int m, int[][] houses)
	{
		for(int i=0;i<houses.length;i++)
		{
			for(int j=0;j<houses[0].length;j++)
			{
				if(houses[][])
				
			}
		}
		
	}
	
	




	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		int n=scan.nextInt();
		int m=scan.nextInt();
		initalize(n,m);
		int [][]houses=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				houses[i][j]=scan.nextInt();
			}
		}
		find_min_hours(n,m,houses);
		
		

	}







}
