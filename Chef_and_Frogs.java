package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Chef_and_Frogs
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
	
	static int []dp;
	private static void init(int n)
	{
		dp=new int[(n+1)];
		for(int i=0;i<dp.length;i++)
		{
			dp[i]=-1;
		}
	}

	
	private static void find(long[] xaxis, int distance, long x, long y)
	{
		
		
	}
	

//	The first line contains three integers N, K and P.
//	The second line contains N space-separated integers A1, A2, …, AN denoting the x-coordinates of frogs".
//	Each of the next P lines contains two integers A and B denoting the numbers of frogs according to the input.
	public static void main(String[] args)
	{
		FastReader scan=new FastReader();
		int n=scan.nextInt();
		int distance=scan.nextInt();
		int p=scan.nextInt();

		init(n);
		HashMap<Integer,ArrayList<Integer>> hm = new HashMap<Integer, ArrayList<Integer>>();
		long []xaxis=new long[(n+1)];
		for(int i=1;i<xaxis.length;i++)
		{
			xaxis[i]=scan.nextLong();
			hm.put(, );
		}
		for(int j=0;j<p;j++)
		{
			long x=scan.nextLong();
			long y=scan.nextLong();
			find(xaxis,distance,x,y);
		}
	
	}





}
