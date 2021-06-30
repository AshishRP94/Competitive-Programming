package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A_New_Year_Transportation
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

//	The first line contains two space-separated integers n (3 ≤ n ≤ 3 × 104) and t (2 ≤ t ≤ n) — the number of cells,
//	and the index of the cell which I want to go to.
	
//	The second line contains n - 1 space-separated integers a1, a2, ..., an - 1 (1 ≤ ai ≤ n - i).
//	It is guaranteed, that using the given transportation system, one cannot leave the Line World.
	
	static class pair
	{
		int x=0;
		int y=0;
		public pair(int x,int y)
		{
			this.x=x;
			this.y=y;
		}
	}
	
	private static void bfs(int[] temp, int cells, int dest)
	{
		   Queue<pair> queue = new LinkedList<>();
		   int i=1;
		   boolean flag=false;
		   queue.add(new pair(1,temp[i]));
		   while(true)
		   {
			   if(queue.size()==0)
			   {
				 break;
			   }
			   pair p=queue.poll();
			   if((temp[i]+p.x)==dest)
			   {
				   flag=true;
				   break;
			   }
			   else if(temp[i]+p.x>dest)
			   {
				   flag=false;
				   break;
			   }
			   else
			   {
				   queue.add(new pair(temp[i]+p.x,temp[i]));
				   i+=1;
			   }
			   
			}
		   
		   if(flag==true)
		   {
			   System.out.println("YES");
		   }
		   else
		   {
			   System.out.println("NO");
		   }
		   
	}
	
	
	public static void main(String[] args)
	{
		FastReader scan=new FastReader();
		int cells=scan.nextInt();
		int dest=scan.nextInt();
		
		int []temp=new int[(cells+1)];
		for(int i=1;i<temp.length;i++)
		{
			temp[i]=scan.nextInt();
		}
		bfs(temp,cells,dest);
	}



}
