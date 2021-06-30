package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class C_Yet_Another_Card_Deck
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
	
	static class pair
	{
		int c;
		int i;
		public pair(int c,int i)
		{
			this.c=c;
			this.i=i;
		}
		
	}
	
	static TreeMap<Integer, Integer>[] tm=new TreeMap[51];
	
	public static void main(String[] args)
	{
		for(int i=0;i<tm.length;i++)
		{
			tm[i]=new TreeMap<Integer,Integer>();
		}
			
		FastReader scan=new FastReader();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int q=scan.nextInt();
			int []colors=new int[n];
			int firstcolor=0;
			for(int j=0;i<n;j++)
			{
				colors[j]=scan.nextInt();
				if(j==0)
				{
					firstcolor=colors[j];
				}
				tm[colors[j]].put(j,colors[j]);
		
			}
			
			
			for(int j=0;j<q;j++)
			{
			int c=scan.nextInt();
			for( int keys:tm[c].keySet())
			{
					
			}
				
			}
			
		}

	}

}
