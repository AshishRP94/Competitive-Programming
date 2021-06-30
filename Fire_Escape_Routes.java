package competitive_programming;

//import java.util.Scanner;
import java.util.*;

public class Fire_Escape_Routes 
{
	
	static class edge
	{
		int data;
		int nbr;
		edge(int data,int nbr)
		{
			this.data=data;
			this.nbr=nbr;
		}
		
		
	}
	
	static class pair
	{
		int x;
		int y;
		pair(int x,int y)
		{
			x=this.x;
			y=this.y;
		}
	
	
	}
	
	
	
	private static pair fireescapes(int n, int m, ArrayList<edge>[] graph) 
	{
		
		
		
		int count=0;
		for(int i=0;i<graph.length;i++)
		{
				
				if(graph[i].get(0).nbr==graph[i+1].get(0).data)
				{
					
					graph[i]
				
				}
				
			
		}
			
			
			
		
		
		
		
		
		return null;
	}
		
	
//	The first line of the input contains a single integer T, denoting the number of test cases. 
//	The description of T test cases follows. The first line of each test case contains two space-separated integers N and M, 
//	denoting the number of employees and the number of friendship relations, respectively. 
//	Each of the following M lines contains two space-separated integers i and j, denoting employee i and employee j are friends.

	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int m=scan.nextInt();
			ArrayList<edge>[] graph=new ArrayList[m];//this is an array of arraylist of edges of size m; 
			for(int g=0;g<m;g++)
			{
				
				graph[g]=new ArrayList<>();
			}
			
			
			for(int g=0;g<m;g++)
			{
				graph[g].add(new edge(scan.nextInt(),scan.nextInt()));
			
			}
		
			pair ans=fireescapes(n,m,graph);
		}
	
	
	}



}
