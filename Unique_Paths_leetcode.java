package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Unique_Paths_leetcode {
	
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
	
	static int [][]dp;
	private static void init(int n, int m)
	{
		dp=new int[n][m];
		for(int i=0;i<dp.length;i++)
		{
			for(int j=0;j<dp[0].length;j++)
			{
				dp[i][j]=-1;
			}
		}
		
	}
	
	
	private static int upaths(int n, int m, int i, int j)
	{
		
		if(i>=n ||j>=m ||i<0 ||j<0)
		{
			return 0;
		}
		
		if(i==n-1 && j==m-1)
		{
			return 1;
		}
		
		
		int count1=0,count2=0,count3=0,count4=0;
		
		 count1+=upaths(n, m, i, j+1);//right
		 count2+=upaths(n, m, i+1, j);//down
		 count3+=upaths(n, m, i-1, j);//up
		 count4+=upaths(n, m, i, j-1);//left
		
		return (count1+count2+count3+count4);
	
	}

	public static void main(String[] args)
	{
		FastReader scan=new FastReader();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int m=scan.nextInt();
			init(n,m);
			upaths(n,m,0,0);
		}
	}




}
