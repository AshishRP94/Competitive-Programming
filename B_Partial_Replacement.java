package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_Partial_Replacement
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
		int i=0;
		int d=0;
		public pair(int i,int d)
		{
			this.i=i;
			this.d=d;
		}
		
	}
	
	private static void convert(String s, int k)
	{
		int t1=0;
		int t2=0;
		int count=0;
		pair []track=new pair[s.length()];
		int t=0;
		int d=0;
		for(int i=0;i<track.length;i++)
		{
			if(s.charAt(i)=='*')
			{
				
			}
			
		}
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='*')
			{
				if((count&1)==0)
				{
					t1=i;
				}
				else
				{
					t2+=i;
				}
				count+=1;
			}
		}
		
	}


	public static void main(String[] args)
	{
		FastReader scan=new FastReader();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int k=scan.nextInt();
			String s=scan.nextLine();
			convert(s,k);
		}

	}

}
