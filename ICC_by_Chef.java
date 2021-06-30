package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ICC_by_Chef
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
	
//	The first line will contain an integer T denoting the total number of Testcases. Then the test cases follow.
//	Each test case contains a single line of input, containing a string X of characters denoting the continents of the coder
	
	private static void solve(String s)
	{
		long maxc=Integer.MIN_VALUE;
		char ans = 0;
		char prev=0;
		long count=0;
		boolean flag=false;
		boolean bool=false;
		
		for(int i=0;i<s.length();i++)
		{
			if(bool==false)
			{
				ans=s.charAt(i);
				bool=true;
				maxc=1;
				prev=s.charAt(i);
				count+=1;
				continue;
			}
			if(s.charAt(i)==prev)
			{
				count+=1;
				if(maxc<count)
				{
					maxc=count;
					ans=s.charAt(i);
				}
			}
			else
			{
				if(maxc<count)
				{
					maxc=count;
					ans=s.charAt(i);
				}
				count=0;
				prev=s.charAt(i);
				count+=1;
			}
		}
		
		System.out.println(""+maxc+" "+ans);
		
	}

	
	
	public static void main(String[] args) throws java.lang.Exception
	{
		FastReader scan=new FastReader();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			String s=scan.nextLine();
			solve(s);
		}
		
		
		

	}


}
