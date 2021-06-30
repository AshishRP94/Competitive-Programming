package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Common_Substring
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
	
	static Long [][]dp;
	private static void init(int l1, int l2)
	{
		dp=new Long[(l1+5)][(l2+5)];
	}
	
	
	private static long find_substring(String a, String b, int i, int j)
	{
//		System.out.println("i="+i+"j="+j);
		if(i>=a.length() || j>=b.length())
		{
			return 0;
		}
		
		if(dp[i][j]!=null)
		{
			return dp[i][j];
		}
		
		
		if(a.charAt(i)==b.charAt(j))
		{
			return dp[i][j]=(long)(1+find_substring(a, b, i+1, j+1));
		}
		else
		{
			long left=find_substring(a, b, i+1, j);
			long right=find_substring(a, b, i, j+1);
			return dp[i][j]=(long)Math.max(left,right);
		}
		
	}
	

	public static void main(String[] args) throws java.lang.Exception
	{
		FastReader scan=new FastReader();
	
			String a=scan.nextLine();
			String b=scan.nextLine();
			init(a.length(),b.length());
			long ans=find_substring(a,b,0,0);
			System.out.println(ans);
		
			

	}






}
