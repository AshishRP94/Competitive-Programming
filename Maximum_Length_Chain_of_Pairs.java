package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Maximum_Length_Chain_of_Pairs
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
		int x=0;
		int y=0;
		public pair(int x,int y)
		{
			this.x=x;
			this.y=y;
		}
	}
	
	static int []dp;
	private static void init(int length)
	{
		dp=new int[(length+1)];
		for(int i=0;i<dp.length;i++)
		{
			dp[i]=-1;
		}
		
		
	}
	
	
	private static int find_longest(pair[] pairs, int i, int count)
	{
		if(i>pairs.length)
		{
			return 0;
		}
		if(i==pairs.length-1)
		{
			return count;
		}
			
		
		int pick=0;
		int non_pick=0;
		
		if(pairs[i].y<pairs[i+1].x)
		{
			pick+=find_longest(pairs,i+1,count+1);
		}
		
		non_pick+=find_longest(pairs, i+1,count);
		
		
		
		return Math.max(non_pick,pick);
		
	}

//	{{5, 24}, {39, 60}, {15, 28}, {27, 40}, {50, 90} }
	public static void main(String[] args)
	{
		FastReader scan=new FastReader();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			pair []pairs=new pair[n];
			
			for(int j=0;j<pairs.length;j++)
			{
				int x=scan.nextInt();
				int y=scan.nextInt();
				pair p=new pair(x,y);
				pairs[j]=p;
				init(pairs.length);
				int ans=find_longest(pairs,0,0);
				System.out.println(""+ans);
			}
		}

	}




}
