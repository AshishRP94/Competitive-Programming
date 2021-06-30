package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class B_The_Cake_Is_a_Lie
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
	
	static class trio
	{
		int steps;
		int y;
		int z;
		trio(int steps ,int y,int z)
		{
			this.steps=steps;
			this.y=y;
			this.z=z;
		}
		
		
		
	}
	
	private static boolean isvalid(int i, int j, int n, int m)
	{
		if(i<0 ||i>n ||j<0 ||j>m)
		{
			return false;
		}
		
		return true;
		
	}
	
	private static String bfs(int n,int m,int steps)
	{
		   Queue<trio> queue = new LinkedList<>();
		   
		   boolean [][]visited=new boolean[(100+2)][(100+2)];
		   queue.add(new trio(0,1,1));
		   int []di= {0,1};
		   int []dj= {1,0};
		   
		   
		   
		   while(true)
		   {
			   if(queue.isEmpty()==true)
			   {
				   break;
			   }
			   trio t=queue.poll();
			  int i= t.y;
			  int j= t.z;
			  
		
			  
			  if(i==n && j==m)
			  {
				  
				  
			  
			  if(t.steps==steps) 
			  {
				  return "YES";
			  }
			  else
			  {
//				  return false;
				  return "NO";
			  }
			  }
			  

			  
			  for(int k=0;k<di.length;k++)
			  {
				
					  
				  int t1=(i+di[k]);
				  int t2=(j+dj[k]);
				  

				
				  if(isvalid(t1,t2,100+1,100+1)==true && (visited[t1][t2]==false))
				  {
					  visited[t1][t2]=true;
				
					  if(k==0)
					  {
						  queue.add(new trio(t.steps+i,t1,t2)); 
					  }
					  else
					  {
						  queue.add(new trio(t.steps+j,t1,t2)); 						  
					  }
				  }
				  
				  
				  
			  }
//			  System.out.println();
		}
		   
		return "NO";
		
		
	}
	
//	6
//	1 1 0
//	2 2 2
//	2 2 3
//	2 2 4
//	1 4 3
//	100 100 10000
	
//	YES
//	NO
//	YES
//	NO
//	YES
//	NO



	
	public static void main(String[] args)
	{
		int n=0;
		int m=0;
		int steps=0;
		FastReader scan=new FastReader();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			n=scan.nextInt();
			m=scan.nextInt();
			steps=scan.nextInt();
			if(n==1 && m==1)
			{
				if(steps==0)
				{
					System.out.println("YES");
				}
				else
				{
					System.out.println("NO");
				}
				
			}
			else
			{
				
			System.out.println(bfs(n,m,steps));
			
			}
			
		}
		

	}

}
