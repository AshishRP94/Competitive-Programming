package competitive_programming;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class C_King_Path 
{

//	The first line contains four space-separated integers x0, y0, x1, y1 (1 ≤ x0, y0, x1, y1 ≤ 109), 
//	denoting the initial and the final positions of the king.
//
//	The second line contains a single integer n (1 ≤ n ≤ 105), denoting the number of segments of allowed cells. Next n lines contain the descriptions of these segments. The i-th line contains three space-separated integers ri, ai, bi (1 ≤ ri, ai, bi ≤ 109, ai ≤ bi), denoting that cells in columns from number ai to number bi inclusive in the ri-th row are allowed.
//	Note that the segments of the allowed cells can intersect and embed arbitrarily.
//
//	It is guaranteed that the king's initial and final position are allowed cells. 
//	It is guaranteed that the king's initial and the final positions do not coincide.
//	It is guaranteed that the total length of all given segments doesn't exceed 105.
	
	static class trio
	{
		int i=0;
		int j=0;
		int steps=0;
		public trio(int i,int j,int steps)
		{
			this.i=i;
			this.j=j;
			this.steps=steps;
		}
	}
	
	static class pair
	{
		int i=0;
		int j=0;
		public  pair(int i,int j)
		{
			this.i=i;
			this.j=j;
		}
	}
	

	
	
	private static void find_shorest_path(HashMap<pair, Integer> hm, HashSet<pair> set, pair s, pair d, HashSet<pair> vis) 
	{
		hm.put(s, 0);
		Queue<pair>queue=new ArrayDeque<>();
		queue.add(s);
		int []di={1,1,1,0,0,-1,-1,-1};
		int []dj={-1,0,1,-1,1,-1,0,1};
		while(true)
		{
			if(queue.size()==0)
			{
				break;
			}
			pair p=queue.poll();
			vis.add(p);
			for(int j=0;j<8;j++)
			{
				int x=p.i+di[j];
				int y=p.j+dj[j];
				pair tv=new pair(x,y);
				if(set.contains(tv)==true && vis.contains(tv)==false)
				{
					vis.add(tv);
					hm.put(tv, hm.get(p)+1);
					queue.add(tv);
				}
			}
			
		}
		
		if(hm.containsKey(d)==true)
		{
			System.out.println(hm.get(d));
			
		}
		else
		{
			System.out.println(-1);
			
		}
	}




	public static void main(String[] args)
	{
		HashMap<pair,Integer>hm=new HashMap<pair,Integer>();
		Scanner scan=new Scanner(System.in);
		int kingx=scan.nextInt();
		int kingy=scan.nextInt();
		int destx=scan.nextInt();
		int desty=scan.nextInt();
		pair s=new pair(kingx,kingy);
		pair d=new pair(destx,desty);
		HashSet<pair> set=new HashSet<>(); 
		HashSet<pair> vis=new HashSet<>(); 
		int n=scan.nextInt();
		for(int i=0;i<n;i++)
		{
			int r=scan.nextInt();
			int a=scan.nextInt();
			int b=scan.nextInt();
			for(int j=a;j<=b;j++)
			{
				set.add(new pair(r,j));
			}
			
		}
		find_shorest_path(hm,set,s,d,vis);
	}






}
