package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C_Double_ended_Strings
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
	
	static int [][]dp;
	private static void init(int l, int l2)
	{
		dp=new int[l][l2];
		for(int i=0;i<dp.length;i++)
		{
			for(int j=0;j<dp[0].length;j++)
			{
				dp[i][j]=-1;
			}
		}
	}

	
	
	private static void equal(String a, String b, int i, int j)
	{
		if(i>=a.length())
		{
			
			
			return;
		}
		
		if(j>=b.length())
		{
			
			return;
		}
		
		if(a.charAt(i)==b.charAt(j))
		{
			equal(a, b, i, j);
		}
		
		
		equal(a, b, i, j);
	
	
	}

	
	
	public static void main(String[] args)
	{
		FastReader scan=new FastReader();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			String a=scan.nextLine();
			String b=scan.nextLine();
			init(a.length(),b.length());
			equal(a,b,0,0);
		}
	}




}
