package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Decode_Ways_leetcode {

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
	private static void init(int length)
	{
		dp=new int[length];
		for(int i=0;i<dp.length;i++)
		{
			dp[i]=-1;
		}
	}
	
	
	private static int decode(String s, int i)
	{
		if(i>=s.length())
		{
			return 1;
		}
		
		if(dp[i]!=-1)
		{
			return dp[i];
		}

		int cp=Integer.parseInt(s.valueOf(s.charAt(i)));
		
		
		int count=0;
		if(cp>=1 && cp<=26)
		{
			count+=decode(s, i+1);
		}
		
	
		
		if(i+1>(s.length()-1) || cp==0)
		{
			return count;
		}
		
		int cn=Integer.parseInt(s.valueOf(s.charAt((i+1))));
		int temp=((cp*10)+cn);
		int count1=0;
		if(temp>=1 && temp<=26)
		{
			count1+=decode(s, i+2);
		}
		
		
		return dp[i]=count+count1;
		
	}
	

	public static void main(String[] args)
	{
		FastReader scan=new FastReader();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			String s=scan.nextLine();
			int count=decode(s,0);
			init(s.length());
			System.out.println(""+count);
			
		}
	}






}
